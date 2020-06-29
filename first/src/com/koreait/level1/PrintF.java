package com.koreait.level1;

public class PrintF {
	public static void main(String[] args) {
		int age = 29;
		String name = "정혜선";
		float vision = 0.9f;
		
		System.out.println("내 이름은 " + name + "입니다. 나의 나이는 "+ age + "입니다." + "나의 시력은 "+ vision + "입니다");
		System.out.printf("내 이름은 %s입니다. 나의 나이는 %d입니다. 나의 시력은 %.1f입니다\n", name, age, vision);
		//%d 정수 출력, %,d 1000단위에 ','찍혀서 출력(1,000) 
		
		System.out.printf("내 이름은 %s입니다. 나의 나이는 %s입니다. 나의 시력은 %s입니다\n", name, age, vision);	//%s로만 해도 됨
		
		char v1 = 'A';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		int v2 = 66;
		System.out.printf("%c : %d \n", (char)v2, v2);
	}
}
