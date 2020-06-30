package com.koreait.level6;

public abstract class Player {
	
	public abstract void play();  // play 메소드를 선언만 하고 싶다. 동작은 신경안쓰고. -> 추상메소드
								  // 추상 메소드를 하나라도 갖고있으면 무조건 abstract를 붙여줘야함
								  // 역할 1.객체화x 2.부모역할만하겠다(내자식들의 주소값만 가르키겠다)
								  // abstract를 붙인다의 의미 : 나를 상속하시오! (부모역할만 하겠다)
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}

}

class CDPlayer extends Player {

	@Override
	public void play() {
		System.out.println("CD를 재생합니다");	
	}
	
}

class DVDPlayer extends Player {

	@Override
	public void play() {
		System.out.println("DVD를 재생합니다");
		
	}
	
}