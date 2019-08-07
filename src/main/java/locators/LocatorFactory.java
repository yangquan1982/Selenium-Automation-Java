package locators;

import org.openqa.selenium.By;
import utils.LocatorType;

public abstract class LocatorFactory {
    public By createLocator(LocatorType type, String value) {
        By locator = null;

        switch (type) {
            case ID:
                locator = By.id(value);
                break;
            case NAME:
                locator = By.name(value);
                break;
            case XPATH:
                locator = By.xpath(value);
                break;
            case TAG_NAME:
                locator = By.tagName(value);
                break;
            case LINK_TEXT:
                locator = By.linkText(value);
                break;
            case CLASS_NAME:
                locator = By.className(value);
                break;
            case CSS_SELECTOR:
                locator = By.cssSelector(value);
                break;
            case PARTIAL_LINK_TEXT:
                locator = By.partialLinkText(value);
                break;
            default:

        }
        return locator;
    }
}
