package projectUtilities;

public class AllConstants {
    public static final String directoryPath = System.getProperty("user.dir");
    public static final String propertiesFilePath = directoryPath +
            "\\src\\main\\resources\\projectConfig\\my_config1.properties";
    public static final String chromeDriverFilePath = directoryPath +
            "\\src\\main\\java\\projectDriver\\chromedriver.exe";
    public static final String firefoxDriverFilePath = directoryPath +
            "\\src\\main\\java\\projectDriver\\geckodriver.exe";
    public static final String ieDriverFilePath = directoryPath +
            "\\src\\main\\java\\projectDriver\\IEDriverServer.exe";
}
