import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class ProjectTest {



    @Test
    void testOne() throws IOException, InterruptedException {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.URL1);
        String firstTab = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        String secondTab = driver.getWindowHandle();
        driver.get(Helper.URL2);
        driver.switchTo().window(firstTab);
        Thread.sleep(3000);
        driver.switchTo().window(secondTab);
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(firstTab);
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();",
                driver.findElements(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/h2[1]/span[1]")));
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File path = new File(Helper.FOLDER + "myScreenshot" + Helper.JPG);
        FileUtils.copyFile(screenshot,path);
        driver.quit();
    }

}
