package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.Automation_Practice_Page;
import utils.DriverFactory;





public class Automation_Practice_Step {


    @Given("Goto automation practice webpage")
    public void gotoAutomationPracticeWebpage() {
        Automation_Practice_Page.Open();
        Assert.assertEquals(Automation_Practice_Page.head().getText(),"Practice Page");
    }

    @When("Radio button clicked")
    public void radioButtonClicked() {
        Automation_Practice_Page.clickRadio1();
    }

    @Then("Validate radio button clicked")
    public void validateRadioButtonClicked() {
        Assert.assertTrue("Radio button is not clicked",Automation_Practice_Page.isRadio1Clicked());
        DriverFactory.quitDriver();
    }
}
