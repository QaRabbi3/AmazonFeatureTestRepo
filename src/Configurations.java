package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



import Utilities.GenericMethods;

public class Configurations extends GenericMethods {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Start Test Suuite");
	}
	
	@Parameters("URL")
	@BeforeTest
	public void Setup(String URL) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\AmazonFeatureTest\\Driver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		MaxPage();
		LaunchURL(URL);
	}
	

	
	
	@AfterTest
	public void TestingClosing() {
	System.out.println("closing testing");
	applicationLog.info("closing testing");
	
		driver.close();
	}
	
	
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("End of test Suite");
		applicationLog.info("End of test Suite");
	}
	
}
