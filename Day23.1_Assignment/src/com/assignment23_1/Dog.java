package com.assignment23_1;

public class Dog extends Animal
{

	public Dog(String name, int age) 
	{
		super(name, age);

	}
	public void bark()
	{
	 System.out.println("The dog is barking.");
	}
	public void play()
	{
		System.out.println("The dog is playing.");
	}
}
