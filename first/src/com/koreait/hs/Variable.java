package com.koreait.hs;

public class Variable {
	public static void main(String[] args) {
		char v1;	//정수형		2byte
		v1 = 'A';
		System.out.println(v1);
		System.out.println('A');
		v1 = 'B';
		System.out.println(v1);
		
		byte v2;	//정수형		-128~127
		short v3;	//정수형		2byte 
		int v4;		//정수형		속도가 제일 빠름.주로 int쓴다. cpu는 아직 32(메모리만 64)라서 4byte단위로 처리.
		long v5;	//정수형		8byte
		
		v2 = (byte)128;	//강제형변환. 오버플로우돼서 -128 나옴
		v3 = 20;
		v4 = 30;
		v5 = 50;	
		
		v3 = v2; 		//자동형변환. v3은 short인데 v2가 byte타입이라 자동으로 형변환됨
		
		System.out.println();
		System.out.println(v2 + 5); 	//그냥 v2에 5더한 값. (형변환x)
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		float v6;			//실수형 4byte		속도가 빠르다.
		v6 = (float)10.1;	//10.1은 double타입. float타입으로 강제 형변환.
		v6 = 10.1f;			//f를 붙이면 float타입이 된다. F,f 구분 없음.
		double v7;			//실수형 8byte		범위가 넓을수록 정확도가 높다.
		v7 = 10.1;
		
		v6 = (float)v7;
		
		System.out.println(v6);
		System.out.println(v7);
		
		boolean v8;	//불린타입 true or false
		System.out.println();
		v8 = true;
		System.out.println(v8);
		
		
		String r1 = "안녕하세요";	//레퍼런스 변수 (변수타입이 대문자로 시작하면 레퍼런스 변수)
		System.out.println(r1);
		Variable r2;	//레퍼런스 변수(클래스 명)
	}
}
