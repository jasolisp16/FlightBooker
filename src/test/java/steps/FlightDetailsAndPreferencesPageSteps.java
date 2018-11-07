package steps;

import cucumber.api.java.en.And;
import pages.FlightDetailsAndPreferencesPage;
import utils.DriverFactory;

public class FlightDetailsAndPreferencesPageSteps extends DriverFactory {

    @And("^user fill details and preferences page$")
    public void user_fill_details_and_preferences_page() throws Throwable {
        Thread.sleep(2000);
        new FlightDetailsAndPreferencesPage(driver).user_fill_details_and_preferences();
    }

    @And("^user confirm details and preferences$")
    public  void user_confirm_details_and_preferences() throws Throwable {
        new FlightDetailsAndPreferencesPage(driver).user_confirm_details_and_preferences();
    }
}
