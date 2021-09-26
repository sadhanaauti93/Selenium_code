package com.pularlsight1;

import org.openqa.Selenium.WebElement;
import org.openqa.Selenium.By;
import org.openqa.Selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class JavaPathPage extends PathPage{
	@FinfBy(How = How.css,using = ".large-7 > h1:nth-child(2)")
	
	WebElement pageElement;
	@Override
	public void goTo() {
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']/div[59]/a/div/div[2]")).click();
		
	}
	@Override
	public void String Object pathName() {
		return pageElement.getText();
		
	}

}
