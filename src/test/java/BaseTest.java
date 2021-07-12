import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void driverSetup(ITestContext context) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.demoblaze.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Assert.assertEquals(driver.getTitle(), "STORE");
            driver.manage().window().maximize();
            context.setAttribute("WebDriver",driver);
    }
    @AfterMethod
    public void closeDriver(){
        driver.close();
    }
}
