package steps;

import cucumber.api.java.en.And;
import pages.SelectFlightPage;
import utils.DriverFactory;

public class SelectFlightSteps extends DriverFactory {

    @And("^user select flights$")
    public void user_select_flights()throws Throwable {
        Thread.sleep(2000);
        new SelectFlightPage(driver).user_select_flights();
    }

    @And("^user confirm flight selection$")
    public void user_confirm_flight_selection() throws Throwable {
        new SelectFlightPage(driver).user_confirm_flight_selection();
    }
}
