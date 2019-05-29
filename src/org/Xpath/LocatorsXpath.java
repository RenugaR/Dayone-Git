package org.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement Firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		Firstname.sendKeys("Renu");
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		Lastname.sendKeys("Ramesh");
		WebElement Username=driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("renu.ramesh95@gmail.com");
		WebElement Pass=driver.findElement(By.xpath("//input[@name='Passwd']"));
		Pass.sendKeys("Renu@1234");
		WebElement ConfmPass=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		ConfmPass.sendKeys("Renu@1234");
		WebElement BtnNext=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		BtnNext.click();
		System.out.println();
	
	}

}


//WebElement txtusername=driver.findElement(By.id("InputName"));
//txtusername.sendKeys("Renu");		
//WebElement txtmail=driver.findElement(By.xpath("//input[@id='InputEmail1']"));
//txtmail.sendKeys("R12345@gmail.com");
//WebElement txtmbleno=driver.findElement(By.id("InputSubject"));
//txtmbleno.sendKeys("521564965");
