package Step_Definition;

import Utilities.TestBase;
import cucumber.api.java.en.*;
import static Pages.AllElemnetsPage.GoogleSearchPage.*;

public class class1 extends TestBase {


    @When("go to the website")
    public void go_to_the_website() {
        System.out.println("Hello");
    }

    @Then("Enter Apple")
    public void enter_Apple() {
     searchbox.sendKeys("Apple");

    }



}
