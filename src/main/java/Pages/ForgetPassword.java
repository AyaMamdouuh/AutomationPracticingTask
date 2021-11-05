package Pages;

import Base.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPassword extends base {
@FindBy(xpath ="//*[@id='center_column']/div/h1")
    WebElement forgotPasswordPage;

@FindBy(id="email")
WebElement email;

@FindBy(xpath="//*[@id=\"form_forgotpassword\"]/fieldset/p/button")
WebElement submitButton;
@FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
WebElement confirmationMSG;

public WebElement getForgotPasswordPage()
{

    return forgotPasswordPage;
}

public void enterTheEmail(String mail)
{
    email.sendKeys(mail);
}
public void clickOnSubmitButton()
{
    submitButton.click();
}

public WebElement getConfirmationMSG()
{
    return confirmationMSG;
}
}
