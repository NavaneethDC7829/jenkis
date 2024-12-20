package ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Samplerefresh extends Generic {
	@Test
	public void run() {
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("9876054321");
		driver.navigate().refresh();
		ele.sendKeys("7829418441");
		}
}
