package stepsDefinition;

import io.cucumber.java.en.*;
import pagesMethods.BooksMethods;

import java.io.IOException;

public class LoginValidationSteps {

    BooksMethods methods = new BooksMethods();

    @Given("User open the browser")
    public void userOpenTheBrowser() throws IOException {
        methods.openBrowser();
    }

    @And("User enters the url {string}")
    public void userEntersTheUrl(String arg0) {
        methods.enterUrl();
    }

    @And ("User clicks on Login button")
    public void userClicksOnLoginButton() {
        methods.navigateToBookStoreApp();
        methods.clickOnLoginButton();
    }

    @When("User enters name {string}")
    public void userEntersName(String uname) {
        methods.enterUserName(uname);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String pass) {
        methods.enterPassword(pass);
    }

    @And("User clicks on Sign In button")
    public void userClicksOnSignInButton() {
        methods.clickOnSignInButton();
    }

    @Then("User should gt successfully logged in")
    public void userShouldGtSuccessfullyLoggedIn() {
        methods.validateLogin();
    }

    @And("Browser should get closed")
    public void browserShouldGetClosed() {
        methods.closeBrowser();
    }

    @When("User enters name <userName>")
    public void userEntersNameUserName() {
    }

    @And("User enters password <password>")
    public void userEntersPasswordPassword() {
    }

    @When("User logins to app")
    public void userLoginsToApp() {
    }

    @Then("User checks his signature line:")
    public void userChecksHisSignatureLine() {
    }
}
