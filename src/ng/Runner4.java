package ng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner4  extends Generic {
	@Test
	public void run() {
		driver.findElement(By.id("email")).sendKeys("7829418441");
		driver.findElement(By.name("pass")).sendKeys("Navi@*9742");
		driver.findElement(By.name("login")).click();
	}

}
