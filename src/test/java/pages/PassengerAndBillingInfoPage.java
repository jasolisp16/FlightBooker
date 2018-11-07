package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.FlightInfo;

import java.util.Random;

public class PassengerAndBillingInfoPage {

    WebDriver driver;

    @FindBy(name = "creditCard")
    WebElement credCardSelect;

    @FindBy(name = "creditnumber")
    WebElement creditNumberTextBox;

    @FindBy(name = "cc_exp_dt_mn")
    WebElement expMonthSelect;

    @FindBy(name = "cc_exp_dt_yr")
    WebElement expYearSelect;

    @FindBy(name = "cc_frst_name")
    WebElement ccFrstNameTextBox;

    @FindBy(name = "cc_mid_name")
    WebElement ccMidNameTextBox;

    @FindBy(name = "cc_last_name")
    WebElement ccLastNameTextBox;

    @FindBy(name = "buyFlights")
    WebElement buyFlightsButton;

    public PassengerAndBillingInfoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void user_filling_passenger_and_billing_info() throws Throwable {
        FlightInfo flightInfo = new FlightInfo();
        Select creditCardSelect = new Select(credCardSelect);
        Select expMonth = new Select(expMonthSelect);
        Select expYear = new Select(expYearSelect);
        Random rmn = new Random();
        int wmn = rmn.nextInt(2);
        fill_passenger_names();
        if (!creditCardSelect.getOptions().isEmpty()) {
            Random randCredCard = new Random();
            creditCardSelect.selectByIndex(randCredCard.nextInt(creditCardSelect.getOptions().size()));
        }
        creditNumberTextBox.sendKeys(flightInfo.createRandomNumber(16));
        if (!expMonth.getOptions().isEmpty()) {
            Random randExpMont = new Random();
            int xm = randExpMont.nextInt(expMonth.getOptions().size());
            if (xm == 0){
                xm++;
            }
            expMonth.selectByIndex(xm);
        }
        if (!expYear.getOptions().isEmpty()) {
            Random randExpYear = new Random();
            int xy = randExpYear.nextInt(expYear.getOptions().size());
            if (xy == 0) {
                xy++;
            }
            expYear.selectByIndex(xy);
        }
        ccFrstNameTextBox.sendKeys(flightInfo.createRandomName());
        if (wmn == 1) {
            ccMidNameTextBox.sendKeys(flightInfo.createRandomName());
        }
        ccLastNameTextBox.sendKeys(flightInfo.createRandomName());

    }

    public void user_confirm_info() throws Throwable {
        buyFlightsButton.click();
    }

    private void fill_passenger_names() {
        FlightInfo flightinfo = new FlightInfo();
        System.out.println(flightinfo.getNumPassegers());
        String fnp = "";
        String lnp = "";
        String pmeal = "";

        for (int i = 0; i<flightinfo.getNumPassegers(); i++) {
            fnp = "passFirst" + i;
            System.out.println(fnp);
            lnp = "passLast" + i;
            System.out.println(lnp);
            pmeal = "pass." + i + ".meal";
            System.out.println(pmeal);

            driver.findElement(By.name(fnp)).sendKeys(flightinfo.createRandomName());
            driver.findElement(By.name(lnp)).sendKeys(flightinfo.createRandomName());
            Select meals = new Select(driver.findElement(By.name(pmeal)));
            if (!meals.getOptions().isEmpty()) {
                Random randMeals = new Random();
                meals.selectByIndex(randMeals.nextInt(meals.getOptions().size()));
            }

        }

    }

}
