package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		WebElement Username=driver.findElement(By.id("username"));
		Username.sendKeys("RenuPavi");
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Renu1234");
	}

}
