package utils;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    protected static WebDriver driver;

    public String getProjectPath() {
        String projectLocation = System.getProperty("user.dir");
        return projectLocation;
    }
}
