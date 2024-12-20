package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomscript {
	@FindBy(id="email")
	private WebElement uName;
	public Pomscript(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passData()
	{
		uName.sendKeys("admin");
	}
	
}
