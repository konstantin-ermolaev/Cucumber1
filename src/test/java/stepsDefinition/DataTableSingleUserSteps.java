package stepsDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pagesMethods.BooksMethods;
import pagesMethods.RegistrationMethods;

import java.util.List;

public class DataTableSingleUserSteps {

    RegistrationMethods methods = new RegistrationMethods();

    @And("User navigates to the Registration page")
    public void userNavigatesToTheRegistrationPage() {
        methods.navigateToFormsApp();
    }

    @When("User enters the single student details")
    public void userEntersTheSingleStudentDetails(DataTable values) {
        List<String> userData = values.transpose().asList();
        methods.userEntersRegistrationDetails(userData.get(0), userData.get(1), userData.get(2),
                userData.get(3), userData.get(4), userData.get(5));
    }
}
