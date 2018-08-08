package com.cg.payment.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentDetails {
	@FindBy(how=How.ID,id="txtCardholderName")
	WebElement holderName;
	@FindBy(how=How.ID,id="txtDebit")
	WebElement cardNo;
	@FindBy(how=How.ID,id="txtCvv")
	WebElement cvv;
	@FindBy(how=How.ID,id="txtMonth")
	WebElement expMonth;
	@FindBy(how=How.ID,id="txtYear")
	WebElement expYear;
	@FindBy(how=How.ID,id="btnPayment")
	WebElement payment;
	public WebElement getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName.sendKeys(holderName);
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo.sendKeys(cardNo);
	}
	public WebElement getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(String expMonth) {
		this.expMonth.sendKeys(expMonth);
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public void setExpYear(String expYear) {
		this.expYear.sendKeys(expYear);
	}
	public WebElement getPayment() {
		return payment;
	}
	public void setPayment() {
		this.payment.click();
	}
	
	
}
