package Step_Definition;

import Utilities.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.*;


public class hooks extends TestBase {

    @Before
    public void setup01(){
      BeforeScenario();
}



    @After
    public void end(Scenario result){
        AfterScenario(result);
    }

}
