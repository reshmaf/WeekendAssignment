package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       /* driver.get("https://www.lambdatest.com/");
        assertEquals(driver.getTitle(), "Most Powerful Cross Browser Testing Tool Online | LambdaTest");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Actions act = new Actions(driver);
        // Scroll Down using Actions class
        act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(4000);
        // Scroll Up using Actions class
        act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();*/
        driver.get("https://www.demoblaze.com/");
        Actions action = new Actions(driver);
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        action.click(login).build().perform();
        Thread.sleep(4000);
        WebElement username = driver.findElement(By.xpath("//input[@id='loginusername']"));
        action.keyDown(username, Keys.SHIFT).sendKeys("sherlock").build().perform();
        Thread.sleep(4000);
        WebElement password = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input"));
        password.click();
        action.keyDown(username, Keys.SHIFT).sendKeys("1234").build().perform();
        Thread.sleep(4000);
        WebElement buttonLogin = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        action.click(buttonLogin).build().perform();
        Thread.sleep(4000);
        // Scroll Down using Actions class
        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(4000);
        // Scroll Up using Actions class
        action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
    }
}
