package les7.waiters;

import driverFactory.DriverSetUp;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utilis.WaiterClass;

import java.time.Duration;

public class CustomWaitersEx {
    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        new WaiterClass(driver).waitForVisabilityOfWebElement(By.id("ez-accept-all"));


    }
}
