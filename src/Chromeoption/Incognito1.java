package Chromeoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito1 {

	public static void main(String[] args)  throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--incognito");
			WebDriver driver=new ChromeDriver(opt);
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("7829418441");
			driver.findElement(By.name("pass")).sendKeys("Navi@*9742");
			driver.findElement(By.name("login")).click();
		}

	}


