package pack2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annot1 {
	
	@BeforeSuite
	public void installSoftware(){
		System.out.println("Before test suite: Install Software");
	}
	@AfterSuite
    public void deinstallSoftware(){
    	System.out.println("After test suite: Deinstall software");
    }
}
