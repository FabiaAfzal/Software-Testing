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
	public void testAddition()
	{
		assertEquals(5,calApplication.addition(3,2));
	}
	@Test
	public void testAddition1()
	{
		assertEquals(7,calApplication.addition(5,2));
	}
	
	@Test
	public void testubtraction()
	{
		assertEquals(1,calApplication.subtraction(3,2));
	}
	@Test
	public void testMultiplication()
	{
		assertEquals(6,calApplication.multiplication(3,2));
	}
	@Test
	public void testDivision()
	{
		assertEquals(1,calApplication.division(3,2));
	}
	
	
}
