package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {
    public static void waitUntilElementVisible(WebDriver driver, int seconds, WebElement element){
        WebDriverWait wait= new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitUntilTitleVisible(WebDriver driver, int seconds, String element){
        WebDriverWait wait= new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.titleIs(element));
    }
}
