package com.assignment23_1a;

public class Vehicle 
{
	   String brand;
	    int year;

	    public Vehicle(String brand, int year) 
	    {
	        this.brand = brand;
	        this.year = year;
	    }

	    public void start() 
	    {
	        System.out.println("The vehicle starts.");
	    }

	    public void displayDetails() 
	    {
	        System.out.println("Brand: " + brand);
	        System.out.println("Year: " + year);
	    }
}
