package com.calculator;

import java.util.Scanner;

public class Application {
	
	public Application() {
		
	}
	public void welcome(String msg)
	{
		System.out.println(msg);
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
	public static void main(String[] args)
	{
		Application obj=new Application();
		obj.welcome(".....Welcome to the Calculator Application.....");
		int num1;
		int num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number 1");
		num1=scan.nextInt();
		System.out.println("Enter Number 2");
		num2=scan.nextInt();
		int result_add = obj.addition(num1, num2);
		System.out.println("Result of addition =" + result_add);
		int result_sub = obj.subtraction(num1, num2);
		System.out.println("Result of addition =" + result_sub);
		int result_mul = obj.multiplication(num1, num2);
		System.out.println("Result of addition =" + result_mul);
		int result_div = obj.division(num1, num2);
		System.out.println("Result of addition =" + result_div);
		
	}
}
