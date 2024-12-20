package groups;

import org.testng.annotations.Test;

public class Groups {
	@Test (groups= {"sanity"})
	public void test1()
	{
		System.out.println("this is tc1");
	}
	@Test(groups= {"sanity","smoke"})
	public void test2()
	{
		System.out.println("this is tc2");
	}
	@Test(groups= {"smoke"})
	public void test3()
	{
		System.out.println("this is tc3");
	}
}
