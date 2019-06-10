package Utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.*;
import java.time.*;
import static Utilities.TestBase.*;


public interface BrowseUtils {

     static void sleepForNow(int a){
        try {
            Thread.sleep(a * 1000);
        } catch (Exception e){}

    }



     static void TakeScreenShots(String saveAs){

        String DateTime= LocalDate.now().toString()+ LocalTime.now().toString().substring(0,5);
        saveAs = saveAs+"_"+DateTime.replaceAll("[-,:]","");

        try {

            TakesScreenshot ss = (TakesScreenshot) driver;
            File muhtar = ss.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(muhtar, new File( "Cucumber/ScreenShots/"+saveAs+".png")  );

        } catch (Exception e){}

    }



     static void CloseBrowser(){
        BrowseUtils.sleepForNow(2);
        driver.quit();
        driver = null;
    }



}
