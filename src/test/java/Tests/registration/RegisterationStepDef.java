package Tests.registration;

import Base.base;
import Pages.Home;
import Pages.Authentication;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
public class RegisterationStepDef extends base {


    @When("User enter {string}")
    public void userEnter(String mail) {
        automationPractcing.authentication.enterTheEmail(data_properties.getProperty(mail));
    }

    @And("User click on Create new account button")
    public void userClickOnCreateNewAccountButton() {
        automationPractcing.signup=automationPractcing.authentication.clickOnSubmitButton();
    }

    @Then("Signup page open successfully")
    public void signupPageOpenSuccessfully() throws InterruptedException {
        Thread.sleep(8000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
    }

    @Then("Error message appear with text {string}")
    public void errorMessageAppearWithText(String msg) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(automationPractcing.authentication.getErrorMsg().isDisplayed());
        Assert.assertEquals(automationPractcing.authentication.getErrorMsg().getText(),msg_properties.getProperty(msg));
    }

    @When("User Choose the gender {string}")
    public void userChooseTheGender(String title) {
        if(data_properties.getProperty(title).equals("Mr."))
        {
            automationPractcing.signup.clickOnMr();
        }
        else if(data_properties.getProperty(title).equals("Mrs."))
        {
            automationPractcing.signup.clickOnMrs();
        }
    }

    @And("User enter the First Name as {string}")
    public void userEnterTheFirstNameAs(String FName) {
        automationPractcing.signup.enterFirstName(data_properties.getProperty(FName));
    }

    @And("User enter the Last Name as {string}")
    public void userEnterTheLastNameAs(String LName)
    {
        automationPractcing.signup.enterLastName(data_properties.getProperty(LName));

    }
    @And("User enter the Password as {string}")
    public void userEnterThePasswordAs(String pass) {
        automationPractcing.signup.enterPassword(data_properties.getProperty(pass));
    }

    @And("Choose the Day as {string}")
    public void chooseTheDayAs(String day) {
        automationPractcing.signup.SelectDay(data_properties.getProperty(day));
    }


    @And("Choose the Month as {string}")
    public void chooseTheMonthAs(String Month) {
        automationPractcing.signup.SelectMonth(data_properties.getProperty(Month));
    }

    @And("Choose the year as {string}")
    public void chooseTheYearAs(String Year) {
        automationPractcing.signup.SelectYear(data_properties.getProperty(Year));
    }

    @And("User enter Address{int} as {string}")
    public void userEnterAddressAs(int arg0, String address) {
        automationPractcing.signup.enterAddress1(data_properties.getProperty(address));
    }

    @And("User enter City as a {string}")
    public void userEnterCityAsA(String city)
    {
        automationPractcing.signup.enterCity(data_properties.getProperty(city));

    }

    @And("User choose State as {string}")
    public void userChooseStateAs(String state)
    {
        automationPractcing.signup.chooseState(data_properties.getProperty(state));
    }

    @And("User enter PostCode as {string}")
    public void userEnterPostCodeAs(String postcode)
    {
        automationPractcing.signup.enterPostCode(data_properties.getProperty(postcode));
    }

    @And("User Choose Country as {string}")
    public void userChooseCountryAs(String country)
    {
        automationPractcing.signup.chooseCountry(data_properties.getProperty(country));
    }

    @And("User enter Mobile number as {string}")
    public void userEnterMobileNumberAs(String mobile)
    {
        automationPractcing.signup.enterMobile(data_properties.getProperty(mobile));
    }

    @And("User click on submit button")
    public void userClickOnSubmitButton() {
        automationPractcing.myAccount= automationPractcing.signup.clickOnSubmit();
    }

    @Then("User account page open successfully")
    public void userAccountPageOpenSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(automationPractcing.myAccount.getMyaccount().isDisplayed());
        driver.quit();
    }

    @And("User check on offers box")
    public void userCheckOnOffersBox()
    {
        automationPractcing.signup.clickOnOffers();
    }

    @And("User check on newsletter box")
    public void userCheckOnNewsletterBox()
    {
        automationPractcing.signup.clickOnNewLetter();
    }

    @And("User enter Company as {string}")
    public void userEnterCompanyAs(String company)
    {
        automationPractcing.signup.enterCompany(data_properties.getProperty(company));
    }

    @And("User enter Home Number as {string}")
    public void userEnterHomeNumberAs(String num)
    {
        automationPractcing.signup.enterHomePhone(data_properties.getProperty(num));
    }

    @And("User enter Additional Information as{string}")
    public void userEnterAdditionalInformationAs(String info)
    {
        automationPractcing.signup.enterAdditionalInformation(data_properties.getProperty(info));
    }

    @Then("Error message Appear with the text {string}")
    public void errorMessageAppearWithTheText(String msg) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(automationPractcing.signup.getErrorMsg().isDisplayed());
        Assert.assertEquals(automationPractcing.signup.getErrorMsg().getText(),msg_properties.getProperty(msg));
        driver.quit();

    }

    @Then("create an account button is clickable")
    public void createAnAccountButtonIsClickable() {
        Assert.assertTrue(automationPractcing.authentication.getSubmitButton().isEnabled());
    }

    @Then("signup button should be clickable")
    public void signupButtonShouldBeClickable() {
        Assert.assertTrue(automationPractcing.signup.getSubmitButton().isEnabled());

    }
}
