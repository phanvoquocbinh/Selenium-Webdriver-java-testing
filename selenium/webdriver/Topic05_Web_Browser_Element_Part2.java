package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic05_Web_Browser_Element_Part2 {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@Test
	public void BeforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "/Browser Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void TC_01_WebElement_Command() {
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		WebElement element = driver.findElement(By.cssSelector("div[class='buttons-set']>button"));
		element.getAttribute("class");
		System.out.println("The attribute checkbox is " + element.getAttribute("class"));
		element.getCssValue("background");
		System.out.println("The css checkbox is " + element.getCssValue("background"));
		driver.quit();
		}
		

	@Test
	public void TC_02_GetCheckbox() {
		//driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		//List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//System.out.println("The total checkbox is" + checkboxes.size());
		//for (WebElement checkbox: checkboxes) {
		//	checkbox.click();
		

	}



}
