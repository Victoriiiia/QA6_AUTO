package les3.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*public class HW1_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        elementA = driver.findElement(By.id("contact-link"));
        elementB = driver.findElement(By.className("login"));
        compareElementsInfo (elementA,
                elementB);
        def compareElementsInfo (elementA, elementB):
        location1 = elementA.location;
        size1 = elementA.size;

        location2 = element2.location
        size2 = element2.size

    #Сравниваем местоположение по вертикали
        if location1['y'] < location2['y']:
        print(f"{element1.tag_name} располагается выше {element2.tag_name}.")
        elif location1[ 'y'] >location2['y']:
        print(f"{element2.tag_name} располагается выше {element1.tag_name}.")
    else:
        print(f"{element1.tag_name} и {element2.tag_name} расположены на одной и той же высоте.")

    #Сравниваем местоположение по горизонтали
        if location1['x'] < location2['x']:
        print(f"{element1.tag_name} располагается левее {element2.tag_name}.")
        elif location1[ 'x'] >location2['x']:
        print(f"{element2.tag_name} располагается левее {element1.tag_name}.")
    else:
        print(f"{element1.tag_name} и {element2.tag_name} расположены на одной и той же ширине.")

    #Сравниваем площадь элементов
                area1 = size1['width'] * size1['height']
        area2 = size2['width'] * size2['height']

        if area1 > area2:
        print(f"{element1.tag_name} занимает большую площадь.")
        elif area1 <area2:
        print(f"{element2.tag_name} занимает большую площадь.")
    else:
        print(f"{element1.tag_name} и {element2.tag_name} занимают одинаковую площадь.")


    }
}*/
