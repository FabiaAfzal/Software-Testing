package com.calculator;

import java.util.Scanner;

public class Application {
	
	public Application() {
		
	}
	public void welcome(String msg)
	{
		System.out.println("welcome to calculator Application");
	}
	public int addition(int a, int b)
	{
		return a + b;
	}
	public int subtraction(int a, int b)
	{
		return a - b;
	}
	public int multiplication(int a, int b)
	{
		return a * b;
	}
	public int division(int a, int b)
	{
		return a / b;
	}
<<<<<<< HEAD
=======
	public static void main(String[] args)
	{
		Application obj=new Application();
		obj.welcome(".....Welcome to the Calculator Application.....");
	}
>>>>>>> branch 'master' of https://github.com/FabiaAfzal/Software-Testing.git
}
