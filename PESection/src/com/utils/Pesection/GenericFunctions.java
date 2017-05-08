package com.utils.Pesection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GenericFunctions {
	
	public static void selectDropDown(WebDriver driver, WebElement element,String triggerName){
		Select select = new Select(element);
		select.selectByVisibleText(triggerName);
		String matchValue = select.getFirstSelectedOption().getText();
		Assert.assertEquals(matchValue, triggerName);
		
		}
	
	
	public void getDataWebTable(WebDriver driver,WebElement wel){
		WebElement htmltable=driver.findElement(By.xpath(".//*[@id='tblCampaigns']/tbody"));

		List<WebElement> rows=htmltable.findElements(By.tagName("tr"));

		for(int rnum=0;rnum<rows.size();rnum++)
		{

		List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));

		System.out.println("Number of columns:"+columns.size());
		int cnum;
		for(cnum =0;cnum<columns.size();cnum++){
			String campaign = columns.get(cnum).findElement(By.tagName("td")).getText();
		
	if(campaign.equalsIgnoreCase("Abandoned cart")){
		//campaign;
	}
		}

		}
	}
}


