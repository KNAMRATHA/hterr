package com.cg.conference.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.cg.conference.beans.PersonalDetails;
import com.cg.payment.beans.PaymentDetails;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;
	PersonalDetails personalDetails;
	PaymentDetails payment;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}

	@Given("^User want to register to a conference$")
	public void user_want_to_register_to_a_conference() throws Throwable {
	    
	}

	@When("^User launches the application browser$")
	public void user_launches_the_application_browser() throws Throwable {
		driver.get("D:\\Practice\\SpringWebServices\\ConferenceRegistration\\ConferenceRegistartion.html");
		personalDetails=PageFactory.initElements(driver,PersonalDetails.class);
	}

	@Then("^open 'ConferenceRegistration\\.html' web page in the browser$")
	public void open_ConferenceRegistration_html_web_page_in_the_browser() throws Throwable {
		  String actual=driver.findElement(By.xpath("/html/body/h2")).getText();
		  String expected="Conference Registration";
		  Assert.assertEquals(expected, actual);
	}

	@When("^user clicks on the link 'next' without entering the First Name$")
	public void user_clicks_on_the_link_next_without_entering_the_First_Name() throws Throwable {
		//personalDetails.setFirstName("");
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please fill the first name'$")
	public void display_an_alert_message_Please_fill_the_first_name() throws Throwable {
		 Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the First Name";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
		 Thread.sleep(1000);
	}

	@When("^user clicks on the link 'next' without entering the Last Name$")
	public void user_clicks_on_the_link_next_without_entering_the_Last_Name() throws Throwable {
		 personalDetails.setFirstName("Namratha");
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please fill the last name'$")
	public void display_an_alert_message_Please_fill_the_last_name() throws Throwable {
		 Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the Last Name";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
		  Thread.sleep(1000);
	}

	@When("^user clicks on the link 'next' without entering the Email$")
	public void user_clicks_on_the_link_next_without_entering_the_Email() throws Throwable {
		personalDetails.setLastName("Kudupudi");
		personalDetails.setEmail("");
		personalDetails.setNext();
		
	}

	@Then("^display an alert message 'Please fill the email'$")
	public void display_an_alert_message_Please_fill_the_email() throws Throwable {
		 Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the Email";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
		  Thread.sleep(1000);
	}

	@When("^user clicks on the link 'next' with a wrong Email format$")
	public void user_clicks_on_the_link_next_with_a_wrong_Email_format() throws Throwable {
		personalDetails.setEmail("nam@gmail");
		personalDetails.setNext();
	}

@Then("^display an alert message 'Please enter valid email id'$")
public void display_an_alert_message_Please_enter_valid_email_id() throws Throwable {
	Alert alert=driver.switchTo().alert();
	  String actual=alert.getText();
	  String expected="Please enter valid Email Id.";
	  Assert.assertEquals(expected, actual);
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(1000);
}

	@When("^user clicks on the link 'next' without entering the ContactNo\\.$")
	public void user_clicks_on_the_link_next_without_entering_the_ContactNo() throws Throwable {
		personalDetails.setEmail("nam@gmail.com");
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please fill the Contact No\\.'$")
	public void display_an_alert_message_Please_fill_the_Contact_No() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the Contact No.";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
		  Thread.sleep(1000);
	}

	@When("^user clicks on the link 'next' with a wrong type of ContactNo\\.$")
	public void user_clicks_on_the_link_next_with_a_wrong_type_of_ContactNo() throws Throwable {
		personalDetails.setContact("1234567890");
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please enter valid Contact No\\.'$")
	public void display_an_alert_message_Please_enter_valid_Contact_No() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please enter valid Contact no.";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
		  Thread.sleep(1000);
		  
	}

	@When("^ContactNo doesnt have (\\d+) digits$")
	public void contactno_doesnt_have_digits(int arg1) throws Throwable {
		
		personalDetails.setContact("9988776");
		personalDetails.setNext();
	}

	@When("^user clicks on the link 'next' without selecting the number of people attending$")
	public void user_clicks_on_the_link_next_without_selecting_the_number_of_people_attending() throws Throwable {
		personalDetails.setContact("7799421508");
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Number of people attending'$")
	public void display_an_alert_message_Number_of_people_attending() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the Number of people attending";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
		  Thread.sleep(1000);
	}

	@When("^user clicks on the link 'next' without entering the address$")
	public void user_clicks_on_the_link_next_without_entering_the_address() throws Throwable {
		personalDetails.setNoPeople();
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please fill the Building & Room No'$")
	public void display_an_alert_message_Please_fill_the_Building_Room_No() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the Building & Room No";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on the link 'next' without entering the area$")
	public void user_clicks_on_the_link_next_without_entering_the_area() throws Throwable {
		personalDetails.setAddress("Plot No.164,vivekanandaNagar");
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please fill the area name'$")
	public void display_an_alert_message_Please_fill_the_area_name() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the Area name";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on the link 'next' without selecting the city$")
	public void user_clicks_on_the_link_next_without_selecting_the_city() throws Throwable {
		personalDetails.setArea("Kukatpally");
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please select city'$")
	public void display_an_alert_message_Please_select_city() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please select city";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on the link 'next' without selecting the state$")
	public void user_clicks_on_the_link_next_without_selecting_the_state() throws Throwable {
		personalDetails.setCity();
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please select state'$")
	public void display_an_alert_message_Please_select_state() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please select state";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on the link 'next' without selecting the membershipStatus$")
	public void user_clicks_on_the_link_next_without_selecting_the_membershipStatus() throws Throwable {
		personalDetails.setState();
		personalDetails.setNext();
	}

	@Then("^display an alert message 'Please select MemberShip status'$")
	public void display_an_alert_message_Please_select_MemberShip_status() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please Select MemeberShip status";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^User clicks on 'Next'$")
	public void user_clicks_on_Next() throws Throwable {
		personalDetails.setNonmember();
		personalDetails.setNext();
	}

	@Then("^display alert message for the validity of details$")
	public void display_alert_message_for_the_validity_of_details() throws Throwable {
		Alert jsAlert=driver.switchTo().alert();
		  String actual=jsAlert.getText();
		  String expected="Personal details are validated.";
		  Assert.assertEquals(expected, actual);	
		  driver.switchTo().alert().dismiss();
	}

	@Then("^navigates to the next page 'PaymentDetails\\.html'$")
	public void navigates_to_the_next_page_PaymentDetails_html() throws Throwable {
		driver.navigate().to("D:\\Practice\\SpringWebServices\\ConferenceRegistration\\PaymentDetails.html");
		payment = PageFactory.initElements(driver, PaymentDetails.class);
		String actual=driver.findElement(By.xpath("/html/body/h4")).getText();
		  String expected="Step 2: Payment Details";
		  Assert.assertEquals(expected, actual);
	}

	@When("^user clicks on 'Make Payment' without entering the CardholderName$")
	public void user_clicks_on_Make_Payment_without_entering_the_CardholderName() throws Throwable {
		
	    payment.setPayment();
	}

	@Then("^display an alert message 'Please fill the card holder name'$")
	public void display_an_alert_message_Please_fill_the_card_holder_name() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the Card holder name";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on 'Make Payment'' without entering the DebitCardNumber$")
	public void user_clicks_on_Make_Payment_without_entering_the_DebitCardNumber() throws Throwable {
		payment.setHolderName("VNR");
		payment.setPayment();
	}

	@Then("^display an alert message 'Please fill the debit card number'$")
	public void display_an_alert_message_Please_fill_the_debit_card_number() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the Debit card Number";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on 'Make Payment' without entering the CardExpirationMonth$")
	public void user_clicks_on_Make_Payment_without_entering_the_CardExpirationMonth() throws Throwable {
		payment.setCardNo("54321");
		payment.setCvv("034");
		payment.setPayment();
	}

	@Then("^display an alert message 'Please fill expiration month'$")
	public void display_an_alert_message_Please_fill_expiration_month() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill expiration month";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on 'Make Payment' without entering the CardExpirationYear$")
	public void user_clicks_on_Make_Payment_without_entering_the_CardExpirationYear() throws Throwable {
		payment.setExpMonth("August");
		payment.setPayment();
	}

	@Then("^display an alert message 'Please fill expiration year'$")
	public void display_an_alert_message_Please_fill_expiration_year() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Please fill the expiration year";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on 'Make Payment' button$")
	public void user_clicks_on_Make_Payment_button() throws Throwable {
		payment.setExpYear("2024");
		payment.setPayment();
	}

	@Then("^display an alert message 'Conference Room Booking successfully done'$")
	public void display_an_alert_message_Conference_Room_Booking_successfully_done() throws Throwable {
		Alert alert=driver.switchTo().alert();
		  String actual=alert.getText();
		  String expected="Conference Room Booking successfully done!!!";
		  Assert.assertEquals(expected, actual);
		  driver.switchTo().alert().dismiss();
	}


}
