package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickElement {

    public static void clickByLocator(WebDriver driver, By locator, int idx) {
        WaitElement.WaitForElementVisible(driver, locator, 10);
        WebElement element = driver.findElements(locator).get(idx);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
}
