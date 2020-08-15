package com.casestudy2.steps;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.casestudy2.beans.User;
import com.casestudy2.db.DBClient;
import com.casestudy2.pom.ComposemailPOM;
import com.casestudy2.pom.RegistrationPOM;
import com.casestudy2.pom.SignupPOM;
import com.casestudy2.utils.DriverFactory;
import com.casestudy2.utils.DriverNames;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStep {
	

	public static WebDriver driver = DriverFactory.getDriver(DriverNames.CHROME); 
    public static  RegistrationPOM registration = new RegistrationPOM(driver); 
    public static SignupPOM signup = new SignupPOM(driver);
    public static ComposemailPOM composeemail = new ComposemailPOM(driver);
    public static DBClient db = new DBClient();
	
	@Given("^the website is loaded$")
	public void the_website_is_loaded() throws Throwable 
	{
		driver.get("http://elearningm1.upskills.in");
	}

	
	@When("^user enters mandatory details$")
	public void user_enters_mandatory_details() throws Throwable
	{
		signup.clickSignupbutton();
		System.out.println("Clicked on signup");
		registration.firstname(db.firstname);
		registration.lastname(db.lastname);
		registration.username();
		registration.email(db.email);
		registration.Pass(db.password);
		registration.Pass2(db.password);
	}

@When("^Clicking on the Register button$")
public void clicking_on_the_Register_button() throws Throwable {
	registration.clickregister();
}

@Then("^display the valid message if registered successfully$")
public void display_the_valid_message_if_registered_successfully() throws Throwable {
   registration.validatemessage();
}

@Given("^user registered successfully$")
public void user_registered_successfully() throws Throwable {
    System.out.println("User registered successfully!!");
}

@When("^clicked on profile dropdown at top right corner$")
public void clicked_on_profile_dropdown_at_top_right_corner() throws Throwable {
   registration.clickingonlogo();
}

@Then("^display profile details such as name and email$")
public void display_profile_details_such_as_name_and_email() throws Throwable {
  System.out.println("Will display name and email:");
}

@Then("^validate name and email of the user$")
public void validate_name_and_email_of_the_user() throws Throwable {
	Thread.sleep(3000);
  registration.verifyingemailandname();
  }


@Given("^user wants to send a message to other user$")
public void user_wants_to_send_a_message_to_other_user() throws Throwable {
    composeemail.Sendto();
}

@When("^subject is entered$")
public void subject_is_entered() throws Throwable {
  composeemail.Subject();
}

@Then("^message should be entered$")
public void message_should_be_entered() throws Throwable {
    composeemail.Message();
}

@Then("^mail should be sent$")
public void mail_should_be_sent() throws Throwable {
   composeemail.clicksendmessage();
   composeemail.verifyingemailack();
}

}
