package Selenium_Grid_Concept;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Crmpro_Grid {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
//		ChromeOptions option = new ChromeOptions();
//		option.merge(cap);
		String nodeurl = " http://192.168.1.16:14701/wd/hub";
		driver = new RemoteWebDriver(new URL(nodeurl),cap);
		driver.get("https://www.crmpro.com");
		
	}

	
	
	@Test
	public void pageTitleTest() {
		System.out.println(driver.getTitle());
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
