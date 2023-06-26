package com.assignment23_1a;

public class Truck extends Vehicle 
{
    public Truck(String brand, int year)
    {
        super(brand, year);
    }

    @Override
    public void start() 
    {
        System.out.println("The truck engine starts.");
    }

    public void loadCargo() 
    {
        System.out.println("The truck is loading cargo.");
    }

    public void unloadCargo()
    {
        System.out.println("The truck is unloading cargo.");
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Type: Truck");
    }
}
