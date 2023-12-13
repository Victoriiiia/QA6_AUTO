package les6;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragNDropTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.ibuongiorno.com/about");
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        for (int i=0; i<3; i++) {
            actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"barba-wrapper\"]/header/nav/ul/li[4]/a")), 0, 70)
                    .clickAndHold().moveToElement(driver.findElement(By.xpath("//*[@id=\"barba-wrapper\"]/header/a/img")), 0, 70)
                    .release().build().perform();
            Thread.sleep(2500);
        }




    }
}
