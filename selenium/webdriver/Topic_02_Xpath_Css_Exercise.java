package webdriver;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	public class Topic_02_Xpath_Css_Exercise {
		WebDriver driver;
		String errorMessage = "This is a required field.";
		boolean status = true;
		String eValidMessage = "Please enter a valid email address. For example johndoe@domain.com.";
		String pValidMessage = "Please enter 6 or more characters without leading or trailing spaces.";
		String bValidMessage = "Invalid login or password.";
		String tValidMessage = "Thank you for registering with Main Website Store.";
		String emaiTesting= "binh@mailinator.com";

		@BeforeClass
		public void beforeClass() {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
		@Test
		public void TC_01() {
			driver.get("http://live.demoguru99.com/");
			driver.findElement(By.xpath("//div[@class=\"footer\"]//a[@title=\"My Account\"]")).click();
			driver.findElement(By.xpath("//button[@title='Login']")).click();
			Assert.assertEquals("This is a required field.", errorMessage);
			Assert.assertTrue(status);
		}
		@Test
		public void TC_02() {		
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123434234@12312.123123");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@title='Login']")).click();
			Assert.assertEquals("Please enter a valid email address. For example johndoe@domain.com.", eValidMessage);
			Assert.assertTrue(status);
		}
		@Test
		public void TC_03() {		
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automation@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
			driver.findElement(By.xpath("//button[@title='Login']")).click();
			Assert.assertEquals("Please enter 6 or more characters without leading or trailing spaces.", pValidMessage);
			Assert.assertTrue(status);
		}
		@Test
		public void TC_04() {		
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automation@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123123123123123");
			driver.findElement(By.xpath("//button[@title='Login']")).click();
			Assert.assertEquals("Invalid login or password.", bValidMessage);
			Assert.assertTrue(status);
		}
		@Test
		public void TC_05() {		
			driver.findElement(By.xpath("//a[contains(@title,'Create an Account')]")).click();
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Testing");
			driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Automation");
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Binh");
			driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(emaiTesting);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("P@ssw0rd");
			driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("P@ssw0rd");
			driver.findElement(By.id("is_subscribed")).click();
			driver.findElement(By.xpath("//button[@title='Register']")).click();
			Assert.assertEquals("Thank you for registering with Main Website Store.", tValidMessage);
			Assert.assertTrue(status);
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='box-content']//p[contains(text(),'Testing Automation Binh')]")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='box-content']//p[contains(.,emaiTesting)]")).isDisplayed());
			driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[contains(text(),'Account')]")).click();
			driver.findElement(By.xpath("//li[@class=' last']//a[contains(text(),'Log Out')]")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class ='page-title']//h2[contains(.,'This is demo site for')]")).isDisplayed());
		}
		@Test
		public void TC_06() {		
			driver.findElement(By.xpath("//div[@class=\"footer\"]//a[@title=\"My Account\"]")).click();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emaiTesting);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("P@ssw0rd");
			driver.findElement(By.xpath("//button[@title='Login']")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='page-title']//h1[contains(text(),'My Dashboard')]")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='welcome-msg']//p[contains(.,'Hello, Testing Automation Binh!')]")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='box-content']//p[contains(text(),'Testing Automation Binh')]")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='box-content']//p[contains(.,emaiTesting)]")).isDisplayed());
			
		}

		@AfterClass
		public void afterClass() {
			driver.quit();
		}
	}
