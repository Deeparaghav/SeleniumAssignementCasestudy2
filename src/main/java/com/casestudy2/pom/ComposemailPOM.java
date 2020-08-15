package com.casestudy2.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.casestudy2.utils.Sleep;
import com.assignment.wait.waitTypes;
import com.casestudy2.beans.*;
import com.casestudy2.db.DBClient;


public class ComposemailPOM {
	private WebDriver driver;
	private WebElement element;

	private waitTypes waitTypes;
	private DBClient db;

	// the parametric constructor to load the driver
	public ComposemailPOM(WebDriver driver) {
		this.driver = driver;
		this.waitTypes = new waitTypes(driver);
	     PageFactory.initElements(driver, this);
	      this.db = new DBClient();
    }

	public void Sendto() throws InterruptedException  {
		driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(db.email);
		driver.findElement(By.xpath("//*[@id=\"select2-compose_message_users-results\"]/li[2]")).click();
		System.out.println("Selected an already enetered emailid");
        	}

	public void Subject() {
		element = driver.findElement(By.id("compose_message_title"));
		element.sendKeys("CASESTUDY");

	}

	public void Message() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
         Thread.sleep(2000);
         driver.switchTo().frame(0);
         System.out.println("Reached frame");
         driver.findElement(By.xpath("/html/body")).sendKeys("Hello Mr. Sunil \n" + "    This is test email \n" + "\n" + "From,"+ "\n"+ db.firstname);
         Thread.sleep(4000);
         driver.switchTo().defaultContent();
  	}
	
	public void clicksendmessage() {
		element = driver.findElement(By.id("compose_message_compose"));
		element.click();
	}
	
public void verifyingemailack() {
		
	String emailack = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/div[1]")).getText();
    System.out.println(emailack);
    String expectedemailack = "The message has been sent to";
    System.out.println("Expected string is: " +expectedemailack);
       if (emailack.contains(expectedemailack))
       {
       System.out.println("Email is sent --->Test case pass");    
       }
       else
       {
           System.out.println("Email not sent --->Test case failed");
//           driver.quit();
         }
	}
	
}
