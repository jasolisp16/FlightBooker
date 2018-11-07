package steps;

import cucumber.api.java.en.And;
import pages.LandingPage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginPageSteps extends DriverFactory {

    //@And("^user provide user name as ([^\"]*)$")
    public void user_provides_user_name_as(String userName) throws Throwable {
        new LandingPage(driver).user_provides_user_name_as(userName);
    }

    //@And("^user provide password as ([^\"]*)$")
    public void user_provides_password_as(String password) throws Throwable {
        new LandingPage(driver).user_provides_password_as(password);
    }

    //@And("^user logs in$")
    public void user_logs_in() throws Throwable {
        new LandingPage(driver).user_logs_in();
    }
}
