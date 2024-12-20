package functionaal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tree {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver  driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@title='Month']"));
		Thread.sleep(3000);
        Select s=new Select(ele);
        TreeSet<String>l=new TreeSet<String>();
        List<WebElement> n = s.getOptions();
        for(WebElement a:n)
        {
        	String text=a.getText();
        	l.add(text);
        }
        for(String m:l)
        {
        	System.out.println(m);
        }
        driver.quit();

	}

}
