package pages.shared;

import helper.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by opantsjoha on 02/07/2017.
 */
public class HeaderSection extends Element {

    public HeaderSection(Browser browser) {
        super(browser);
    }

    @FindBy(id = "orb-search-q")
    private WebElement searchField;

    // This search button is actually useless - as it just opens another search box
    @FindBy(id = "orb-search-button")
    private WebElement searchButton;

    @FindBy(className = "se-searchbox__submit")
    private WebElement searchSubmitButton;

    public void setSearchField(String value) {
        searchField.sendKeys(value);
    }

    public void clickOnSearchButton() {
        // this element only appears when something is input into search field.
        searchSubmitButton.click();
    }

}
