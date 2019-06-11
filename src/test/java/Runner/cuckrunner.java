package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "Cucumber/Features/GoogleSearch.feature",
        glue = "Step_Definition",
        dryRun = false,
      //  tags = "";
        plugin = {
                "html:Cucumber/Reports/HTML",
                "junit:Cucumber/Reports/JUNIT/MyJunit.xml",
                "usage:Cucumber/Reports/Usage/MyUsage.js",
                "pretty:Cucumber/Reports/Pretty/Myprestty.txt"
        }




)


public class cuckrunner {






}