package les2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /*driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("globe"));
        button.click();*/

        //find by name
        /*driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("QA-6");*/

        /*//By className
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(5000);
        driver.findElement(By.className("useraccount2")).click();*/

        //By linkText
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        driver.findElement(By.className("useraccount2")).click();
        Thread.sleep(5000);
        //driver.findElement(By.linkText("Forgotten your password?")).click();
        driver.findElement(By.partialLinkText("Create a")).click();










    }



    // public static void main(String[] args) throws InterruptedException {
    //   WebDriverManager.chromedriver().setup();
    // WebDriver driver = new ChromeDriver();
    //driver.manage().window().maximize();


    //поиск по id
        /*
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(By.id("ez-accept-all"));
        acceptCookies.click();*//*
        try {
            driver.findElement(By.id("ez-accept-all")).click();
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        Thread.sleep(5000);
        driver.findElement(By.id("globe")).click();
        //driver.findElement(By.xpath("//a[@title='Select Language']")).click();
*/






    //By TagName
/*        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
        acceptCookies(driver);
        Thread.sleep(2000);
        String textOfH1 = driver.findElement(By.tagName("h1")).getText();
        System.out.println(textOfH1);
        driver.quit();*/


}