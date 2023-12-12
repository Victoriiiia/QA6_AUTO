package les5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
public class DragNDropEx1 {
    public static void main(String[] args) throws InterruptedException {
        //https://www.signesduquotidien.org/
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.signesduquotidien.org/");
        // .dots-icon
        // .icon-ouverture
        // .icon-projets

        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.cssSelector(".dots-icon")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.cssSelector(".icon-ouverture")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector(".dots-icon")))
                .release()
                .build().perform();

        Thread.sleep(7000);
        driver.findElement(By.id("menu-btn")).click();
        Thread.sleep(3000);
        actions.dragAndDrop(driver.findElement(By.cssSelector(".icon-projets")),
                driver.findElement(By.cssSelector(".dots-icon"))).perform();
    }
}
