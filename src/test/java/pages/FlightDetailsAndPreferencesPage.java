package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.FlightInfo;

import java.util.List;
import java.util.Random;

public class FlightDetailsAndPreferencesPage {

    WebDriver driver;

    @FindBy(name = "tripType")
    private List<WebElement> tripTypeCheckBox;

    @FindBy(name = "passCount")
    private WebElement passCountSelect;

    @FindBy(name = "fromPort")
    private WebElement departureSelect;

    @FindBy(name = "fromMonth")
    private WebElement fromMonthSelect;

    @FindBy(name = "fromDay")
    private WebElement fromDaySelect;

    @FindBy(name = "toPort")
    private WebElement arrivalSelect;

    @FindBy(name = "toMonth")
    private WebElement toMonthSelect;

    @FindBy(name = "toDay")
    private WebElement toDaySelect;

    @FindBy(name = "servClass")
    private List<WebElement> servClassCheckBox;

    @FindBy(name = "airline")
    private WebElement airlineSelect;

    @FindBy(name = "findFlights")
    private WebElement findFligthsButton;

    public  FlightDetailsAndPreferencesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void user_fill_details_and_preferences() throws Throwable {
        int dp = 0;
        int ar = 0;
        int mdp = 0;
        int ddp = 0;
        int mar = 0;
        int dayarr = 0;
        FlightInfo finfo = new FlightInfo();
        System.out.println("Selecting details");
        String typeF;
        Select pCount = new Select(passCountSelect);
        Select departureSel = new Select(departureSelect);
        Select monthDepSel = new Select(fromMonthSelect);
        Select dayDepSel = new Select(fromDaySelect);
        Select arrivalSel = new Select(arrivalSelect);
        Select monthArrSel = new Select(toMonthSelect);
        Select dayArrSel = new Select(toDaySelect);
        Select airlineSel = new Select(airlineSelect);
        if(!tripTypeCheckBox.isEmpty()) {
            tripTypeCheckBox.get(0).click();
        }

        if (!pCount.getOptions().isEmpty()) {
            Random randCount = new Random();
            int pc = randCount.nextInt(pCount.getOptions().size());
            pCount.selectByIndex(pc);
            finfo.setNumPassegers(pc+1);
        }
        if (!departureSel.getOptions().isEmpty()) {
            Random randDep = new Random();
            dp = randDep.nextInt(departureSel.getOptions().size());
            departureSel.selectByIndex(dp);
        }
        if (!monthDepSel.getOptions().isEmpty()) {
            Random randMonthD = new Random();
            mdp = randMonthD.nextInt(monthDepSel.getOptions().size());
            monthDepSel.selectByIndex(mdp);
        }
        if(!dayDepSel.getOptions().isEmpty()) {
            Random randDayD = new Random();
            ddp = randDayD.nextInt(dayDepSel.getOptions().size());
            dayDepSel.selectByIndex(ddp);
        }
        if(!arrivalSel.getOptions().isEmpty()) {
            Random randArrSel = new Random();
            ar = randArrSel.nextInt(arrivalSel.getOptions().size());
            while (dp == ar) {
                System.out.println("repeated");
                Random aux = new Random();
                ar = aux.nextInt(arrivalSel.getOptions().size());
            }
            arrivalSel.selectByIndex(ar);
        }
        if(!monthArrSel.getOptions().isEmpty()) {
            Random randMonthA = new Random();
            mar = randMonthA.nextInt(monthArrSel.getOptions().size());
            while (mar < mdp) {
                Random auxm = new Random();
                mar = auxm.nextInt(monthArrSel.getOptions().size());
            }
            monthArrSel.selectByIndex(mar);
        }
        if(!dayArrSel.getOptions().isEmpty()) {
            Random randDayA = new Random();
            dayarr = randDayA.nextInt(dayArrSel.getOptions().size());
            if (mar == mdp) {
                while (dayarr <= ddp) {
                    Random auxd = new Random();
                    dayarr = auxd.nextInt(dayArrSel.getOptions().size());
                }
            }
            dayArrSel.selectByIndex(dayarr);
        }
        if(!servClassCheckBox.isEmpty()) {
            Random randSC = new Random();
            servClassCheckBox.get(randSC.nextInt(servClassCheckBox.size())).click();
        }
        if(!airlineSel.getOptions().isEmpty()) {
            Random randAir = new Random();
            airlineSel.selectByIndex(randAir.nextInt(airlineSel.getOptions().size()));
        }
    }

    public void user_confirm_details_and_preferences() throws Throwable {
        findFligthsButton.click();
    }
}
