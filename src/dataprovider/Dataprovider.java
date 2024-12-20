package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider="testData")
	public void launch(String un,String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}
	@DataProvider(name="testData")
	public Object[][]createData(){
		return new Object[][] {
			{"7829418441","Navi@*9742"},
			{"7829418441","Navi@*7829"},
			{"7829418441","Navi@*7899"},
			
		};
	}
}
