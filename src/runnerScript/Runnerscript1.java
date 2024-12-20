package runnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pomScript.Pomscript1;

public class Runnerscript1 {
	@Test
	public void Validdata() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Pomscript1 p=new Pomscript1(driver);
		p.passData("naa");
		Thread.sleep(2000);
		p.password("naa");
	}
		
}
