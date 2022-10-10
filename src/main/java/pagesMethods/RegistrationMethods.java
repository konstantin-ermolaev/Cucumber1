package pagesMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pagesUI.Books;
import pagesUI.RegistrationPage;
import projectBase.BaseClass;

public class RegistrationMethods extends BaseClass {

    JavascriptExecutor js = (JavascriptExecutor)driver;

    public void navigateToFormsApp() {
        RegistrationPage page = new RegistrationPage();
/*        RegistrationPage.formsLink.click();*/
        js.executeScript("arguments[0].click();", RegistrationPage.formsLink);
        RegistrationPage.practiceFormLink.click();
    }

    public void userEntersRegistrationDetails(String firstName, String lastName, String email, String currentGender,
                                              String mobile,  String subject){
        RegistrationPage.txtFirstName.clear();
        RegistrationPage.txtFirstName.sendKeys(firstName);
        RegistrationPage.txtLastName.clear();
        RegistrationPage.txtLastName.sendKeys(lastName);
        RegistrationPage.txtUserEmail.clear();
        RegistrationPage.txtUserEmail.sendKeys(email);
        String gender = currentGender;
        if (gender.equals("Male")) {
            RegistrationPage.rudioButtonMale.click();
        }
        else if (gender.equals("Female")) {
            RegistrationPage.rudioButtonFemale.click();
        }
        else {
            RegistrationPage.rudioButtonOther.click();
        }
        RegistrationPage.txtUserNumber.clear();
        RegistrationPage.txtUserNumber.sendKeys(mobile);
        RegistrationPage.txtSubject.clear();
        RegistrationPage.txtSubject.sendKeys(subject);
        RegistrationPage.txtSubject.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].click();", RegistrationPage.btnSubmit);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].click();", RegistrationPage.btnClose);
/*        RegistrationPage.btnSubmit.click();
        RegistrationPage.btnClose.click();*/
    }
}
