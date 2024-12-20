package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomscript1 {
		@FindBy(id="email")
		private WebElement uName;
		@FindBy(id="pass")
		private WebElement psw;
		
		public Pomscript1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void passData(String UN)
		{
			uName.sendKeys(UN);
		}
			public void password(String pw)
			{
			psw.sendKeys(pw);


}}
