package elements;

import locators.*;
import pages.BasePage;
import utils.LocatorType;

public class SearchTextElement extends BasePageElement {

    private LocatorFactory factory;

    public SearchTextElement(BasePage page) {
        factory = SearchTextLocatorFactory.getFactory();
        locator = factory.createLocator(LocatorType.XPATH, SearchPageLocators.SEARCH_BOX);
        this.page = page;
    }

    public LocatorFactory getFactory() {
        return factory;
    }

    public void setFactory(LocatorFactory factory) {
        this.factory = factory;
    }

    public BasePage getPage() {
        return page;
    }

    public void setPage(BasePage page) {
        this.page = page;
    }
}
