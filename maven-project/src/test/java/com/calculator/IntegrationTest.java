package com.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegrationTest {
public static Application calApplication;
	
	@BeforeClass
	public static void setUp() {
		calApplication= new Application();
	}
	
	@Test
	public void applicationTest()
	{
		
		assertTrue(true);
	}
	@Test
	public void testintegration() {
		assertEquals(6,calApplication.subtraction(calApplication.addition(4,4),calApplication.addition(1,1)));
	}
	@Test
	public void testintegration1() {
		assertEquals(16,calApplication.multiplication(calApplication.addition(4,4),calApplication.addition(1,1)));
	}
	
}
