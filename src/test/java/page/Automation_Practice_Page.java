package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;


public class Automation_Practice_Page {

    //Locators
//    static By headName= By.xpath("//h1[contains(text(),'Practice Page')]");
//    static String baseUrl= "https://rahulshettyacademy.com/AutomationPractice/";

    By headName= By.xpath("//h1[contains(text(),'Practice Page')]");
    String baseUrl= "https://rahulshettyacademy.com/AutomationPractice/";

    //Methods
//    public static void Open(){
//        DriverFactory.getDriver().get(baseUrl);
//    }
//
//    public static WebElement head(){
//        return DriverFactory.getDriver().findElement(headName);
//    }

    public void Open(){
        DriverFactory.getDriver().get(baseUrl);
    }

    public WebElement head(){
        return DriverFactory.getDriver().findElement(headName);
    }
}
