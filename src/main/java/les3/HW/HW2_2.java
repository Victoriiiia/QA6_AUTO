package les3.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HW2_2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("http://www.ashortjourney.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ui-intro\"]")).click();
        Thread.sleep(4000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ui-right\"]/li[2]/a")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ui-credits\"]")).getLocation());
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")), 0, 100)
                .release().build().perform();
        Thread.sleep(10000);
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")), 100, 0)
                .release().build().perform();
        Thread.sleep(10000);
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")), 100, 0)
                .release().build().perform();
        Thread.sleep(10000);
        Actions actions4 = new Actions(driver);
        actions4.moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")), 0, -50)
                .release().build().perform();
        Thread.sleep(10000);
        Actions actions5 = new Actions(driver);
        actions5.moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")), 0, 50)
                .release().build().perform();
        Thread.sleep(10000);
        Actions actions6 = new Actions(driver);
        actions6.moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")), 100, 0)
                .release().build().perform();
        Thread.sleep(10000);
        Actions actions7 = new Actions(driver);
        actions7.moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")), 0, -50)
                .release().build().perform();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("#postcard-back-content > textarea")).sendKeys("Задание выполнено!");


    }
}
