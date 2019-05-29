package org.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("Renu");
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.sendKeys("Ramesh");
		WebElement btnSex=driver.findElement(By.xpath("//label[@class='radio']"));
		btnSex.click();
		WebElement YOE=driver.findElement(By.xpath("//input[@id='exp-2']"));
		YOE.click();
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("2/03/19");
		WebElement Profession=driver.findElement(By.xpath("//label[@class='checkbox']"));
		Profession.click();
		WebElement Atool=driver.findElement(By.xpath("//input[@id='tool-2']"));
		Atool.click();
				
	}
}

