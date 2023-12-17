package les3.HW;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;


public class HW1_3 {
    public static void InfoElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        System.out.println("ID элемента: " + element.getAttribute("id"));
        System.out.println("Тэг элемента: " + element.getTagName());
        System.out.println("Класс элемента: " + element.getAttribute("class"));
        System.out.println("Атрибут элемента:  " + element.getAttribute("name"));
        System.out.println("Текст элемента: " + element.getText());
        int centerX = element.getLocation().x + element.getSize().width / 2;
        int centerY = element.getLocation().y + element.getSize().height / 2;
        System.out.println("Координаты центра контейнера:  x=" + centerX + ", y=" + centerY);
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(2500);
        By locator = By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a");
        Thread.sleep(2500);
        InfoElement(driver, locator);

    }
}
