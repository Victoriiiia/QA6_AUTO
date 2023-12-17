package les6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Testing2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Actions actions = new Actions(driver);
        Thread.sleep(1500);
        actions.contextClick(driver.findElement(By.xpath("//*[@id=\"authentication\"]/span")))
                .perform();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//span[text()='Quit']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"))).perform();
        Thread.sleep(1500);
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.accept();
        Thread.sleep(1500);




    }
}
