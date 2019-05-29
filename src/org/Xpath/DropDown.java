package org.Xpath;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		WebElement txtsearch = driver.findElement(By.id("headerSearch"));
		txtsearch.sendKeys("ceiling fan");
		WebElement search = driver.findElement(By.className("SearchBox__buttonIcon"));
		search.click();
		Thread.sleep(10000);
		WebElement fstfan = driver.findElement(By.xpath("(//a[@data-pod-type='pr'])[1]"));
		fstfan.click();
		Thread.sleep(10000);
		WebElement cart = driver.findElement(By.xpath("(//span[@class='bttn__content'])[4]"));
		cart.click();
		String parwinid = driver.getWindowHandle();
		Set<String> allWinid = driver.getWindowHandles();
		for (String eachwinid : allWinid) {
			if (!parwinid.equals(eachwinid)) {
				driver.switchTo().window(eachwinid);
			}	
	}	
		Thread.sleep(15000);
		WebElement Childid = driver.findElement(By.xpath("(//div[text()='$239.00'])[2]"));
		System.out.println(Childid.getText());
	}

}
