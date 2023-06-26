package com.assignment23_1;

public class Cat extends Animal 
{

	public Cat(String name, int age) 
	{
		super(name, age);	
	}
	public void meow() 
	{
        System.out.println("The cat is meowing.");
    }

    public void sleep() 
    {
        System.out.println("The cat is sleeping.");
    }

}
