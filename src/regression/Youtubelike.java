package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Youtubelike {
	@Test(priority=3)
	public  void test() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.youtube.com/watch?v=M8iZ5W6TZpA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='I like this'and @aria-pressed='false' ]//div[@class='yt-spec-touch-feedback-shape__fill']")).click();

	}

}
