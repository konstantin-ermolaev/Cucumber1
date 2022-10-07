package pagesMethods;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import pagesUI.Books;
import projectBase.BaseClass;
import java.io.IOException;

public class BooksMethods extends BaseClass{

    String checkUsername = null;

    public void openBrowser() throws IOException {
        BaseClass.Initialization();
    }

    public void enterUrl() {
        BaseClass.insertUrl();
    }

    public void navigateToBookStoreApp() {
        Books objBooks = new Books();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", Books.bookStorePageLink);
    }

    public void clickOnLoginButton() {
        Books.buttonLogin.click();
    }

    public void enterUserName(String userName) {
        checkUsername = userName;
        Books.txtUserName.clear();
        Books.txtUserName.sendKeys(userName);
    }

    public void enterPassword(String password) {
        Books.txtPassword.clear();
        Books.txtPassword.sendKeys(password);
    }

    public void clickOnSignInButton() {
        Books.buttonSignIn.click();
    }

    public void closeBrowser() {
        BaseClass.tearDown();
    }

    public void validateLogin() {
        String actualUserName = Books.lblUserName.getText();
        Assertions.assertEquals(actualUserName, checkUsername);
    }
}
