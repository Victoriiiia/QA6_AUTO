package les3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Options {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
    }
    /*    WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//button[@class='header__button ng-star-inserted'])[1]")).click();
        driver.findElement(By.id("auth_email")).sendKeys("Text");
        driver.findElement(By.id("auth_pass")).sendKeys("1223354");
        driver.findElement(By.xpath("//label[@class='auth-modal__remember-checkbox']")).click();
        System.out.println(driver.findElement(By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']")).getText());
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='modal__close']")).click();
        driver.quit();
    }*/
}
