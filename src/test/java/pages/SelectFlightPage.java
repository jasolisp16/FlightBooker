package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SelectFlightPage {

    WebDriver driver;

    @FindBy(name = "outFlight")
    List<WebElement> departFlighCheckBox;

    @FindBy(name = "inFlight")
    List<WebElement> returnFlightCheckBox;

    @FindBy(name = "reserveFlights")
    WebElement reserveFlightButton;

    public SelectFlightPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void user_select_flights() throws Throwable {
        System.out.println("Selecting Flights");
        if (!departFlighCheckBox.isEmpty()) {
            Random randDF = new Random();
            departFlighCheckBox.get(randDF.nextInt(departFlighCheckBox.size())).click();
        }
        if (!returnFlightCheckBox.isEmpty()) {
            Random randRF = new Random();
            returnFlightCheckBox.get(randRF.nextInt(returnFlightCheckBox.size())).click();
        }
    }

    public void user_confirm_flight_selection() throws Throwable {
        reserveFlightButton.click();
    }
}
