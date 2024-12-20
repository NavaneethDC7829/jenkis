package Chromeoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Disable {
	@Test
	public void dis() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(opt);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("7829418441");
		driver.findElement(By.name("pass")).sendKeys("Navi@*9742");
		driver.findElement(By.name("login")).click();
	}

}
