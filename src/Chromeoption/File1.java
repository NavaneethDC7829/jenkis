package Chromeoption;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Navaneeth/Documents/up.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("a1"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Navaneeth\\Desktop\\autofile\\autof.exe");
		
		
	}

}
