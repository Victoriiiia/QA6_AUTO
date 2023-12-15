package les3.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HW2_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        Thread.sleep(2000);
        Select car = new Select(driver.findElement(By.id("Carlist")));
        car.selectByValue("Renault Car");
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/form[2]/table/tbody/tr/td[1]/select")));
        select.selectByVisibleText("France");
        select.selectByValue("India");
        select.selectByValue("Germany");
        select.selectByValue("Italy");
        select.selectByValue("Spain");
        select.selectByValue("Malaysia");
        select.deselectByValue("India");
        select.deselectByValue("Malaysia");
        driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/form[2]/table/tbody/tr/td[2]/input[1]")).click();
    }
}



                //<select id="Carlist">
                //*[@id="post-body-4292417847084983089"]/div[1]/form[2]/table/tbody/tr/td[1]/select
                //<input onclick = "move(this.form.FromLB,this.form.ToLB)" type = "button" value = "->" >

                //countries.selectByVisibleText("Германия");
       // city.deselectByVisibleText("Все города");

      //  <option > France </
        //option > //*[@id="post-body-4292417847084983089"]/div[1]/form[2]/table/tbody/tr/td[1]/select/option[3]
        // India Germany Italy Spain Malaysia
