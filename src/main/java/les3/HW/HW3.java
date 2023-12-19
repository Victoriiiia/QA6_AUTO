package les3.HW;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.Set;

public class HW3 {
    public static void openLinkInANewTab(WebDriver driver, String url) {
        Set<String> set1 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String newDescriptor = set2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get(url);
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search");
        Thread.sleep(1000);
        driver.findElement(By.id("APjFqb")).sendKeys("https://www.guinnessworldrecords.com/account/register?");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        Thread.sleep(1500);
        openLinkInANewTab(driver, "https://www.guinnessworldrecords.com/account/register?");
        Thread.sleep(1500);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        openLinkInANewTab(driver, "https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        Thread.sleep(18000);
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        driver.findElement(By.id("fname")).clear();
        driver.findElement(By.id("fname")).sendKeys("Victoria");
        driver.findElement(By.id("lname")).clear();
        driver.findElement(By.id("lname")).sendKeys("Li");
        driver.findElement(By.xpath("/html/body/form/input[3]")).click();
        System.out.println(driver.findElement(By.cssSelector("body > div.w3-panel.w3-pale-yellow.w3-leftbar.w3-border-yellow > p")).getText());
        driver.switchTo().defaultContent();
        Set<String> handlers = driver.getWindowHandles();
        for (String handler : handlers) {
            driver.switchTo().window(handler);
            if (driver.getCurrentUrl().equals("https://www.guinnessworldrecords.com/account/register?")) {
                break;
            }
        }
        driver.findElement(By.id("LastName")).sendKeys("Li");
        driver.findElement(By.id("FirstName")).sendKeys("Victoria");
        driver.findElement(By.id("DateOfBirthDay")).sendKeys("15");
        driver.findElement(By.id("DateOfBirthMonth")).sendKeys("4");
        driver.findElement(By.id("DateOfBirthYear")).sendKeys("1994");
        Select country = new Select(driver.findElement(By.id("Country")));
        country.selectByVisibleText("Ukraine");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"State\"]")).sendKeys("Dnipro");
        Thread.sleep(3000);
        driver.findElement(By.id("EmailAddress")).sendKeys("777belka555@rambler.ru");
        driver.findElement(By.id("ConfirmEmailAddress")).sendKeys("777belka555@rambler.ru");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123444");
        driver.findElement(By.id("ConfirmPassword")).sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div/form/section[2]/div[2]/div[2]/span/span")).getText());
        Set<String> handlers1 = driver.getWindowHandles();
        for (String handler : handlers) {
            driver.switchTo().window(handler);
            if (driver.getCurrentUrl().equals("\"https://www.hyrtutorials.com/p/alertsdemo.html\"")) {
                break;
            }
        }
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();
        /*System.out.println(alert2.getText());
        alert2.dismiss();
        Thread.sleep(1000);
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();*/








    }
}


        //iframeResult
        /*imya   fname
        famili  lname
         submit       /html/body/form/input[3]*/





       /* ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> set2 = driver.getWindowHandles();
        String newDescriptor = set2.iterator().next();
        driver.switchTo().window(newDescriptor);*/


