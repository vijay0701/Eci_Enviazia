package com.PEsection.CreateNewCampaigns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewCampaignsPageFactory {
	private WebDriver driver;
	protected WebDriverWait wait;

	@FindBy(id = "addschedulerbtn")
	private WebElement addNewCampaign;

	@FindBy(id="GetInfo")
	private WebElement customerInfoTab;

	@FindBy(id="title")
	private WebElement Title_txt;
	
	@FindBy(id="senderemail")
	private WebElement SenderEmail_txt;
	
	@FindBy(xpath =".//*[@id='personalizedemailsmenu']")
	private WebElement personalized_drp;
	
	@FindBy(xpath =".//*[@id='Campaigns']")
	private WebElement YourCampaign_lnk;
	
	@FindBy(id="sendername")
	private WebElement SenderName_txt;
	
	@FindBy(id="subject")
	private WebElement Subject_txt;
	
	@FindBy(id="txtemailforbypass")
	private WebElement ByPassEmail_txt;
	
	@FindBy(id="ddlCampaignType")
	private WebElement Trigger_drp;
	
	@FindBy(id="next")
	private WebElement Next_btn;

	@FindBy(id="cancel")
	private WebElement cancel_btn;
	
	@FindBy(id="save")
	private WebElement Save_btn;
	
	@FindBy(id="layoutgroup")
	private WebElement Layout_drp;
	
	@FindBy(id="recHour")
	private WebElement EmailSetTime_drp;
	
	@FindBy(id="offsetDay")
	private WebElement WaitDays_drp;
	
	@FindBy(id="launch_emailbody")
	private WebElement email_body;
	
	@FindBy(id="q")
	private WebElement searchBox;
	
	public WebElement getsearchBox(){
		return searchBox;
	}
	
	public WebElement getpersonalized_drp() {
		return personalized_drp;
	}
	
	public WebElement getYourCampaign_lnk() {
		return YourCampaign_lnk;
	}
	
	
	public WebElement getSenderName_txt() {
		return SenderName_txt;
	}
	

	public WebElement getEmail_body() {
		return email_body;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public WebElement getAddNewCampaign() {
		return addNewCampaign;
	}

	public WebElement getCustomerInfoTab() {
		return customerInfoTab;
	}

	public WebElement getTitle_txt() {
		return Title_txt;
	}

	public WebElement getSenderEmail_txt() {
		return SenderEmail_txt;
	}

	public WebElement getSubject_txt() {
		return Subject_txt;
	}

	public WebElement getByPassEmail_txt() {
		return ByPassEmail_txt;
	}

	public WebElement getTrigger_drp() {
		return Trigger_drp;
	}

	public WebElement getNext_btn() {
		return Next_btn;
	}

	public WebElement getCancel_btn() {
		return cancel_btn;
	}

	public WebElement getSave_btn() {
		return Save_btn;
	}

	public WebElement getLayout_drp() {
		return Layout_drp;
	}

	public WebElement getEmailSetTime_drp() {
		return EmailSetTime_drp;
	}

	public WebElement getWaitDays_drp() {
		return WaitDays_drp;
	}

	
}
