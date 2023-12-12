package les5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsEx {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dan-it.com.ua/uk/");
        Actions actions = new Actions(driver);

        //moveTo
        /*actions.moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']"))).perform();
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Тестування']"))).perform();
        driver.findElement(By.xpath("//a[text()='Quality Assurance (QA)']")).click();*/

/*        actions
                .moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Тестування']")))
                .click(driver.findElement(By.xpath("//a[text()='Quality Assurance (QA)']")))
                .build().perform();*/

        //.moveByOffset()
        //Дата-аналітика Java
 /*       actions
                .moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Дата-аналітика']")),0,42)
                .click(driver.findElement(By.xpath("//a[text()='Java']")))
                .build().perform();*/


/*        actions
                .moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Дата-аналітика']")))
                .moveByOffset(0,42)
                .click(driver.findElement(By.xpath("//a[text()='Java']")))
                .build().perform();*/

        //keyDown, keyUp
        actions
                .moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Дата-аналітика']")))
                .moveByOffset(0,42)
                .keyDown(Keys.COMMAND)
                .click(driver.findElement(By.xpath("//a[text()='Java']")))
                .keyUp(Keys.COMMAND)
                .build().perform();








    }
}
