package testingFiles;

import java.io.IOException;

import org.testng.annotations.Test;

public class DependencyAnnot extends Annot1 {
	
	@Test (groups = {"Priority1"})
	public void OpeningBrowser() throws IOException{
		Login();
		System.out.println("Opens the browser");
		
	}
	@Test(dependsOnMethods = "OpeningBrowser", alwaysRun = true)
    public void flightBooking(){
    	System.out.println("Books a Flight");
    }
	
	@Test (enabled = false)
	public void Payment(){
		System.out.println("Processing payment");
	}
	@Test(timeOut = 50000)
	public void timeLimit(){
		System.out.println("Test should end in 50 secs");
		
	}
}
