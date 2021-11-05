package Tests.Login;

import Base.base;
import Pages.AutomationPractcing;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDef extends base{
    @When("User enter the email {string}")
    public void userEnterTheEmail(String mail) {
        automationPractcing.authentication.enterEmail(data_properties.getProperty(mail));


    }

    @And("User enter the password{string}")
    public void userEnterThePassword(String pass) {
        automationPractcing.authentication.enterPassword(data_properties.getProperty(pass));
    }

    @And("User click on submit signin button")
    public void userClickOnSubmitSigninButton() {
        automationPractcing.myAccount= automationPractcing.authentication.clickOnLogin();
    }



    @Then("Account Page Open Successfully with username {string}")
    public void accountPageOpenSuccessfullyWithUsername(String user) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(automationPractcing.myAccount.getMyaccount().isDisplayed());
        Assert.assertEquals(automationPractcing.myAccount.getUserName().getText(),data_properties.getProperty(user));
        Thread.sleep(5000);
        driver.quit();
    }

    @Then("Error MSG appear with text {string}")
    public void errorMSGAppearWithText(String msg) throws InterruptedException {
        Assert.assertEquals(automationPractcing.authentication.getLoginErrorMsg().getText(),msg_properties.getProperty(msg));
        Thread.sleep(5000);
        driver.quit();
    }

    @Then("Login Submit button is clickable")
    public void loginSubmitButtonIsClickable() {
        Assert.assertTrue(automationPractcing.authentication.getLoginButton().isEnabled());
    }

    @When("User click on forget the password")
    public void userClickOnForgetThePassword() {
        AutomationPractcing.forgetPassword=AutomationPractcing.authentication.clickOnForgetPassword();
    }

    @Then("Forget passwoed page open successfully")
    public void forgetPasswoedPageOpenSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(automationPractcing.forgetPassword.getForgotPasswordPage().isDisplayed());
    }

    @When("User enter the email address {string}")
    public void userEnterTheEmailAddress(String mail) {
        automationPractcing.forgetPassword.enterTheEmail(data_properties.getProperty(mail));
    }


    @And("User click on retrive the password")
    public void userClickOnRetriveThePassword() {
        automationPractcing.forgetPassword.clickOnSubmitButton();

    }

    @Then("Confirmation email send successfully")
    public void confirmationEmailSendSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(automationPractcing.forgetPassword.getConfirmationMSG().isDisplayed());
        Thread.sleep(5000);
        driver.quit();
    }
}
