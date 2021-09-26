package com.pularlsight1;

//import TestFramework.Browser;

public class HomePage 
	{
	static String url = "http://pluralsight.com";
	static String title = "Technology skills for business | Pluralsigh";
	
	public void goTo()
	{
		Browser.goTo(url);
	}
		public boolean isAt(){
			return Browser.title().equals(title);
	}
}
