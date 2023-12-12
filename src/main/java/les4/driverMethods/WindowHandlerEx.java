package les4.driverMethods;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class WindowHandlerEx {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dan-it.com.ua/");
        System.out.println(driver.getWindowHandle());

        Set<String> set1 = driver.getWindowHandles();


        ((JavascriptExecutor)driver).executeScript("window.open()");

        Set<String> set2 = driver.getWindowHandles();
        System.out.println(set1);
        System.out.println(set2);

        set2.removeAll(set1);
        String newDescriptor = set2.iterator().next();
        System.out.println(newDescriptor);
        driver.switchTo().window(newDescriptor);

        driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(2000);
        driver.quit();
    }
}
