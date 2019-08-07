package testsuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.SearchPage;
import pages.SearchResultsPage;
import ru.stqa.selenium.factory.WebDriverPool;
import utils.ScreenShot;

import java.sql.Time;

public class TestGoogleSearch {

    WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        DesiredCapabilities dCaps = DesiredCapabilities.chrome();
        dCaps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        driver = WebDriverPool.DEFAULT.getDriver(dCaps);
        driver.get("https://www.google.com/");
    }

    @AfterSuite
    public void stopAllBrowsers() {
        WebDriverPool.DEFAULT.dismissAll();
    }

    @Test
    public void testSearchSelenium() {
        // Initialize Search Page
        SearchPage sp = new SearchPage(driver);
        // Send search contents to search text box
        sp.setValue("Selenium");
        // Check Search Page Title
        Assert.assertTrue(sp.isTitleMatches());
        // Click Search Button to start search
        sp.clickSearchBtn();
        // Wait 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            ScreenShot.takeScreenShot(driver, "screenshots/searchresult.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
        SearchResultsPage srp = new SearchResultsPage(driver);
        Assert.assertTrue(srp.isResultFound());
    }
}
