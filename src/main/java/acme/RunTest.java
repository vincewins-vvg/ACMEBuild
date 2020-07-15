package acme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RunTest {
	
	@Test
	public void runTest() throws InterruptedException { // for chrome
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com", Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("leaf@12", Keys.ENTER);
		Thread.sleep(2000);
		WebElement eleVendors = driver.findElement(By.xpath("//button[text()=' Vendors']"));
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(eleVendors).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Search for Vendor")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vendorName")).sendKeys("Blue Lagoon");
		driver.findElement(By.id("buttonSearch")).click();
		String country = driver.findElement(By.xpath("(//td[text()='Blue Lagoon']/following-sibling::td)[4]")).getText();
		System.out.println(country);
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
		
	}

}
