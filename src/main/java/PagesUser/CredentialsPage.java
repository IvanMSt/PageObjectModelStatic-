package PagesUser;

import core.BasePage;
import org.openqa.selenium.By;
import utilities.Browser;

public class CredentialsPage extends BasePage {
    private static String url = "https://shop.pragmatic.bg/index.php?route=account/register";

//    String randomEmail = RandomStringUtils.randomAlphabetic(7) + "@somemail.com";
//    String randomPhoneNumber = RandomStringUtils.randomNumeric(9);

    private static final By FIRST_NAME_INPUT_FIELD = By.id("input-firstname");
    private static final By LAST_NAME_INPUT_FIELD = By.id("input-lastname");
    private static final By INPUT_EMAIL_FIELD = By.id("input-email");
    private static final By INPUT_PHONE_NUMBER_FIELD = By.id("input-telephone");
    private static final By INPUT_PASSWORD_FIELD = By.id("input-password");
    private static final By CONFIRM_PASSWORD_FIELD = By.id("input-confirm");
    private static final By CHECKBOX_BUTTON = By.cssSelector(" input[type=checkbox]");
    private static final By CONTINUE_BUTTON = By.cssSelector(" input.btn.btn-primary");

    public static void goToCredentialsPage() {
        Browser.driver.get(url);
    }

    public static void Register(String firstNAme, String lastName, String email, String phoneNumber, String password, String confirmPassword) {
        Browser.driver.findElement(FIRST_NAME_INPUT_FIELD).sendKeys(firstNAme);
        Browser.driver.findElement(LAST_NAME_INPUT_FIELD).sendKeys(lastName);
        Browser.driver.findElement(INPUT_EMAIL_FIELD).sendKeys(email);
        Browser.driver.findElement(INPUT_PHONE_NUMBER_FIELD).sendKeys(phoneNumber);
        Browser.driver.findElement(INPUT_PASSWORD_FIELD).sendKeys(password);
        Browser.driver.findElement(CONFIRM_PASSWORD_FIELD).sendKeys(confirmPassword);
        Browser.driver.findElement(CHECKBOX_BUTTON).click();
        Browser.driver.findElement(CONTINUE_BUTTON).click();
    }
}
