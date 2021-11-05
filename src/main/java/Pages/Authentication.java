package Pages;

import Base.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication extends base {

    @FindBy(id="email_create")
    WebElement Email;

    @FindBy(id="SubmitCreate")
    WebElement SubmitButton;
    @FindBy(id="create_account_error")
    WebElement ErrorMsg;


    @FindBy(id="email")
    WebElement emailLogin;

    @FindBy(id="passwd")
    WebElement passLogin;
    @FindBy(id="SubmitLogin")
    WebElement submitLogin;
    @FindBy(xpath ="//*[@id='center_column']/div[1]/ol/li[1]")
    WebElement LoginErrorMsg;

    public void enterTheEmail(String mail)
    {
        Email.sendKeys(mail);
    }
    public Signup clickOnSubmitButton()
    {
        SubmitButton.click();
        return new Signup();
    }
    public WebElement getErrorMsg()
    {
        return ErrorMsg;
    }

    public void enterEmail(String mail)
    {
        emailLogin.sendKeys(mail);
    }
    public void enterPassword(String pass)
    {
        passLogin.sendKeys(pass);
    }
    public MyAccount clickOnLogin()
    {
        submitLogin.click();
        return new MyAccount();
    }
    public WebElement getLoginErrorMsg(){return LoginErrorMsg;}
    public WebElement getLoginButton(){return submitLogin;}
    public WebElement getSubmitButton(){return SubmitButton; }
}

