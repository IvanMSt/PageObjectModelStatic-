package PagesUser;

import core.BasePage;
import org.openqa.selenium.By;
import utilities.Browser;

public class RegistrationPage extends BasePage {
    private static String url = "http://shop.pragmatic.bg";


    private static final By ACCOUNT_BUTTON = By.cssSelector("ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md");
    private static final By REGISTRATION_BUTTON = By.cssSelector("a[href= 'https://shop.pragmatic.bg/index.php?route=account/register']");

    public static void goToRegistrationPage() {
        Browser.driver.get(url);
    }

    public static void gotToCredentialsPage() {
        Browser.driver.findElement(ACCOUNT_BUTTON).click();
        Browser.driver.findElement(REGISTRATION_BUTTON).click();

    }
}