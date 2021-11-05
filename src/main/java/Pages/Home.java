package Pages;

import Base.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends base {

    /*Inspection */
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signinButton;
    /*Actions*/
    public Authentication clickOnSignInButton()
    {
        signinButton.click();
        return new Authentication();
    }
}

