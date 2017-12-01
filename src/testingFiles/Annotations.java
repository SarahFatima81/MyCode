package testingFiles;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Annot1{
	
	@BeforeTest
	
	public void OpeningBrowser() throws IOException{
		
		Login();
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
		@AfterMethod
	public void ReportAdding(){
		System.out.println("Add report: Executes after every test");
	}
	
	@Test(groups = {"Priority1"})
	public void OpenBrowser(){
		System.out.println("Test1: Opened Browser");
	}
	
	@Test(groups ={"(Priority1" })
    public void FlightBooking(){
    	System.out.println("Test2: Flight Booking");
            	
    }
	
}
