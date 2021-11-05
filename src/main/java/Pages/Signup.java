package Pages;

import Base.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Signup extends base {
    @FindBy(id="id_gender1")
    WebElement Mr;
    @FindBy(id="id_gender2")
    WebElement Mrs;
    @FindBy(id="customer_firstname")
    WebElement firstName;
    @FindBy(id="customer_lastname")
    WebElement lastName;
    @FindBy(id="passwd")
    WebElement password;
    @FindBy(id="days")
    WebElement days;
    @FindBy(id="months")
    WebElement months;
    @FindBy(id="years")
    WebElement years;
    @FindBy(id="newsletter")
    WebElement newLetter;
    @FindBy(id="optin")
    WebElement offers;
    @FindBy(id="company")
    WebElement company;
    @FindBy(id="address1")
    WebElement address1;
    @FindBy(id="city")
    WebElement city;
    @FindBy(id="id_state")
    WebElement state;
    @FindBy(id="postcode")
    WebElement postcode;
    @FindBy(id="id_country")
    WebElement country;
    @FindBy(id="other")
    WebElement additionalInformation;
    @FindBy(id="phone")
    WebElement Hphone;
    @FindBy(id="phone_mobile")
    WebElement mobile;
    @FindBy(id="submitAccount")
    WebElement submitButton;
    @FindBy(xpath="//*[@id=\"center_column\"]/div/ol/li[1]")
    WebElement ErrorMsg;



    public void clickOnMr()
    {
        Mr.click();
    }
    public void clickOnMrs()
    {
        Mrs.click();
    }
    public void enterFirstName(String fname)
    {
        firstName.sendKeys(fname);
    }
    public void enterLastName(String lname)
    {
        lastName.sendKeys(lname);
    }
    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }
    public void SelectDay(String Day)
    {
        Select day =new Select(days);
        day.selectByValue(Day);
    }

    public void SelectMonth(String Month)
    {
        Select Months =new Select(months);
        Months.selectByValue(Month);
    }

    public void SelectYear(String Year)
    {
        Select Years =new Select(years);
        Years.selectByValue(Year);
    }
    public void enterAddress1(String address)
    {
        address1.sendKeys(address);
    }

    public void enterCity(String City)
    {
        city.sendKeys(City);
    }
    public void chooseState(String State)
    {
        Select stt= new Select(state);
        stt.selectByValue(State);
    }
    public void enterPostCode(String postCode)
    {
        postcode.sendKeys(postCode);
    }
    public void chooseCountry(String Country)
    {
        Select ctry= new Select(country);
        ctry.selectByValue(Country);
    }
    public void enterMobile(String Mobile)
    {
        mobile.sendKeys(Mobile);
    }
    public MyAccount clickOnSubmit()
    {
        submitButton.click();
        return new MyAccount();
    }
    public void clickOnNewLetter()
    {
        newLetter.click();
    }
    public void clickOnOffers()
    {
        offers.click();
    }

    public void enterCompany(String Company)
    {
        company.sendKeys(Company);
    }
    public void enterAdditionalInformation(String info)
    {
        additionalInformation.sendKeys(info);
    }

    public void enterHomePhone(String phone)
    {
        Hphone.sendKeys(phone);
    }
    public WebElement getErrorMsg()
    {
        return ErrorMsg;
    }
    public WebElement getSubmitButton(){return submitButton; }
}
