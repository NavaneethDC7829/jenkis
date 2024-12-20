package runnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pomScript.Pomscript;

public class RunnerScript {
	@Test
	public void Validdata() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Pomscript p=new Pomscript(driver);
		p.passData();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.passData();		
	}

}
