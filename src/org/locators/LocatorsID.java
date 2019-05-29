package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement loginpopup=driver.findElement(By.xpath("//button[text()='✕']"));
		loginpopup.click();
		WebElement login=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
		login.click();
		WebElement mobleno=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mobleno.sendKeys("55664165");
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("rej451");
		WebElement btnlogin=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnlogin.click();
		
	}	

}
