package Orangehrm;

import org.openqa.selenium.By;

public class Register extends Utils {
public void entercredentials(){
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");

}
}
