package genericscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screensh {
	public static void getPhoto(WebDriver driver) throws IOException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	String photo="./Photos1/";
	Date d=new Date();
	String d1=d.toString();
	String d2=d1.replaceAll(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File(photo+d2+".jpeg");
	
	FileHandler.copy(src, dst);
	
	
	
	
	}
	}
