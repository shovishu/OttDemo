package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.ConfigReader;

import java.time.Duration;


public class BaseTest {
    public static WebDriver driver;
//    public static WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public void initialization() {

        String browserName = ConfigReader.getProperty("browser");
        if(browserName.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")){
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        driver.get(ConfigReader.getProperty("url"));
    }
}
