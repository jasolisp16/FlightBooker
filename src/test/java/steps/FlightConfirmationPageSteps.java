package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.FlightConfirmationPage;
import utils.DriverFactory;

public class FlightConfirmationPageSteps extends DriverFactory {

    @Then("^flight is booked$")
    public void flight_is_booked() throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(new FlightConfirmationPage(driver).isFlightConfirmationDisplayed());
    }
}
