package les4.driverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        //manage()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));

        //cookies
        driver.get("https://rozetka.com.ua/");
 /*       Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie: cookies){
            System.out.println(cookie);
        }
        System.out.println("All counts of cookies " + cookies.size());
        System.out.println("==============");
        System.out.println("Separate cookie " + cookies.toArray()[2]);
        */


        //driver.getCurrentUrl()
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        //driver.getTitle()
        driver.get("http://www.automationpractice.pl/index.php");
        System.out.println(driver.getTitle());

        //getPageSource()
        System.out.println(driver.getPageSource());

        //navigate()
        driver.navigate().to("https://dan-it.com.ua/");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().forward();
        Thread.sleep(1500);
        driver.navigate().refresh();
        Thread.sleep(1500);
        driver.quit();
    }
}
