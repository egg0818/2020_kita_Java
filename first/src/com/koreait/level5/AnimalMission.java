package com.koreait.level5;

public class AnimalMission {

	public static void main(String[] args) {
		Dog dog = new Dog();  //Dog 클래스 객체선언
		Cat cat = new Cat();  //Cat 클래스 객체선언
		Sparrow spa = new Sparrow(); // Sparrow 클래스 객체선언
		
		doCry(dog);  //doCry() 메소드를 이용해서 동물소리를 프린트해봐라
		doCry(cat);
		doCry(spa);

	}
	
	public static void doCry(Animal ani) {  //Animal 클래스 라는 변수타입인 ani라는 변수를 생성
		ani.cry();  // 주솟값.메소드
					// dog cat spa는 다 Animal에게 상속받기 때문에 가능함. 
	}

}
