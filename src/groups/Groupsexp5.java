package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test(groups= {"regression"})
public class Groupsexp5 {
	 public void fblogin5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://106.51.87.42:9007/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("nkp@gmail.com");
		driver.quit();

	}
}
