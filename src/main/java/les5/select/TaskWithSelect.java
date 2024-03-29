package les5.select;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TaskWithSelect {
    /*
    Открыть страницу http://www.automationpractice.pl/index.php?controller=contact ввести в поле Message любой произвольный текст.
    В поле Subject Heading выбрать Customer service. Остальные поля оставить пустыми. Нажать кнпку Send.
    Получить из уведомления об ошибке количество этих ошибок типа int. Вывести в консоль это количество ошибок.
    */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php?controller=contact");
        Select selectElement = new Select(driver.findElement(By.id("id_contact")));
        selectElement.selectByVisibleText("Customer service");
        driver.findElement(By.id("email")).sendKeys("Massage");
        driver.findElement(By.id("message")).sendKeys("New massage");
        driver.findElement(By.id("submitMessage")).click();
        String text = driver.findElement(By.xpath("//div[@class='alert alert-danger']/p")).getText();
        int countOfError = Integer.parseInt(text.split("\\s")[2]);
        System.out.println("Count of error is " + countOfError);
        driver.quit();
    }

}

