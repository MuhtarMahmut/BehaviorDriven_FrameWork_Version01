package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


enum AvailabeBrowsers{

    Chrome, FireFox, IE, Edge,

}


public interface Driver  {

    WebDriver newdriver = getDriver();

    static WebDriver getDriver(){

        String Browser = FileReader.getPropertiesData("Browser").toLowerCase();       // from propertiesfile
        //   String Browser = FileReader.getExcelData(2,2).toLowerCase();                 // from excel

        AvailabeBrowsers names = (Browser.equals("firefox"))? AvailabeBrowsers.FireFox : (Browser.equals("chrome")) ? AvailabeBrowsers.Chrome :
                (Browser.equals("ie")) ? AvailabeBrowsers.IE : (Browser.equals("Edge"))?AvailabeBrowsers.Edge: null ;

        switch (names){
            case Chrome:  WebDriverManager.chromedriver().setup();
                TestBase.driver = new ChromeDriver();
                break;

            case IE:    WebDriverManager.iedriver().setup();
                TestBase.driver = new InternetExplorerDriver();
                break;

            case FireFox:   WebDriverManager.firefoxdriver().setup();
                TestBase.driver =  new FirefoxDriver();
                break;

            case Edge:  WebDriverManager.edgedriver().setup();
                TestBase.driver = new EdgeDriver();
                break;

        }


        return TestBase.driver;
    }







}
