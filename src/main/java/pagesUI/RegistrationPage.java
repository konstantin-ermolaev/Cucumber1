package pagesUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectBase.BaseClass;

public class RegistrationPage extends BaseClass {
    @FindBy(xpath ="//h5[contains(text(),'Forms')]") public  static WebElement formsLink;
    @FindBy(xpath= "//span[contains(text(),'Practice Form')]") public static WebElement practiceFormLink;
    @FindBy(id  = "firstName") public static WebElement txtFirstName;
    @FindBy(id  = "lastName") public static WebElement txtLastName;
    @FindBy(id  = "userEmail") public static WebElement txtUserEmail;
    @FindBy(xpath = "//label[contains(text(), 'Male')]") public static WebElement rudioButtonMale;
    @FindBy(xpath = "//label[contains(text(), 'Female')]") public static WebElement rudioButtonFemale;
    @FindBy(xpath = "//label[contains(text(), 'Other')]") public static WebElement rudioButtonOther;
    @FindBy(id = "userNumber") public static WebElement txtUserNumber;
    @FindBy(id = "subjectsInput") public static WebElement txtSubject;
    @FindBy(id = "submit") public static WebElement btnSubmit;
    @FindBy(id = "closeLargeModal") public static WebElement btnClose;
    /*@FindBy(xpath = "(//div[@class='css-1g6gooi'])[1]") public static WebElement txtSubject;*/

    public RegistrationPage() {
        PageFactory.initElements(driver,this);
    }
}
