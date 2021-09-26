package com.pularlsight1;

public class Pathpages {
	static String url = "https://pluralsight.com/paths";
	static String title = "Technology skills for business | Pluralsigh";
	
	public void goTo(){
		Browser.goTo(url);
	}
	/*public void goToJavaPath(){
		
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']/div[59]/a/div/div[2]")).click();
		//assertEquals("Java Programming Learning Path | Pluralsigth",driver.getTitle());
	}*/
	public PathPage getPathpage(String page) {
		switch(Page) {
		case "java";
			return Pages.javapathpage();
		}
		return null;
	}
	public boolean isAt() {
		return Browser.title().equals("title");
	}
}
 