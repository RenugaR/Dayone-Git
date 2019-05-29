package org.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DDAndMouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions a=new Actions(driver);
		WebElement source = driver.findElement(By.id("credit2"));
		WebElement dest = driver.findElement(By.id("bank"));
		a.dragAndDrop(source, dest).perform();
		WebElement amount = driver.findElement(By.id("fourth"));
		WebElement Credit = driver.findElement(By.id("amt8"));
		a.dragAndDrop(amount, Credit).perform();
		WebElement SSales = driver.findElement(By.id("credit1"));
		WebElement  AmountDe= driver.findElement(By.id("loan"));
		a.dragAndDrop(SSales, AmountDe).perform();
		WebElement amount1 = driver.findElement(By.id("fourth"));
		WebElement debit = driver.findElement(By.id("amt7"));
		a.dragAndDrop(amount1, debit).perform();
	}

}
