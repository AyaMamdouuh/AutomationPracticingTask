package Tests.Login;

import Base.base;
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
        driver.quit();
    }

    @Then("Error MSG appear with text {string}")
    public void errorMSGAppearWithText(String msg) {
        Assert.assertEquals(automationPractcing.authentication.getLoginErrorMsg().getText(),msg_properties.getProperty(msg));
    }

    @Then("Login Submit button is clickable")
    public void loginSubmitButtonIsClickable() {
        Assert.assertTrue(automationPractcing.authentication.getLoginButton().isEnabled());
    }
}
