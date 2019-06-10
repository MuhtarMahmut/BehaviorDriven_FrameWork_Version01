package Pages;

import Pages.AllElemnetsPage.*;
import Utilities.TestBase;
import org.openqa.selenium.support.PageFactory;

public class AllPagefactoeirs extends TestBase {

    {
        PageFactory.initElements(driver, GoogleSearchPage.class);

        PageFactory.initElements(driver, GoogleSearchPage2.class);
    }

}
