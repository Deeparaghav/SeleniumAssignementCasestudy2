package com.casestudy2.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.casestudy2.db.*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.assignment.wait.waitTypes;
import com.casestudy2.db.DBClient;


public class RegistrationPOM {
	
	  public RegistrationPOM(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        this.db = new DBClient();
	    }
	
	private static WebDriver driver; 
	private static WebElement element; 
	private DBClient db;
	private waitTypes waitTypes; 
	
	
	public void firstname(String firstname) {
		element = driver.findElement(By.id("registration_firstname"));
		element.sendKeys(firstname);	
	}	
	
	public void lastname(String lastname) {
		element = driver.findElement(By.id("registration_lastname"));
		element.sendKeys(lastname);
	}
	
	public void email(String email) {
		element = driver.findElement(By.id("registration_email"));
		element.sendKeys(email);
		}
		
	public void username() {
		int r = (int) (Math.random() * 500.0D);
		if (r <= 10) {
			r += 11;
			System.out.println(r);
		}
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys(new CharSequence[] { String.valueOf(r) });
	}
	
	
	public void Pass(String password) {
		element = driver.findElement(By.id("pass1"));
		element.sendKeys(password);
	}
	
	
	public void Pass2(String password) {
		element = driver.findElement(By.id("pass2"));
		element.sendKeys(password);
	}
	
	public void clickregister() {
		element = driver.findElement(By.id("registration_submit"));
		element.click();
	}
	
	
	public void validatemessage() throws InterruptedException {
		Thread.sleep(4000);
		WebElement actual = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]"));
		String actualText =actual.getText();
		System.out.println("Actual string is: "   +actualText);
		String expectedtext = "Your personal settings have been registered";
	    System.out.println("Expected string is: " +expectedtext);
	    if (actualText.contains(expectedtext)){	    	  
	    	  System.out.println("Actual message contains expected message. Testcase pass!!!");	    	  
	      }
		  else {	    	  
	    	  System.out.println("Testcase fail");  
	      }	
	}
	
	public void clickingonlogo() throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.xpath(".//img[@src='http://elearningm1.upskills.in/main/img/icons/32/unknown.png']"));
		element.click();		
	}
	
	public void verifyingemailandname() throws InterruptedException {	
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
	    System.out.println(actual);
	    String expectedemail=db.email;
	      System.out.println("Expected string is: " +expectedemail);
	    if(actual.contains(expectedemail))
	    {
	    	System.out.println("Expected email contains actual email, test case pass!!!");
	    }
	    else
	    {
	    	System.out.println("Test case fail!!");
	    }
	    driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/a/p")).click();
		driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
		driver.findElement(By.className("email-overflow")).click();
	}
	
}
	


