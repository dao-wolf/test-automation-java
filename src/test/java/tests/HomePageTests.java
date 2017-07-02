package tests;

import helper.Browser;
import helper.TestHelper;
import org.testng.annotations.*;

/**
 * Created by opantsjoha on 02/07/2017.
 */
public class HomePageTests extends TestHelper {

    Browser browser;

    @Parameters({"browserName", "baseUrl"})
    @BeforeClass(groups = {"web"})
    public void setUp(String browserName, String baseUrl) {
        browser = new Browser(browserName, baseUrl);
        browser.navigateToBaseUrl();
    }

    @Test(groups = {"web"})
    public void searchTest() throws InterruptedException {
        browser.HomePage().HeaderSection().setSearchField("Cooking");
        browser.HomePage().HeaderSection().clickOnSearchButton();
        // todo: add assert
    }

    @AfterClass(groups = {"web"})
    public void tearDown() {
        browser._driver.quit();
    }

}
