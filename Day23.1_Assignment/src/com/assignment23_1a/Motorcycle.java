package com.assignment23_1a;

public class Motorcycle extends Vehicle 
{
    public Motorcycle(String brand, int year) 
    {
        super(brand, year);
    }

    @Override
    public void start() 
    {
        System.out.println("The motorcycle engine starts.");
    }

    public void accelerate() 
    {
        System.out.println("The motorcycle is accelerating.");
    }

    public void brake() 
    {
        System.out.println("The motorcycle is braking.");
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Type: Motorcycle");
    }
}
