package steps;

import cucumber.api.java.en.And;
import pages.PassengerAndBillingInfoPage;
import utils.DriverFactory;

public class PassengerAndBillingInfoPageSteps extends DriverFactory {

    @And("^user fill personal and billing info$")
    public void user_fill_personal_and_billing_info() throws Throwable {
        Thread.sleep(2000);
        new PassengerAndBillingInfoPage(driver).user_filling_passenger_and_billing_info();
    }

    @And("^user confirm info$")
    public void user_confirm_info() throws Throwable {
        new PassengerAndBillingInfoPage(driver).user_confirm_info();
    }
}
