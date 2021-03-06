import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Assert {

    private static String driverPath = "/home/anton/IdeaProjects/Jenkins_Testnig/driver/";
    public static WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp() {


        System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");

        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
//        driver.manage().window().maximize();
    }

    @AfterSuite
    public void turnOfDriver() {
        driver.close();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
