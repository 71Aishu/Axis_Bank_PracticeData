/* 
 * Write a program using if condition to check whether number is odd or even
 */
package com.assignment;
import java.util.Scanner;

public class Question_3 
{
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        if (number % 2 == 0) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }

	}

}
