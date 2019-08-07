package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utils.WaitElement;

public abstract class BasePageElement {
    protected By locator;
    protected BasePage page;

    public void setValue(String value) {
        WaitElement.WaitForElementVisible(page.getDriver(), locator, 10);
        page.getDriver().findElement(locator).clear();
        page.getDriver().findElement(locator).sendKeys(value);
    }
    public String getValue() {
        WaitElement.WaitForElementVisible(page.getDriver(), locator, 10);
        return page.getDriver().findElement(locator).getText();
    }

    public By getLocator() {
        return locator;
    }

    public void setLocator(By locator) {
        this.locator = locator;
    }
}
