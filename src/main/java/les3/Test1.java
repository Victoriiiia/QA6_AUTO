package les3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        /*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='header__button ng-star-inserted'])[1]")).click();
        driver.findElement(By.id("auth_email")).sendKeys("Text");
        driver.findElement(By.id("auth_pass")).sendKeys("1223354");
        driver.findElement(By.xpath("//label[@class='auth-modal__remember-checkbox']")).click();
        System.out.println(driver.findElement(By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='modal__close']")).click();
        Thread.sleep(2000);
        driver.quit();

        /*driver.get("http://www.automationpractice.pl/");
            String inputForSearch = "iPhone 11";
            driver.findElement(By.xpath("(//input[@type ='text'])[1]")).sendKeys(inputForSearch);

            driver.findElement(By.xpath("(//button[@type ='submit'])[1]")).click();
            Thread.sleep(3000);
            String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();

            boolean contains = resultSearchText.contains(inputForSearch);
            if(contains){
                System.out.println("Search works correct!");
            } else {
                System.out.println("Search is not working :(");
            }
            driver.quit();*/

        /*driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        try {
            Finalist.acceptCookies(driver);
        } catch (Exception e){

        }
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='columned block block-4-12']/a"));
        for (WebElement element : webElementList) {
            System.out.println(element.getText());
        }

        driver.quit();*/


    }
}
