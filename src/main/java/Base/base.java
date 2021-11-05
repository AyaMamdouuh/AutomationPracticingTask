package Base;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base {
    public static WebDriver driver;
    public  static Properties config_properties =new Properties();
    public static  Properties data_properties=new Properties();
    public  static Properties msg_properties =new Properties();
    DesiredCapabilities caps = new DesiredCapabilities();
    public AutomationPractcing automationPractcing;

    public base() {
        PageFactory.initElements(driver,this);
        automationPractcing=new AutomationPractcing();

        try {
            FileInputStream fis = new FileInputStream(new File("src/main/resources/config.properties"));
            config_properties.load(fis);
            fis = new FileInputStream(new File("src/main/resources/data.properties"));
            data_properties.load(fis);
            fis = new FileInputStream(new File("src/main/resources/errorMessages.properties"));
            msg_properties.load(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void  launchBrowser() {
        if(config_properties.getProperty("browser_type").equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +config_properties.getProperty("driver_Path"));
            driver = new ChromeDriver();
        }
        else if (config_properties.getProperty("browser_type").equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\java\\driverBinaries\\chromedriver.exe");
            driver=new FirefoxDriver();

        }
        //driver.manage().window().maximize();
        caps.setCapability("resolution", config_properties.getProperty("BrowserResolution"));

        driver.get(config_properties.getProperty("url"));
    }
}
