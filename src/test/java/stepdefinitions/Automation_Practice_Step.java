package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import page.Automation_Practice_Page;
import utils.DriverFactory;
import utils.Utils;


public class Automation_Practice_Step {

    Automation_Practice_Page page= new Automation_Practice_Page();
    Utils utils= new Utils();

    @Given("Goto automation practice webpage")
    public void gotoAutomationPracticeWebpage() {
        WebDriver driver= DriverFactory.getDriver();
        page.Open();
//        Automation_Practice_Page.Open();
        utils.explicitWait(driver,10).until(ExpectedConditions.visibilityOf(page.head()));
        Assert.assertEquals(page.head().getText(),"Practice Page");
        DriverFactory.quitDriver();
    }

    @When("Radio button clicked")
    public void radioButtonClicked() {

    }

    @Then("Validate radio button clicked")
    public void validateRadioButtonClicked() {
    }
}
