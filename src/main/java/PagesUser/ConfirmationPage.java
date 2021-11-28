package PagesUser;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Browser;

import static org.testng.Assert.assertTrue;

public class ConfirmationPage extends BasePage {
    @FindBy(css="#content > h1")
    private static WebElement registrationMessage;

    static {
        PageFactory.initElements(Browser.driver, ConfirmationPage.class);
    }
    public static void verifyRegistration(){
        assertTrue(registrationMessage.isDisplayed());
    }
}

