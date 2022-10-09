package projectBase;

import org.openqa.selenium.WebDriver;
import projectDriver.SelectDrivers;
import projectUtilities.AllConstants;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;

    public static void Initialization() throws IOException{
        prop = new Properties();
        FileInputStream fileInput = new FileInputStream(AllConstants.propertiesFilePath);
        prop.load(fileInput);

        String browser = prop.getProperty("browser");
        SelectDrivers.driverInitialize(browser);
    }

    public static void insertUrl() {
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    }

    public static void tearDown() {
        driver.quit();
    }
}
