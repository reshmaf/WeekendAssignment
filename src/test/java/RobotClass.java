import java.awt.*;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClass extends BaseTest{
    @Test
    public void clickOnLogin() throws AWTException, InterruptedException {
        Robot robot=new Robot();
        robot.mouseMove(700, 700);
        Thread.sleep(2000);
        //robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        /*driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyPress(KeyEvent.VK_RIGHT);*/
        Thread.sleep(2000);
        //robot.keyPress(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
        driver.findElement(By.xpath("//input[@id='loginusername']")).click();
        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("resh");

        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_1);

        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_P);

        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_A);

        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_L);

        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_I);
    }
}
