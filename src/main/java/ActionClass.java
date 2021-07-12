import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        Actions action = new Actions(driver);

        WebElement elementToType = driver.findElement(By.id("twotabsearchtextbox"));

        action.keyDown(elementToType, Keys.SHIFT).sendKeys("iphone").build().perform();

        WebElement elementToClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

        action.click(elementToClick).build().perform();
        Thread.sleep(7000);
        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        driver.quit();

    }
}

