package irctc.Utils;







import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public WebDriver driver;
	
	public String URL= "https://www.irctc.co.in/nget/train-search";
	
	@BeforeSuite
	public void open_browser () {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver ();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
@AfterSuite (enabled=true)
public void close_browser () {
	driver.quit();
	

}
}
