package listenerss;

import org.testng.annotations.Test;

public class Listenerscript {
	@Test
	public void Compose() {
		System.out.println("msg composed");
	}
	@Test(dependsOnMethods = "Compose")
	public void sentItems()
	{
		System.out.println("msg sent");
	}
	@Test(dependsOnMethods = "sentItems")
	public void trash() {
		System.out.println("msg deleted");
	}
}
