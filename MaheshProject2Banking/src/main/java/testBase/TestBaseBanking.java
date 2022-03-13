package testBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBaseBanking {
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br) {
		
		if(br.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\mahesh\\SetUps\\ChromeDriver97SeleniumFile\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\mahesh\\SetUps\\Edge\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Please enter correct browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
