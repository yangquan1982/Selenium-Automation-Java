package locators;

import org.openqa.selenium.By;

public class SearchTextLocatorFactory extends LocatorFactory {

    private static LocatorFactory factory = new SearchTextLocatorFactory();

    public SearchTextLocatorFactory() {}

    public static LocatorFactory getFactory() {
        return factory;
    }

    public static void setFactory(LocatorFactory factory) {
        SearchTextLocatorFactory.factory = factory;
    }
}
