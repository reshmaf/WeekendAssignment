package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();

        Robot robot = new Robot();
        Thread.sleep(4000);
        robot.mouseWheel(10);
       /* robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(4000);
        System.out.println("a");
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(4000);
        System.out.println("b");
        robot.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(4000);
        System.out.println("c");
        robot.mouseMove(30,100);
        Thread.sleep(4000);
        System.out.println("d");*/
        driver.quit();
    }
}