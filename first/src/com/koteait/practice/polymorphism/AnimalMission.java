package com.koteait.practice.polymorphism;

public class AnimalMission {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Sparrow spa = new Sparrow();
		
		docry(dog);
		docry(cat);
		docry(spa);

	}
	
	public static void docry(Animal ani) {
		ani.Cry();
	}

}
