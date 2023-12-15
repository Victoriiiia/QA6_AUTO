package les6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        /*driver.get("https://www.demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.tagName("Body")).getText());
        WebElement child=driver.findElement(By.xpath("//iframe[srcdoc='<p>Child frame</p>']"));
        driver.switchTo().frame(child);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().defaultContent();*/
        /*driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        /*try {
            driver.findElement(By.id("accept-choices")).click();
        } catch (Exception e ){
            System.out.println("Not found");
        }*/
       /* driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe")));
        driver.switchTo().frame(driver.findElement
                        (By.xpath("//*[@id=\"tnb-google-search-mobile-show\"]/svg")));
        driver.findElement(By.xpath("//*[@id=\"tnb-google-search-mobile-show\"]/svg")).sendKeys("kdejkejdkesjdkesjdkesjdksejdksejmd");

        Thread.sleep(3000);*/
        /*try {
            driver.findElement(By.id("accept-choices")).click();
        } catch (Exception e ){
            System.out.println("Not found");
        }*/
        //driver.findElement(By.xpath("//*[@id=\"tnb-google-search-input\"]")).sendKeys("eijrkerjmkrjmkoremvgkoermvgkeekrmvkerdmv");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(5000);
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
        String resultAlert = "You successfully clicked an alert";
        boolean resultAlert1 = driver.findElement(By.id("result")).getText().equals(resultAlert);
        if (resultAlert1) {
            System.out.println("Good job babe");
        } else {
            System.out.println("DO IT");
        }
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(5000);
        System.out.println(alert1.getText());
        alert2.dismiss();
        Thread.sleep(5000);
        String resultConfirm = "You clicked: Cancel";
        boolean resultConfirm1 = driver.findElement(By.id("result")).getText().equals(resultConfirm);
        if (resultConfirm1) {
            System.out.println("You clicked: Cancel");
        } else {
            System.out.println("DO IT");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(2000);
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.sendKeys("qa");
        Thread.sleep(2000);
        alert3.accept();
        String resultPrompt = "You entered: qa";
        boolean resultPrompt1 = driver.findElement(By.id("result")).getText().equals(resultPrompt);
        if (resultPrompt1) {
            System.out.println("You entered: qa");
        } else {
            System.out.println("DO IT");
        }
    }
}

