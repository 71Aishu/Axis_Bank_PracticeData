package com.assignment23_1a;

public class VehicleDemo 
{
	public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle", 2021);
        vehicle.start();
        vehicle.displayDetails();
        System.out.println();

        Car car = new Car("Toyota", 2019);
        car.start();
        car.drive();
        car.stop();
        car.displayDetails();
        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Honda", 2022);
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.displayDetails();
        System.out.println();

        Truck truck = new Truck("Ford", 2018);
        truck.start();
        truck.loadCargo();
        truck.unloadCargo();
        truck.displayDetails();
    }
}
