package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1framework {
	@Test(enabled=true)
	public void test1()
	{
		Reporter.log("hello",true);
	}
	@Test(dependsOnMethods = {"test1"})
	public void test2()
	{
		Reporter.log("world",true);
	}
	

}
