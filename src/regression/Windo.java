package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Windo {
@Test(priority=2)
	public  void test() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver  driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String dr = driver.getWindowHandle();
		System.out.println(dr);
	}

}
