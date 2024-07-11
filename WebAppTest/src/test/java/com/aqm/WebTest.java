package com.aqm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTest {

	WebDriver driver;

	@Test
	public void titleTest() {
		driver.get("http://localhost:8080/webapp/");
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		
		Assert.assertEquals(title, "AQM Technologies");
		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
