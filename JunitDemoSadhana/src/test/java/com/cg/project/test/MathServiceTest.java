package com.cg.project.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.project.exceptions.InvalidNumberRangeException;
import com.cg.project.services.MathService;
import com.cg.project.services.MathServiceImpl;

public class MathServiceTest {
	private static MathService service;

	//@BeforeClass annotation base method will be executed by Junit framework only once before all test cases
	//method must be declare static 
	@BeforeClass   
	public static void setUpTestEnv()  {
		service = new MathServiceImpl();
	}
	
	@Before
	public void setUpTestMockDataEnv(){
			
	}
	
	@Test(expected = InvalidNumberRangeException.class)
	public void testAddForFirstNoInvalid() throws InvalidNumberRangeException{
			int firstNo =-10;
			int secondNo=20;
			service.add(firstNo, secondNo);
	}
	@Test(expected = InvalidNumberRangeException.class)
	public void testAddForSecondNoInvalid() throws InvalidNumberRangeException{
		int firstNo =10;
		int secondNo=-20;
		service.add(firstNo, secondNo);
	}	
	@Test
	public void testAddForValidNo() throws InvalidNumberRangeException{
		int firstNo =10;
		int secondNo=20;
		int expectedAns=30;
		int actualAns=service.add(firstNo, secondNo);
		Assert.assertEquals(expectedAns, actualAns);		
	}
	
	@After
	public void tearDownMockDataEnv(){
			
	}
	
	//@AfterClass annotation base method will be executed by Junit framework only once after all test cases
	//method must be declare static 
	@AfterClass
	public static void tearDownTestEnv(){
		service = null;
	}
}
