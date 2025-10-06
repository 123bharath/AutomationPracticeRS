package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;
import utils.Utils;


public class Automation_Practice_Page {

    //Locators
    public static String baseUrl= "https://rahulshettyacademy.com/AutomationPractice/";
    static By headName= By.xpath("//h1[contains(text(),'Practice Page')]");
    public static By radio1= By.xpath("//input[@value='radio1']");
    static By dynamicDropdown= By.xpath("//input[@type='text'][@id='autocomplete']");
    static By select= By.id("dropdown-class-example");
    static By openWindow= By.id("openwindow");
    static By openTab= By.id("opentab");

    //Methods
    public static void Open(){
        DriverFactory.getDriver().get(baseUrl);
        Utils.waitUntilTitleVisible(DriverFactory.getDriver(),10,DriverFactory.getDriver().getTitle());
    }

    public static WebElement head(){
        return DriverFactory.getDriver().findElement(headName);
    }
    public static void clickRadio1(){
        WebElement radioBtn=DriverFactory.getDriver().findElement(radio1);
        Utils.waitUntilElementVisible(DriverFactory.getDriver(),10,radioBtn);
        radioBtn.click();
    }
    public static boolean isRadio1Clicked(){
        System.out.println("Button is Selected: "+DriverFactory.getDriver().findElement(radio1).isSelected());
        return DriverFactory.getDriver().findElement(radio1).isSelected();
    }
}
