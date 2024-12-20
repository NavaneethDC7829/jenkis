package ng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Runner extends Generic {
	@Test
	public void run() {
		driver.findElement(By.id("email")).sendKeys("7829418441");
		driver.findElement(By.name("pass")).sendKeys("Navi@*9742");
		driver.findElement(By.name("login")).click();
	    String Title = driver.getTitle();
	    System.out.println(Title);
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(Title, "Facebook – log in or sign up");
	    System.out.println("rakshi");
	    sa.assertAll();
	    }

}
