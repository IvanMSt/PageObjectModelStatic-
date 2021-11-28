package core;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import utilities.Browser;

public abstract class BasePage {

    protected void click(By locator) {
        Browser.driver.findElement(locator).click();
    }


    protected static void type(By locator, String inputText) {
        Browser.driver.findElement(locator).sendKeys(inputText);
    }
    protected static String getElementText(By locator) {
        return Browser.driver.findElement(locator).getText();
    }
}
