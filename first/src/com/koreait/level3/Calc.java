package com.koreait.level3;

public class Calc {	
	int n1;					//전역변수는 멤버필드. 모든 메소드에서 사용가능
	int n2;					//static이 안붙은 애들은 인스턴스변수 라고 함. 인스턴스 변수, 인스턴스 메소드.
	
	public static int sum(int n1, int n2) {
		return n1+n2;					//전역변수랑 지역변수가 이름 똑같은 경우 더 가까운 지역변수가 됨.
	}
	
	public int sum() {
		return this.n1 + this.n2 ;		//n1,n2가 static 변수였으면 this. 이 아니라 클래스명. 으로 접근
										//this. 은 객체화가 돼야한다는 뜻.
	}
}
