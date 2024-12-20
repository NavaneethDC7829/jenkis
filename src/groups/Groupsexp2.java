package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test(groups= {"sanity","smoke"})
public class Groupsexp2 {
	 public void fblogin() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("7829418441");
		driver.findElement(By.name("pass")).sendKeys("Navi@*9742");
		driver.findElement(By.name("login")).click();
}
}
