package les3.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HW1_1 {
    public static void ElementPlacement(WebElement el1, WebElement el2) {
        int x1 = el1.getLocation().x;
        int y1 = el1.getLocation().y;
        int x2 = el2.getLocation().x;
        int y2 = el2.getLocation().y;
        System.out.println("Элемент первый размещается: x=" + x1 + ", y=" + y1);
        System.out.println("Элемент второй размещается: x=" + x2 + ", y=" + y2);

        if (y1 < y2) {
            System.out.println("Элемент первый выше");
        } else if (y1 > y2) {
            System.out.println("Элемент второй выше");
        } else {
            System.out.println("Элементы равноудалены");
        }

        if (x1 < x2) {
            System.out.println("Элемент первый левее");
        } else if (x1 > x2) {
            System.out.println("Элемент второй левее");
        } else {
            System.out.println("Элементы равноудалены");
        }


        int area1 = el1.getSize().width * el1.getSize().height;
        int area2 = el2.getSize().width * el2.getSize().height;
        if (area1 > area2) {
            System.out.println("Элемент первый больше");
        } else if (area1 < area2) {
            System.out.println("Элемент второй больше");
        } else {
            System.out.println("Элементы занимают одинаковую площадь");
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
        ElementPlacement(element1, element2);
    }
}
