package elements;

import locators.LocatorFactory;
import locators.SearchPageLocators;
import locators.SearchTextLocatorFactory;
import pages.BasePage;
import utils.LocatorType;

public class SearchBtn extends BasePageElement{

    private LocatorFactory factory;

    public SearchBtn(BasePage page) {
        factory = SearchTextLocatorFactory.getFactory();
        locator = factory.createLocator(LocatorType.XPATH, SearchPageLocators.SEARCH_BTN);
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
