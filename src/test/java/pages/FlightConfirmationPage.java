package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightConfirmationPage {

    WebDriver driver;

    public FlightConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isFlightConfirmationDisplayed() throws Throwable {
        return driver.findElement(By.cssSelector("img[src='/images/masts/mast_confirmation.gif']")).isDisplayed();
    }
}
