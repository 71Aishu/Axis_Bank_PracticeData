/*
 * 2. Use Inbuilt String method to perform following kind of action	
	a. string s=Selenium, replace each letter "e" with "bb"
	b. string s=Selenium, calculate the length 
	c. string s=Selenium, get the character at index 4

 */
package com.assignment;

public class Question_2 
{
    public void replaceString()
    {
    	String s = "Selenium";
    	String replace = s.replace("e","bb");
    	System.out.println(replace);
    }
    public void lengthString()
    {
    	String s1 = "Selenium";
    	int length = s1.length();
    	System.out.println("Length of the String is : " + length);
    }
    public void indexofString()
    {
    	String s2 = "Selenium";
    	char c = s2.charAt(4);
    	System.out.println("The Character of 4th index is : " + c);
    }
	public static void main(String[] args) 
	{
	  Question_2 q2 = new Question_2();
	  q2.replaceString();
	  q2.lengthString();
      q2.indexofString();
	}

}
