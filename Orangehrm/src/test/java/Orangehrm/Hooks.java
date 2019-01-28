package Orangehrm;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {

    @Before

    public void driversetup(){

        System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDriver\\chromedriver.exe");

        driver = new ChromeDriver();
        //implicity wait for Driver

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //Window maximise Screen
        driver.manage().window().maximize();
        // url
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    //@After
    public void closebrowser(){
        driver.quit();
    }
}
