package com.assignment23_1a;

public class Car extends Vehicle 
{
    public Car(String brand, int year)
    {
        super(brand, year);
    }

    @Override
    public void start() 
    {
        System.out.println("The car engine starts.");
    }

    public void drive() 
    {
        System.out.println("The car is driving.");
    }

    public void stop() 
    {
        System.out.println("The car stops.");
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Type: Car");
    }
}
