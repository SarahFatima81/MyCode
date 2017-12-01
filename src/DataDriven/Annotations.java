package DataDriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	
	public void OpeningBrowser(){
		System.out.println("Opening Browser");
	}
	@BeforeTest
	public void CloseCookies(){
		System.out.println("Before every test: Delete Cookies");
	}
	@AfterTest
	public void Cookiesclosed(){
		System.out.println("After all testcases: Delete cookies");
	}
		@BeforeMethod
	public void UserIdGeneration(){
		System.out.println("Before every method: User ID");
		
	}
	@Test(dataProvider = "getData")
	public void userID(String username, String password, String id){
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
		
	}
		@AfterMethod
	public void ReportAdding(){
		System.out.println("Add report: Executes after every test");
	}
	
	@Test
	public void OpenBrowser(){
		System.out.println("Test1: Opened Browser");
	}
	
	@Test
    public void FlightBooking(){
    	System.out.println("Test2: Flight Booking");
            	
    }
	


@DataProvider
public Object[][] getData(){
	
	//object[i][j] - i = no. of times test case should run
	               //  j = no. of parameters it should send for one go
      
     Object[][] data = new Object[3][3];

      data[0][0] = "abcd";
      data[0][1] = "xyz";
      data[0][2] = "dsfg";
      data[1][0] = "1abcd";
      data[1][1] = "1xyz";
      data[1][2] = "1dsfg";
      data[2][0] = "2abcd";
      data[2][1] = "2xyz";
      data[2][2] = "2dsfg";
      return data;
}
}
