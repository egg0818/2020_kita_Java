
/* 상속
 * 위로올라갈수록 추상적 (공통된특징) 내려갈수록 구체적
 * 모든 객체는 객체화하면 Object 객체부터 만들어진다.(Animal이 오브젝트 참조) (static아님)
 * Object <- Animal <- Bird
 * 생성자를 통해 값을 넣으면 값을 바꿀수없음
 * 기본생성자를 자동으로 만들어주는 경우 - 컴파일러가 자동으로 생성자를 만들어줌
 * 생성자를 만들지 않으면 부모의 기본생성자가 자동으로 만들어짐
 * 단일산속만 가능함. 다중상속은 위험해서 막아놓음.
 */


package com.koreait.hs.level4;

public class Animal  { // public class Animal extends Object : Animal뒤엔 생략 
	private String name;
	private String type; // 포유류, 조류, 어류, 파충류..
	
	protected Animal(String name, String type) { //protected - 패키지로 범위를 정해줌!
		this.name = name;
		this.type = type;
	}
	// 생성자를 만드니까 Bird가 에러가 떴다 이유는?? 기본생성자가 없다!!!!!
	//기본생성자를 자동으로 만들어주는 경우 - 컴파일러가 자동으로 생성자를 만들어줌
	//해결방법 : 1. 기본생생성자 생성 2.부모에 있는 생성자 호출!
	
	// public Animal() {} // 1.기본생성자 생성!!
	
	void crying() {
		System.out.println("울다");
	}
	
	void eat() {
		System.out.println("먹다");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s입니다.\n", name);
	}
}
