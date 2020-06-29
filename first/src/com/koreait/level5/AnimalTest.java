package com.koreait.level5;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		// ani.sleep(); // 오류가 뜬다. animal엔 메소드가 없기때문에
		
		// Cat cat = ani;  // 프로그램에서 염려가 돼서 빨간줄이뜸
		
		Cat cat = (Cat) ani; // 강제로 형번환 해줌!!! cat타입은 sleep메소드를 알고있으니 출력가능!!
		cat.cry();
		cat.sleep(); // 형변환 할땐 부모의 메소드로 형변환하는게 보통 좋다. 상속관계가 아니면 형변환 불가!!
		
	}

}
