package stepsDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pagesMethods.RegistrationMethods;

import java.util.List;
import java.util.Map;

public class DataTableMultipleUserSteps {

    RegistrationMethods methods = new RegistrationMethods();

    @When("User enters the multiple students details")
    public void userEntersTheMultipleStudentsDetails(DataTable values) {
        List<Map<String,String>> userData = values.asMaps(String.class, String.class);
        for(Map<String, String> e: userData) {
            methods.userEntersRegistrationDetails(e.get(
                    "firstName"), e.get("lastName"), e.get("email"),
                    e.get("gender"), e.get("phone"), e.get("subject"));
        }
    }
}
