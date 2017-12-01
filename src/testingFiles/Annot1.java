package testingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Annot1 {
	
	public WebDriver driver = null;
	
	@Test
	public void Login() throws IOException{
		 
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\syed\\workspace\\Framework\\bin\\testingFiles\\datadriven.properties"); //System.getProperty("user.dir") + "/" + "datadriven.properties");//"C:\\Users\\syed\\workspace\\Framework\\src\\testingFiles\\datadriven.properties"); //System.getProperty("user.dir") + "/" + "datadriven.properties"); 
		prop.load(fis);
		
		//System.out.println(prop.getProperty("username"));
		
		
		//System.out.println("Before test suite: Login");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		if(prop.getProperty("browser").equals("firefox")){
			WebDriver driver = new FirefoxDriver();
			
		}
		else //(prop.getProperty("browser").equals("chrome"))
	{
		

			
		driver = new ChromeDriver();
		
		
		//else{
			
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\syed\\Downloads\\IEDriverServer_x64_3.6.0 (2)\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
			
	//}
		
			
		
	}
		driver.get(prop.getProperty("url"));
	//@Test
   // public void deinstallSoftware(){
    	//System.out.println("After test suite: Deinstall software");
	}
}

