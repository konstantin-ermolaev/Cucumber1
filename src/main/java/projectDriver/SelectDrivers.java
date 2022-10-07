package projectDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import projectBase.BaseClass;
import projectUtilities.AllConstants;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SelectDrivers extends BaseClass {
//    WebDriver driver;  // используется времменно, вдальнейшем берется из projectBase.
    // закомментил после создания BaseClass
    public static void driverInitialize(String browserName) {

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", AllConstants.chromeDriverFilePath);
            driver = new ChromeDriver();
        }

        else if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", AllConstants.firefoxDriverFilePath);
//            DesiredCapabilities cp = DesiredCapabilities.firefox();
//            cp.setCapability("marionette", true);
            driver = new FirefoxDriver();
        }

        else if (browserName.equals("IE")){
            System.setProperty("webdriver.ie.driver", AllConstants.ieDriverFilePath);
            driver = new InternetExplorerDriver();
        }

        else System.out.println("Browser not found");

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
