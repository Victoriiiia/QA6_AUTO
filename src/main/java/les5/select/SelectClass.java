package les5.select;

import les5.TaskForLesson5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
    public class SelectClass {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
            WebDriver driver=new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("http://ktokuda.net/");

            WebElement countriesWebElement = TaskForLesson5.findMyElement(By.id("itt_country"), driver);
            Select countries = new Select(countriesWebElement);

            //select
            countries.selectByVisibleText("Болгария");
            countries.selectByValue("61");
            countries.selectByIndex(3);


            //isMultiple
            System.out.println(countries.isMultiple());
            Select region = new Select(driver.findElement(By.id("region_list")));
            System.out.println(region.isMultiple());

            //getOptions
            countries.selectByVisibleText("Турция");
            Thread.sleep(1500);
            List<WebElement> regionList = region.getOptions();
            for (WebElement singleElement: regionList){
                System.out.println(singleElement.getText());
            }

            region.selectByVisibleText("Аланья");
            Thread.sleep(1500);
            region.selectByVisibleText("Анталия");
            Thread.sleep(1500);
            region.selectByVisibleText("Белек");
            Thread.sleep(1500);

            //deselect
            region.deselectByVisibleText("Анталия");
            Thread.sleep(1500);
            System.out.println("==================");
            List<WebElement> selectedRegions = region.getAllSelectedOptions();
            for (WebElement singleElement: selectedRegions){
                System.out.println(singleElement.getText());
            }
            //getFirstSelectedOption()

            //deselectAll()
            region.deselectAll();
            Thread.sleep(1500);
            driver.quit();


        }
    }
