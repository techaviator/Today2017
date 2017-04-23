package day10.testng;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider(name="dp")
	public static Object[][] setData(){
		Object[][] obj = new Object[2][2];
		/*obj[0][0] = "Sachin";
		obj[0][1] = "10000";
		obj[1][0] = "Sachin Tendulkar";
		obj[1][1] = "20000";*/
		return obj;
		
	}

}
