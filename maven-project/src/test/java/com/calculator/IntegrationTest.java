package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegrationTest {
	
public static Application calApplication;
	
	@BeforeClass
	public static void setUp() {
		calApplication= new Application();
	}
	
	@Test
	public void testintegration1() {
		assertEquals(2,calApplication.subtraction(calApplication.addition(3,5),calApplication.addition(2,4)));
	}
	
	@Test
	public void testintegration2() {
		assertEquals(16,calApplication.multiplication(calApplication.addition(4,4),calApplication.addition(1,1)));
	}
	
	@Test
	public void testintegration3() {
		assertEquals(2,calApplication.division(calApplication.subtraction(10,2),calApplication.addition(2,2)));
	}
	
}
