package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.LandingPage;
import pages.LoginPage;
import utils.DriverFactory;

public class LandingPageSteps extends DriverFactory {

    //@When("^chooses to login$")
    //public void user_chooses_to_sign_on() throws Throwable {
    //    new LandingPage(driver).user_chooses_to_sign_on();
    //}

    @When("^user provide user name as ([^\"]*)$")
    public void user_provides_user_name_as(String userName) throws Throwable {
        new LoginPage(driver).user_provides_user_name_as(userName);
    }

    @And("^user provide password as ([^\"]*)$")
    public void user_provides_password_as(String password) throws Throwable {
        new LoginPage(driver).user_provides_password_as(password);
    }

    @And("^user logs in$")
    public void user_logs_in() throws Throwable {
        new LoginPage(driver).user_logs_in();
    }
}
