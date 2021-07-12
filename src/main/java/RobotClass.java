import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;

public class RobotClass {

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thoughtworks.com/");
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_hh:mm:ss").format(Calendar.getInstance().getTime());

        Robot robot = new Robot();

        java.awt.Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Thread.sleep(4000);

        BufferedImage img = robot.createScreenCapture(new Rectangle(size));

        File path = new File("./Screenshot/"+timeStamp+".png");

        ImageIO.write(img,"PNG", path);


        /*driver.findElement(By.linkText("Courses")).click();
        Robot robot = new Robot();
        driver.findElement(By.xpath("/html/body/header/nav/div[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/input")).sendKeys("DevOps");
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_DELETE);
        Thread.sleep(4000);
        driver.quit();
*/
        driver.quit();
    }

}
