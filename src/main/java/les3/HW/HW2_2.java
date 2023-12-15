package les3.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

/*public class HW2_2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        Thread.sleep(8000);
        driver.get("http://www.ashortjourney.com");
        Thread.sleep(8000);
        Actions actions = new Actions(driver);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"ui-intro\"]")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ui-right\"]/li[2]/a")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ui-credits\"]")).getLocation());
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-credits\"]")),370,200)
                .clickAndHold()
                .moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-right\"]/li[2]/a")), 590, 300)
                .build().perform();*/


    }
}
