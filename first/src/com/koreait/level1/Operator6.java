package com.koreait.level1;

public class Operator6 {
	public static void main(String[] args) {
		//String str1 = "안녕";
		//String str2 = "안녕";
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		String str3 = str2; 						//이 경우 str3과 str2의 주소값은 같다.
		String str4 = "메롱";
		
		System.out.println(str1 == str2);			//문자열(레퍼런스 변수)은 ==로 값 비교 하면 안된다, 레퍼런스 변수는 주소값 비교
		System.out.println(str2 == str3);
		
		System.out.println(str1.equals(str2));		//레퍼런스변수의 값 비교
		System.out.println(str1.equals(str4));
		System.out.println("안녕".equals("안녕"));
		System.out.println("안녕".equals(str1));
		System.out.println(str1.equals("안녕"));
	}
}
