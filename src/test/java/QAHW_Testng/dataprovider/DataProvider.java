package QAHW_Testng.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvider {

    @Test(dataProvider = "SearhIsWork")
    public void SearchTest(String search) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement((By.xpath("//*[@id=\"search_query_top\"]")),search);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText().contains(search));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText().contains(search));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText().contains(search));

        @org.testng.annotations.DataProvider(name = "SearchIsWork")
        public Object[]createData(){
            return new Object[]{
                   {"машина"},
                    {"dress"},
                    {"смысл"},
            };
        }


        //*[@id="center_column"]/p взять текст
        //*[@id="center_column"]/h1/span[2] найдені 7 платьев взять тест
        //*[@id="center_column"]/p текст взять из ошибки


    }
}