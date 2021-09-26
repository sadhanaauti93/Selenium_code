package FrameworkNew;
import org.testng.annotations.Test;
import framework.ObjectRepository;

public class TestCaseNew extends UtilityNew{
	ObjectRepositoryNew obj = new ObjectRepositoryNew();
	
	@Test(priority=0)
	public void initbrowser() {
		driversetting();
	}
	
	@Test(priority=1)
	public void navigate() {
		finderpath(obj.emailtextboxnew).sendKeys("sadjhdsd");
	}
}
