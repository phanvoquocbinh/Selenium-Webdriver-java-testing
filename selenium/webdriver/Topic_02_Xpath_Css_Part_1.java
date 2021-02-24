package webdriver;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	public class Topic_02_Xpath_Css_Part_1 {
		WebDriver driver;

		@BeforeClass
		public void beforeClass() {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		}

		@Test
		public void TC_01_ID() {
			driver.findElement(By.id("FirstName")).sendKeys("Automation Testing");
			driver.findElement(By.id("Email")).sendKeys("phanvoquocbinh@gmail.com");
			
		}

		@Test
		public void TC_02_Classname() {
			driver.findElement(By.className("search-box-text")).sendKeys("Macbook");
			
		}

		@Test
		public void TC_03_Name() {
			driver.findElement(By.name("Company")).sendKeys("selenium");
		}
		@Test
		public void TC_04_TagName() {
			// Đếm số lượng
			System.out.println(driver.findElements(By.tagName("select")));
		}
		@Test
		public void TC_05_Link_Text() {
			Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
		}
		@Test
		public void TC_06_Partical_Link_Text() {
			// Chỉ cần sử dũng half character để bắt
			Assert.assertTrue(driver.findElement(By.partialLinkText("Digital")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.partialLinkText("downloads")).isDisplayed());
		}
		@Test
		public void TC_07_CSS() {
			// # là ký tứ đại điên cho ID
			driver.findElement(By.cssSelector("#Password")).sendKeys("Password");
			// Lấy cái name thay vì truyền ID
			driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Password");
		}
		@Test
		public void TC_08_Xpath() {
			// Thêm // trước tag name và @ trước attribute
			driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).clear();
			driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("P@ssw0rd");
		}

		@AfterClass
		public void afterClass() {
			driver.quit();
		}
	}
