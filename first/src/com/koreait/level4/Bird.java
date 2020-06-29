package com.koreait.level4;

public class Bird extends Animal {    //Birds가  Animal을 사용한다!!! 
	
	
	void flying() {
		System.out.println("훨~ 훨~");
	}
	
	@Override // 실수 방지용!!!!
	void crying() {
		//super.crying(); //부모값까지 나오게할려면 이렇게
		System.out.println("짹짹"); // 오버라이딩 . 주의할점 : 1.완전히 똑같이 적어야함 2.@Override 적어야함
	}
	
	protected Bird(String name) {
		// super() // 매개변수가 없다면 기본생성자 자동으로 생성됨 
		super(name, "조류"); // 부모의 생성자 호출
	}
	
	/*public Bird(){
		super("", "");
		}*/
	
	// public Bird() {super("","");}
	// 2.부모에있는 생성자 호출!!!!!
	
	
	

}
