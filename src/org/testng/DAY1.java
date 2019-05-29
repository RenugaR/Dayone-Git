package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DAY1 {
	@Parameters({"Username","Password"})
	@Test
	private void test1(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtname = driver.findElement(By.id("email"));
		txtname.sendKeys(s1);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(s2);
		WebElement btnlog = driver.findElement(By.id("//input[@value='Log In']"));
		btnlog.click();
		driver.quit();
	}	
}
