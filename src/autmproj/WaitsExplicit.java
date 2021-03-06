package autmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExplicit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://alaskatrips.poweredbygps.com");
		
		driver.findElement(By.xpath(".//*[@id='tab-hotel-tab']")).click();
		driver.findElement(By.id("hotel-destination")).sendKeys("nyc");
		driver.findElement(By.id("hotel-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("hotel-checkin")).sendKeys(Keys.ENTER);
		
		
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='21238']/div[2]/div/a")));		
		driver.findElement(By.xpath(".//*[@id='21238']/div[2]/div/a")).click();
		
		
	}

}
