package les3.HW;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class HW1 {
    public static void openLinkInANewTab(WebDriver driver, String url) {
        Set<String> set1 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String newDescriptor = set2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get(url);
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://zoo.kiev.ua/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        openLinkInANewTab(driver, "https://www.w3schools.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        openLinkInANewTab(driver, "https://taxi838.ua/ru/dnepr/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        openLinkInANewTab(driver, "https://klopotenko.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        Set<String> handlers = driver.getWindowHandles();
        for (String handler : handlers) {
            driver.switchTo().window(handler);
            if (driver.getTitle().contains("зоопарк")) {
                driver.close();
            }
        }
        driver.quit();
    }
}