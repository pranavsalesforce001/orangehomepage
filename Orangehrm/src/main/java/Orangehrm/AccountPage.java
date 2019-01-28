package Orangehrm;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AccountPage extends Utils {
    public void verifyLoggedIn(String welcome){
        String expectedRegisterSuccessMessage= "welcome";
        String acctualRegisterSuccessMessage =driver.findElement(By.id("welcome")).getText();
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(expectedRegisterSuccessMessage,acctualRegisterSuccessMessage);
        softAssert.assertAll();

    }
}
