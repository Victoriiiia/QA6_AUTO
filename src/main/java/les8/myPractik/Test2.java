package les8.myPractik;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/modal-dialogs");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"showSmallModal\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"closeSmallModal\"]")));
        System.out.println(driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]")).getText());
        driver.findElement(By.xpath("//*[@id=\"closeSmallModal\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"showLargeModal\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"closeLargeModal\"]")));
        System.out.println(driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/p")).getText());
        driver.findElement(By.xpath("//*[@id=\"closeLargeModal\"]")).click();

    }
}
