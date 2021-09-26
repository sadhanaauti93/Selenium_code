package com.pularlsight1;
import javax.xml.datatype.DatatypeFactory;

import org.openqa.Selenium.support.PageFactorty;

public class Pages {
	public static HomePage homePage(){
		HomePage homepage = new HomePage();
		
		return new HomePage();
	}

	public static Pathpages pathPages() {
		Pathpages pathPages = new Pathpages();
		return pathPages;
	}
	public static PathPage javapathpage() {
		PathPage javapathPage = new JavaPathPage();
		DatatypeFactory.initElement(Browser.driver,javapathPage);
		return javapathPage;
	}

}
