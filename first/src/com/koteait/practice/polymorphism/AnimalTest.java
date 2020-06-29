package com.koteait.practice.polymorphism;

public class AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Animal();
		
		ani = new Dog();
		ani.Cry();
		
		ani = new Sparrow();
		ani.Cry();
		
		ani = new Cat();
		ani.Cry();
		
		Cat cat = (Cat) ani;
		cat.sleep();

		
	}

}
