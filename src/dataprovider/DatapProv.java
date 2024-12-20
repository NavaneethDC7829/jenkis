package dataprovider;

import org.testng.annotations.DataProvider;

public class DatapProv {
	@DataProvider(name="LoginData")
	public Object[][] getData(){
		Object[][] data= {{"navaneeth@gamil.com","nwh122"},{"bababa","wiwalm"},{"jijwi","jwioji"}};
		return data;
		
	}

}
