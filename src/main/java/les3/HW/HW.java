package les3.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys( "Printed Chiffon Dress");
        Thread.sleep(3000);
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        driver.findElement(By.id("search_query_top")).sendKeys( "Faded Short");
        Thread.sleep(2000);
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]")).click();








        /*<a class="product-name" href="http://www.automationpractice.pl/index.php?id_product=1&amp;controller=product&amp;search_query=Faded+Short&amp;results=1" title="Faded Short Sleeve T-shirts" itemprop="url">
                Faded Short Sleeve T-shirts
                </a>*/


        /*<span class="continue btn btn-default button exclusive-medium" title="Continue shopping">
						<span>
							<i class="icon-chevron-left left"></i>Continue shopping
                </span>
					</span>*/
                /*<a class="btn btn-default button button-medium" href="http://www.automationpractice.pl/index.php?controller=order" title="Proceed to checkout" rel="nofollow">
						<span>
                Proceed to checkout<i class="icon-chevron-right right"></i>
						</span>
					</a>.click();*/
        /*<span>
							<i class="icon-chevron-left left"></i>Continue shopping
                </span>*/
        /*<span class="continue btn btn-default button exclusive-medium" title="Continue shopping">
						<span>
							<i class="icon-chevron-left left"></i>Continue shopping
                </span>
					</span>*/



        /*<a class="product-name" href="http://www.automationpractice.pl/index.php?id_product=7&amp;controller=product&amp;search_query=Printed+Chiffon+Dress&amp;results=2" title="Printed Chiffon Dress" itemprop="url">
                Printed Chiffon Dress
						</a>*/



        //driver.quit();

    }
}
