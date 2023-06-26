package com.assignment23_1;

public class AnimalDemo 
{

	public static void main(String[] args) 
	{
		Animal animal = new Animal("Lion", 5);
        animal.eat();
        
        Dog dog = new Dog("Tyson", 4);
        dog.eat();
        dog.bark();
        dog.play();
        
        Cat cat = new Cat("Angle", 5);
        cat.eat();
        cat.meow();
        cat.sleep();

	}

}
