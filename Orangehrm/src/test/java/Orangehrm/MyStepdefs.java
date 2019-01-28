package Orangehrm;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.ini4j.Reg;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class MyStepdefs extends Utils {

    Register register = new Register();
    AccountPage accountPage = new AccountPage();


    @Given("user is on homepage")
    public void user_is_on_homepage() {

    }

    @When("^user enter valid details in login details$")
    public void userEnterValidDetailsInLoginDetails() {
        register.entercredentials();
    }

    @And("^user click on log in button$")
    public void userClickOnLogInButton() {
        driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
    }


    @Then("^user is able to see login page$")
    public void user_is_able_to_see_login_page() {

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals("Welcome Admin",driver.findElement(By.id("welcome")).getText(),"this test fail  ");
//        accountPage.verifyLoggedIn("Welcome Admin");


    }

//
//   // @Then("^user is able to see login page$")
//    public void userIsAbleToSeeLoginPage() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
}

