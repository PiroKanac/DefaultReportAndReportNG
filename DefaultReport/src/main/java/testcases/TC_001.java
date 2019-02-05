package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class TC_001 {
		
		@Test
		public void tc_001() {
	
			System.out.println("*******************");
			System.out.println("launching Chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnikolic\\Downloads\\Selenium\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("https://google.com");
			System.out.println("Navigate to URL");
			driver.findElement(By.name("q")).sendKeys("Hello Selenium!");
			Assert.assertTrue(true);
			driver.quit();
	
		}
	}
