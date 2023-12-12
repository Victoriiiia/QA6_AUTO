package les4.webEement;

import lesson2.Finalist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementEx2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        WebElement checkBox = driver.findElement(By.id("RememberMe"));
        System.out.println("isDisplayed? " + checkBox.isDisplayed());
        System.out.println("isEnabled? " + checkBox.isEnabled());
        System.out.println("isSelected? " + checkBox.isSelected());
        System.out.println("=================");
        Thread.sleep(1500);
        checkBox.click();
        Thread.sleep(1500);
        System.out.println("isDisplayed? " + checkBox.isDisplayed());
        System.out.println("isEnabled? " + checkBox.isEnabled());
        System.out.println("isSelected? " + checkBox.isSelected());
        driver.quit();

    }
}
