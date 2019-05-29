package org.junit;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelValidation {
	static 	WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/index.php");
	}
	@AfterClass
	public static void AfterClass() {
		driver.quit();
	}
	@Before
	public void beforeMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void afterMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void Test() {
		WebElement txtname = driver.findElement(By.id("username"));
		txtname.sendKeys("Renu123456");
		Assert.assertEquals("Renu123456", txtname.getAttribute("value"));
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("123456");
		Assert.assertEquals("123456", txtpass.getAttribute("value"));
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("SearchHotel"));
	}

}
