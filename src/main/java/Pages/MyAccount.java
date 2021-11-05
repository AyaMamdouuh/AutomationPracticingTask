package Pages;

import Base.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount  extends base {
    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    WebElement myaccount;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    WebElement UserName;


    public WebElement getMyaccount() {
        return myaccount;
    }
    public WebElement getUserName(){return UserName;}
}