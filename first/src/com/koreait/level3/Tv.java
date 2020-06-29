package com.koreait.level3;


//사용자 정의 클래스
public class Tv {
	String name;
	boolean power;
	int channel;
	
	void changePower() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}

/*객체는 멤버 필드(속성), 멤버 메소드로 구성되어있다*/