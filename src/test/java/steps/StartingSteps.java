package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.DriverFactory;

public class StartingSteps extends DriverFactory {

    @Before
    public void presetup() {
        System.setProperty("webdriver.gecko.driver", "C:\\webDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Given("^the user is registered$")
    public void setup() throws Throwable {
        driver.get("http://newtours.demoaut.com");
        driver.manage().window().maximize();
    }
}
