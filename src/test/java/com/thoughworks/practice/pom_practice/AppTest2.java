package com.thoughworks.practice.pom_practice;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class AppTest2 {
    
	@Test
	public void sum() {
		int a=2,b=3;
		AssertJUnit.assertEquals(5, a+b);
		
	}
	
	@Test
	public void sub() {
		int a=2,b=3;
		AssertJUnit.assertEquals(1, b-a);
		
	}
	
	@Test
	public void div() {
		int a=2,b=10;
		AssertJUnit.assertEquals(5, b/a);
		
	}
	
	
}