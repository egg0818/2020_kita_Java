package com.koreait.hs.level4;

public class Animaltest {
	public static void main(String[] args) {
		// Animal animal = new Animal();
		Bird bird = new Bird("참새");
		Bird bird2 = new Bird("기러기");
		// Bird bird3 = new Bird(); // 이게 안되게 만들어라!
		
		
		//animal.crying();
		//bird.crying();
		// animal.flying(); // 호출불가
		// bird.flying();
		
		Sparrow sparrow = new Sparrow();
		sparrow.whoAmI();
	}
}

