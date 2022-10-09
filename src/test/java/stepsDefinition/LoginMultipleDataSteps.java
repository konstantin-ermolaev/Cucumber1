package stepsDefinition;

import io.cucumber.java.en.*;
import pagesMethods.BooksMethods;

public class LoginMultipleDataSteps {

    BooksMethods methods = new BooksMethods();

    @When("User enters name from datatable {string}")
    public void userEntersNameFromDatatable(String uname) {
        methods.enterUserName(uname);
    }

    @And("User enters password from datatable {string}")
    public void userEntersPasswordFromDatatable(String pass) {
        methods.enterPassword(pass);
    }

}
