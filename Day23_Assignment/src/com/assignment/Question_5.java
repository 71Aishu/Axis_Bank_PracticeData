// 5.  Write a program to accept two values(int,double) from the user , then implement a parametric method to calculate the sum 

package com.assignment;
import java.util.Scanner;

public class Question_5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value :");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Value :");
		double b = sc.nextDouble();
		
		Question_5 q5 = new Question_5();
		double sum = q5.sum(a,b);
        System.out.println("The sum is : "+sum);
	}
	public double sum(int c, double d)
	{
		return c+d;
	}

}
