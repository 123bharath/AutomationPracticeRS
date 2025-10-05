package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {
    public WebDriverWait explicitWait(WebDriver driver, int seconds){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(seconds));
        return wait;
    }


}
