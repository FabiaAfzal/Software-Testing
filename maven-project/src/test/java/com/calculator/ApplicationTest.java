package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;

public class ApplicationTest {
	
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
	public void testadd()
	{
		assertEquals(5,calApplication.addition(3,2));
	}
	@Test
	public void testsubtraction()
	{
		assertEquals(1,calApplication.subtraction(3,2));
	}
	@Test
	public void testintegration() {
		assertEquals(6,calApplication.subtraction(calApplication.addition(4,4),calApplication.addition(1,1)));
	}
}
