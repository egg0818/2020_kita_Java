package com.koreait.level2;

public class Method1 {
	public static void main(String[] args) {	  	//public static 리턴타입 메소드명(매개변수,파라메터) : 메소드 선언부 ,  {} : 메소드 구현부
													//리턴타입이 void일 떄와 아닐때 호출하는 방법이 다르다.
													//메소드 안에서 또 메소드 정의하는 개념은 어떤 언어에도 없음.
		
		sum(10,15);									//static 메소드이기 때문에 바로 호출 됨.요즘은 웬만하면 static 쓴다.
		minus(20,5);								//호출한 형태만 보고 메소드 선언부를 유추할 수 있어야 함. 리턴값 없고 매개변수는 정수값 2개. 결과값이 뭐가 나옴.
													//minus(20,5)에서 20,5는 인수 혹은 인자라고 함.
		
	}
	
	public static void sum(int n1, int n2) {		//메소드는 return을 만나야 종료. 비void형은 return 필수. void형에서는 선택.
		System.out.println(n1+n2);
	}
	
	public static void minus(int n1, int n2) {
		System.out.println(n1-n2);
	}
	
}
