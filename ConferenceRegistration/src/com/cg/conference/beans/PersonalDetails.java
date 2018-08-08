package com.cg.conference.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetails {
	@FindBy(how=How.NAME,name="txtFN")
WebElement firstName;
	@FindBy(how=How.ID,id="txtLastName")
WebElement lastName;
	@FindBy(how=How.ID,id="txtEmail")
WebElement email;
	@FindBy(how=How.ID,id="txtPhone")
WebElement contact;
	@FindBy(how=How.NAME,name="size")
WebElement noPeople;
	@FindBy(how=How.ID,id="txtAddress1")
WebElement address;
	@FindBy(how=How.ID,id="txtAddress2")
WebElement area;
	@FindBy(how=How.NAME,name="city")
WebElement city;
	@FindBy(how=How.NAME,name="state")
WebElement state;
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[12]/td[2]/input")
WebElement member;
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[13]/td[2]/input")
WebElement nonmember;
	@FindBy(how=How.XPATH,xpath=".//html/body/form/table/tbody/tr[14]/td/a")
WebElement next;
	
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void setContact(String contact) {
		this.contact.clear();
		this.contact.sendKeys(contact);
	}
	
	public void setNoPeople() {
		Select sel=new Select(noPeople);
		sel.selectByVisibleText("2");
	}
	
	public void setAddress(String address) {
		this.address.sendKeys(address);
	}
	
	public void setArea(String area) {
		this.area.sendKeys(area);
	}
	
	public void setCity() {
		Select sel=new Select(city);
		sel.selectByVisibleText("Hyderabad");
	}
	
	public void setState() {
		Select sel=new Select(state);
		sel.selectByVisibleText("Telangana");
	}
	
	public void setMember() {
		this.member.click();
	}
	
	public void setNonmember() {
		this.nonmember.click();
	}


	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getState() {
		return state;
	}

	
	public void setNext() {
		this.next.click();
	}
	
	
	
}
