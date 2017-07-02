package pages.shared;

import helper.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by opantsjoha on 02/07/2017.
 */
public class Element {

    public Element(Browser browser) {
        this.browser = browser;
        driver = browser._driver;
        PageFactory.initElements(driver, this);
    }

    // Draws a red border around the found element. Does not set it back anyhow.
    public WebElement highlightElement(WebElement elem) {
        // draw a border around the found element
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
        }
        return elem;
    }

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Browser browser;
    protected static int DURATION = 5000;
}
