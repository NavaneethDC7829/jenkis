package ng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericscreenshot.Screensh;

public class Generic {
	public WebDriver driver;
	@BeforeMethod 
	public void apli() {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void Capss() throws IOException {
		Screensh.getPhoto(driver);
	}
	@AfterClass
	public void closer()
	{
		
		driver.close();
	}

}
