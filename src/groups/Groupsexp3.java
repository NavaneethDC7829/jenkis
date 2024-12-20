package groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test(groups= {"smoke"})
public class Groupsexp3 {
	 public void fblogin3() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver  driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&specId=yidregsimplified&activity=header-signup&pspid=1197806870&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.lang%3Den-IN&done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.lang%3Den-IN&intl=in&prompt=login");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("navaneethdcnavanee@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Navi@*9742");
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();

	}
}
