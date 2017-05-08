package com.PEsection.CreateNewCampaigns;


import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.portal.login.LoginToPortal;
import com.utils.Pesection.DDT;

public class NewCampaignTest {
	LoginToPortal portal = new LoginToPortal();

	@Test(priority = 1,dataProvider = "Login")

	public void DealerLogin(String username, String password) {

		LoginToPortal portal = new LoginToPortal();

		portal.LoginWeb(username, password);
	}

	@Test(priority = 2,dataProvider = "AddCampaign"
			
			)
	public void CreateCampaign(String CampaignTitle,String SenderEmail,String SenderName,String Subject,String ByPassEmail,String TriggerName,
			String LayoutName,String WaitDays) throws Exception{
		NewCampaignsBusinessLogic BusinessLogic = new NewCampaignsBusinessLogic();
		BusinessLogic.AddNewCampaign( CampaignTitle, SenderEmail, SenderName, Subject, ByPassEmail, TriggerName,
				 LayoutName, WaitDays);
	}

	@DataProvider(name = "Login")
	public Object[][] Login() throws Exception {
		return DDT.DDTReader("DDt/LoginPage.csv");
	}
	
	@DataProvider(name = "AddCampaign")
	public Object[][] AddCampaign() throws Exception {
		return DDT.DDTReader("DDt/CreateCampaign.csv");
	}
	
	@AfterClass
	public void AfterTest(){
		portal.teradown();
		
	}
}
