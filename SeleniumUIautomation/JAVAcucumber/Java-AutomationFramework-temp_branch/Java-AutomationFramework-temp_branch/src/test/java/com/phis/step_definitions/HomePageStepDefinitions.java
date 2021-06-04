package com.phis.step_definitions;

import com.phis.utilities.ObjectRepo;
import com.phis.pages.LoginPage;
import com.phis.utilities.BrowserUtils;
import com.phis.utilities.ConfigurationReader;
import com.phis.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class HomePageStepDefinitions{

    WebDriver driver;

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("I am opening the login page");
        // open the login page of the application
        // url is in the properties file
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("the user click show all radio button")
    public void user_logs_in_as_a_team_lead() throws InterruptedException {

        loginPage.showall.click();
        Thread.sleep(100);

    }

    @When("the user clicks {string} radio button on {string}")
    public void the_user_clicks_radio_button_on(String key, String page) throws Exception {
    	 System.out.println("I am at login page");
    	ObjectRepo objectRepo = new ObjectRepo(page);
        BrowserUtils.typeInElement(objectRepo.getLocator("username"), "");
        BrowserUtils.typeInElement(objectRepo.getLocator("password"), "");
        BrowserUtils.clickWithJS(objectRepo.getLocator("signin"));
        
        BrowserUtils.wait(10);
    }

    @And("the user select {string} from the Login as Dropdown")
    public void iSelectFromTheLogisAsDropdown(String name) throws InterruptedException {
        WebElement drpdwn=loginPage.logindropdown;
        Select drpdwnvalue=new Select(drpdwn);
        drpdwnvalue.selectByVisibleText(name);
        Thread.sleep(1000);
    }

    @And("the user select {string} from the role Dropdown")
    public void iSelectFromTheRoleDropdown(String name) throws InterruptedException {
        WebElement drpdwn2=loginPage.roledropdown;
        Select drpdwnvalue2=new Select(drpdwn2);
        drpdwnvalue2.selectByVisibleText(name);
        Thread.sleep(1000);
    }

    @And("the user clicks the myinspectionstab")
    public void theUserClicksTheMyinspectionstab() throws InterruptedException {
        loginPage.myinspectionstab.click();
        Thread.sleep(10000);

    }

   @And("the user clicks on \"(.*?)\"$")
    public void theuserclickson(String theelememtname) throws InterruptedException {

       WebElement element= driver.findElement((By.id(theelememtname)));
       element.click();


//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//       jse.executeScript("arguments[0].click()", driver.findElement(By.xpath(theelememtname)));

       Thread.sleep(1000);

   }

   @And("the user clicks the createapplication link")
    public void theuserclicksthecreateapplicationlink() throws InterruptedException{
        loginPage.createapplication.click();
        Thread.sleep(10000);
   }

   @And("^the user must see \"(.*?)\"$")
    public void theusermustsee(String name) throws Throwable{
       assertTrue(loginPage.textname.getText().contains(name));
    }
}


