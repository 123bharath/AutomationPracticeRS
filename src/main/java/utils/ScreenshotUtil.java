package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    /**
     * Takes a screenshot and saves it under /screenshots folder
     * with a timestamp-based file name.
     *
     * @param driver   WebDriver instance
     * @param testName Name of the test or scenario
     * @return The path of the saved screenshot file
     */
    public static String takeScreenshot(WebDriver driver, String testName) {
        // Create folder if not exists
        String folderPath = System.getProperty("user.dir") + "/screenshots/";
        File directory = new File(folderPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Create timestamp
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String filePath = folderPath + testName + "_" + timeStamp + ".png";

        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(filePath));
            System.out.println("✅ Screenshot saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("❌ Failed to save screenshot: " + e.getMessage());
        }

        return filePath;
    }
}
