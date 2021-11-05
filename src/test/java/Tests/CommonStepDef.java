package Tests;

import Base.base;
import Pages.Home;
import Pages.Authentication;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CommonStepDef extends base {
    @Given("Home page open")
    public void homePageOpen() {

        launchBrowser();
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php");

    }

    @When("User click on signup button")
    public void userClickOnSignupButton() {
        automationPractcing.home =new Home();
        automationPractcing.authentication=automationPractcing.home.clickOnSignInButton();

    }
    @Then("Authentication page open")
    public void authenticationPageOpen() {
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }


}
