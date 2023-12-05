package les3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    /*public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");*/

    /*//На сайте https://rozetka.com.ua/  в поисковике набрать iPhone 11, нажать кнопку поиск.
    // Вывести в консоль инфомацию о том, содержит ли заголовок на странице резултатов поиска
    // искомое слово iPhone 11.*/
    /*public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//input[@type = \"text\"]")).sendKeys( "iPhone 11");
        driver.findElement(By.xpath("//button[@class = \"button button_color_green button_size_medium search-form__submit\"]")).click();

    }
}*/
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        driver.findElement(By.xpath("(//input[@type ='text'])[1]")).sendKeys(inputForSearch);

        driver.findElement(By.xpath("(//button[@type ='submit'])[1]")).click();
        Thread.sleep(3000);
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();

        boolean contains = resultSearchText.contains(inputForSearch);
        if (contains) {
            System.out.println("Search works correct!");
        } else {
            System.out.println("Search is not working :(");
        }
        driver.quit();
    }
}