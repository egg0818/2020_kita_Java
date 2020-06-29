package com.koreait.level1;

public class Switch {
	public static void main(String[] args) {
		//int num = 2;
		String num ="이";
				
		switch(num) {									//스위치에서는 문자열 사용할 때 equals 안써도 됨. 문자열 이용할때 스위치 많이 쓴다.
			case "일":
				System.out.println("1이다");
				break;									//break 없으면 다음 case까지 실행됨
			case "이":
				System.out.println("2이다");
				break;
			case "삼":
				System.out.println("3이다");
				break;
			default:									//없어도 됨. 없는경우 case조건이 만족하지 않으면 아무것도 안뜸.
				System.out.println("1~3 아니다");
				break;									//마지막 break는 생략 가능.
		}
	}
}
