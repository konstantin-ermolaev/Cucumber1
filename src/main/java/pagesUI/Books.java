package pagesUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectBase.BaseClass;

public class Books extends BaseClass {
    @FindBy(xpath ="//h5[contains(text(),'Book')]") public  static WebElement bookStorePageLink;
    @FindBy(id = "login") public  static WebElement buttonLogin;
    @FindBy(id = "userName") public  static WebElement txtUserName;
    @FindBy(id = "password") public  static WebElement txtPassword;
    @FindBy(id = "login") public  static WebElement buttonSignIn;
    @FindBy(id = "userName-value") public  static WebElement lblUserName;

    public Books() {
        PageFactory.initElements(driver,this);
    }
}
