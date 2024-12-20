package runnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pomScript.Flipcartpom;

public class Fliprunner {
@Test
public void flip() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_c67ba26e-2157-467c-bb30-ca4ca8fd6e56_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");
	Flipcartpom fp=new Flipcartpom(driver);
	Thread.sleep(3000);
	fp.press();
	Thread.sleep(2000);
	String window = driver.getWindowHandle();
	
}

}

