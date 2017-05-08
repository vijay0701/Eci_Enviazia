package com.PEsection.CreateNewCampaigns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utils.Pesection.GenericFunctions;
import com.webdriver.DriverManager;

public class NewCampaignsBusinessLogic {
	
	
	private WebDriver driver;
    protected WebDriverWait wait;
    NewCampaignsPageFactory pomAddCam;
    private static Logger Log = Logger.getLogger(NewCampaignsBusinessLogic.class.getName());//
    
    
    /* Method :Add new Campaign for Abondoned trigger without select any customer group
     * @ Author : Vijay Kant Mishra
     
     */
	
	 public void AddNewCampaign(String CampaignTitle,String SenderEmail,String SenderName,String Subject,String ByPassEmail,String TriggerName,
				String LayoutName,String WaitDays) throws Exception{
		    driver = DriverManager.getManager().getDriver();
		    wait = new WebDriverWait(driver, 40);
		    pomAddCam = PageFactory.initElements(driver, NewCampaignsPageFactory.class);
		    if(driver.getCurrentUrl().contains("Website-Summary")){
		    pomAddCam.getpersonalized_drp().click();
		    pomAddCam.getYourCampaign_lnk().click();
		    pomAddCam.getAddNewCampaign().click(); 
		    }else{
		    	pomAddCam.getAddNewCampaign().click();
		    }
		    
		    Assert.assertEquals(pomAddCam.getNext_btn().isEnabled(), true);
		    pomAddCam.getTitle_txt().sendKeys(CampaignTitle);
		    pomAddCam.getSenderEmail_txt().sendKeys(SenderEmail);
		    pomAddCam.getSenderName_txt().sendKeys(SenderName);
		    pomAddCam.getSubject_txt().sendKeys(Subject);
		    pomAddCam.getByPassEmail_txt().sendKeys(ByPassEmail);
		    GenericFunctions.selectDropDown(driver, pomAddCam.getTrigger_drp(), TriggerName);
		    pomAddCam.getSave_btn().click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    pomAddCam.getNext_btn().click();
		    Assert.assertEquals(pomAddCam.getNext_btn().isEnabled(), true);
		    pomAddCam.getNext_btn().click();
		    GenericFunctions.selectDropDown(driver, pomAddCam.getLayout_drp(), LayoutName);
		    pomAddCam.getSave_btn().click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    pomAddCam.getNext_btn().click();
		    GenericFunctions.selectDropDown(driver, pomAddCam.getWaitDays_drp(), WaitDays);
		    pomAddCam.getSave_btn().click();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    pomAddCam.getNext_btn().click();
		    pomAddCam.getSave_btn().click();
		    wait.until(ExpectedConditions.elementToBeClickable(pomAddCam.getAddNewCampaign()));
		    Assert.assertEquals(pomAddCam.getAddNewCampaign().isEnabled(), true);
		    Log.info("Campaign is added successfully for the trigger" +TriggerName);
		    pomAddCam.getsearchBox().sendKeys("Abandoned cart");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    WebElement htmltable=driver.findElement(By.xpath(".//*[@id='tblCampaigns']/tbody"));

			List<WebElement> rows=htmltable.findElements(By.tagName("tr"));

			for(int rnum=0;rnum<rows.size();rnum++)
			{

			List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));

			System.out.println("Number of columns:"+columns.size());
			int cnum;
			for(cnum =0;cnum<columns.size();cnum++){
				String campaign = columns.get(cnum).getText();
							
		  if(campaign.equalsIgnoreCase("Abandoned cart")){
			driver.findElement(By.xpath(".//*[@id='campaignlist']//a[@class ='btn btn-success']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}else {
			System.out.println("no campaign is found");
		}
			}

			}
		    
		    
		    

	 }
	
	
}
