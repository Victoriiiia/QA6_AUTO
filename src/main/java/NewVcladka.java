import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class NewVcladka {
    public static void NewVcladka (WebDriver driver, String url) {
            Set<String> set1 = driver.getWindowHandles();
            ((JavascriptExecutor) driver).executeScript("window.open()");
            Set<String> set2 = driver.getWindowHandles();
            set2.removeAll(set1);
            String newDescriptor = set2.iterator().next();
            driver.switchTo().window(newDescriptor);
            driver.get(url);
    }
}
