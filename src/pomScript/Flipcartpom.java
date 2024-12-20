package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipcartpom {
	
@FindBy(xpath="//img[@alt='POCO X6 Neo 5G (Martian Orange, 128 GB)']")
private WebElement phone;
@FindBy(xpath="//body/div[@id='container']/div/div[@class='_39kFie N3De93 JxFEK3 _48O0EI']/div[1]")
private WebElement phones;

public Flipcartpom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void press()
{
	phone.click();
}
public void press1()
{
	phones.click();
}
	
}
