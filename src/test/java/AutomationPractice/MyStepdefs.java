package AutomationPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyStepdefs {
    @io.cucumber.java.en.When("^open the chrome browser$")
    public void openTheChromeBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aya-Mamdouh\\Documents\\NetBeansProjects\\firstGithubRepo\\src\\test\\java\\driverBinaries\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("http://www.google.com");
    }
}
