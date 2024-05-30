package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest {
	
	ChromeDriver driver ;
	
	@Test
	public void login() {
		
		
		// Open Chrome 
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Open login page 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Enter username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// Enter password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	}
	
	
	@Test
	public void testAdmin() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	boolean isDisplayed = 	driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
	
	Assert.assertTrue(isDisplayed);
		
	}
	
	
	@Test
	public void testLogout() {
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	
	

}
