package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(name = "userName")
    private WebElement userNameTextBox;

    @FindBy(name = "password")
    private WebElement passwordTextBox;

    @FindBy(name = "login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void user_provides_user_name_as(String userName) throws Throwable {
        userNameTextBox.sendKeys(userName);
    }

    public void user_provides_password_as(String password) throws Throwable {
        passwordTextBox.sendKeys(password);
    }

    public void user_logs_in() throws Throwable {
        loginButton.click();
    }
}
