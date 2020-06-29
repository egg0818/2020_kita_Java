package com.koreait.mission;

import java.util.Scanner;

public class Mission3_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요(남/여): ");
		String gender = scan.nextLine();		
		
		if("남".equals(gender) || "여".equals(gender)) {
			
			int ave = 150;								 	//지역변수는 초기값 주는게 좋음(에러방지). 디폴트 여자키
			
			System.out.print("키를 입력해주세요: ");
			float height = scan.nextFloat();				//실무에서는 String으로 받아서 숫자만 있는지 확인해서 처리.
			scan.close();
			
			if(gender.equals("남")) { 
				ave = 160;
			}
			
			if(height > ave) {							
				System.out.print("평균 초과입니다");
			} else if(height == ave) {
				System.out.print("평균입니다");
			} else {
				System.out.print("평균 미만입니다");
			}
		} else {
			System.out.println("성별이 올바르지 않습니다");
		}
	}
}
