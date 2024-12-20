package functionaal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathfb {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
				WebDriver  driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7829418441");
				driver.findElement(By.xpath("//input[@ id='pass']")).sendKeys("Navi@");
				driver.findElement(By.xpath("//button[@ name='login']")).click();



	}

}
