package QAHW_Testng.parameters;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilis.ActionsClass;

import java.awt.image.Kernel;

import static org.openqa.selenium.Keys.ENTER;

public class ParametersHWTask {

    static WebDriver driver;
    static ActionsClass actionsClass;

    @BeforeClass
    public void precondition() {
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }

    @AfterClass
    public void postConditions() {
        driver.quit();
    }


    @Test
    @Parameters({"search"})
    public void searchTest(String search) throws InterruptedException {
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        Thread.sleep(3000);
        actionsClass.sendKeys(By.xpath("//*[@id=\"search_query_top\"]"), search);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys(ENTER);
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText().contains("машина"));
        Thread.sleep(3000);

        /*actionsClass.sendKeys(By.xpath("//*[@id=\"search_query_top\"]"), search);
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys(ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText().contains("dress"));
        Thread.sleep(3000);

        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        actionsClass.sendKeys(By.xpath("//*[@id=\"search_query_top\"]"), search);
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys(ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText().contains("смысл"));
        Thread.sleep(3000);*/
    }
}