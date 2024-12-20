package system;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Yahooxp {
	@Test(priority=4)
	public  void test() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver  driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&specId=yidregsimplified&activity=header-signup&pspid=1197806870&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.lang%3Den-IN&done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.lang%3Den-IN&intl=in&prompt=login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='signups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("navaneeth");
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("dc");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("navaneethdc12345678");
		driver.quit();
	}

}
