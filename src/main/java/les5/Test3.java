package les5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.By.*;

/*public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php?controller=contact");
        Select contact = new Select(driver.findElement(By.xpath("//*[@id=\"id_contact\"]")));
        Thread.sleep(1500);
        contact.selectByVisibleText("Customer service");
        Thread.sleep(1500);
        driver.findElement(By.id("email")).sendKeys("wjfkwjempkweldkwl;");
        Thread.sleep(1500);
        driver.findElement(By.id("message")).sendKeys("dkfmskflklsd");
        Thread.sleep(1500);
        driver.findElement(By.id("submitMessage")).click();
        Thread.sleep(1500);
        System.out.println(driver.findElement(xpath("/html/body/div/div[2]/div/div[3]/div/div/p")).getText());
        String one = driver.findElement(xpath("/html/body/div/div[2]/div/div[3]/div/div/p")).getText();
        int count = Integer.parseInt(one.split(" ")[2]);
        System.out.println(count);
        driver.quit();*/
        /*<label for="id_contact">Subject Heading</label>
                 id="uniform-id_contact"
                          <input class="form-control grey validate id="email"" +
                <textarea class="form-control" id="message" name="message"></textarea>
                <button type="submit" name="submitMessage" id="submitMessage"
                /html/body/div/div[2]/div/div[3]/div/div/p
                /html/body/div/div[2]/div/div[3]/div/div/p*/


    /*driver.get("https://ktokuda.net/");
    WebElement countriesWebElement = driver.findElement(By.id("itt_country"));
    Select countries = new Select(countriesWebElement);
    countries.selectByIndex(3);
    Thread.sleep(1500);
    countries.selectByVisibleText("Болгария");
    Thread.sleep(1500);
    countries.selectByValue("61");
    Thread.sleep(1500);*/
    /*public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/li[1]/div/a[1]"))).pause(Duration.ofMillis(1500))
                .moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/li[1]/div/div/ul/li[1]/a"))).pause(Duration.ofMillis(1500))
                .moveToElement(driver.findElement(xpath("//*[@id=\"main-nav\"]/li[1]/div/div/ul/li[1]/div/a[1]/span")),604, 0).click().build().perform();
                //.moveByOffset(302, 0).click().build().perform();
        //System.out.println(driver.findElement(xpath("//*[@id=\"main-nav\"]/li[1]/div/div/ul/li[1]/div/a[1]/span")).getSize().width);

    }
}*/
