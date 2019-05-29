package org.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class DriverConcepts {

	public static void main(String[] args) {
		//Set the Property
		System.setProperty("webdriver.ie.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\IEDriverServer.exe");
		//Launch the browser
		WebDriver driver=new InternetExplorerDriver();
		//Enter the URl
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		//Print the url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//Print the title
		String title=driver.getTitle();
		System.out.println(title);
		//Quit
		driver.quit();
	}

}
