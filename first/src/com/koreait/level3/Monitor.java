package com.koreait.level3;

public class Monitor {
	static String brand;	//static: 객체들이 값을 공유. 멤버필드에 static 붙이는건 특수한 경우(모든 객체가 같은 값을 가지고 있을때)
	int inch;
	
	void printInfo() {
		System.out.printf("brand: %s, inch: %d\n", this.brand, this.inch);
	}
	
	static void printBrand() {
		System.out.println(brand);
	}
	
	//static void printInch() {	//static 붙은 메소드는 일반 멤버변수 사용할 수 없다.
		//System.out.println(inch);	//inch는 객체화가 필요하기 때문에 static 메소드 안에 못들어옴. 
	//}
	
	void printInch() {
		System.out.println(brand); //일반 메소드 안에 static 변수 쓸 수 있다.
		System.out.println(inch);
	}
}
