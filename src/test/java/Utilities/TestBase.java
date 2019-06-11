package Utilities;



import Pages.AllPagefactoeirs;
import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public abstract class TestBase implements Driver {

    // main variables we use in everysingle tests:
    protected  static WebDriver driver;
    protected  static WebDriverWait wait;
    protected  static Actions act;



    public static void BeforeScenario(){
        driver = newdriver;
        wait = new WebDriverWait(driver,10);
        act = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to( FileReader.getPropertiesData("Website") );
        //   driver.navigate().to( FileReader.getExcelData(1,2) );


        new AllPagefactoeirs();   //
    }

    public static void AfterScenario(Scenario result){

        if( result.isFailed() )
            result.embed( ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES) ,"image/png" );

        BrowseUtils.CloseBrowser();
    }


}