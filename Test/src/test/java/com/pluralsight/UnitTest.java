package com.pluralsight;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
//import com.pluralsight1.Pages;
//import com.gargoylesoftware.htmlunit.Page;

import com.pularlsight1.Browser;
import com.pularlsight1.Pages;
import com.pularlsight1.PathPage;


public class UnitTest {

	@Test
	public void canGoToHomePage(){
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
	}
	@Test
	public void canGoToJavaPathPage(){
		Pages.pathPages().goTo();
		PathPage pathpage = Pages.pathPages().getPathpage("java");
		pathpage.goTo();
		//Pages.pathPages().goToJavaPath();

		//Assert.assertTrue(Pages.pathPages().isAt());
		Assert.assertTrue(pathpage.isAtpathPAge("java"));
	}

	@AfterClass
	public static void cleanUp(){
		Browser.close();
	}
}

