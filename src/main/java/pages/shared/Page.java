package pages.shared;

import helper.Browser;

/**
 * Created by opantsjoha on 02/07/2017.
 */
public class Page extends Element {
    public Page(Browser browser) {
        super(browser);
    }

    // Create HeaderSection object when called.
    public HeaderSection HeaderSection(){
        if(headerSection == null){
            headerSection = new HeaderSection(browser);
        }
        return headerSection;
    }

    private HeaderSection headerSection;
}
