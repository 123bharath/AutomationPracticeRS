package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import utils.ScreenshotUtil;

import java.io.File;
import java.io.IOException;

public class Hooks {
    WebDriver driver = DriverFactory.getDriver();

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screenshotPath = ScreenshotUtil.takeScreenshot(driver, scenario.getName());
            scenario.attach(new File(screenshotPath).toURI().toURL().openStream().readAllBytes(), "image/png", "Failed Screenshot");
        }
        driver.quit();
    }
}
