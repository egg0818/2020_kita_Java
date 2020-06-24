package com.koreait.hs.mission;

import java.util.Scanner;

public class Mission3 {
	/*성별을 입력해주세요: (남/여)
	 * 키를 입력해주세요 :
	 * 
	 * 남자기준 : 160
	 * 여자기준 : 150
	 * 
	 * "평균 미만입니다."
	 * "평균입니다"
	 * "평균초과입니다"
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ave = 0;
		
		System.out.print("성별을 입력해주세요(남/여): ");
		String gender = scan.nextLine();
		
		if(gender.equals("남")) { 
			ave = 160; 
		} else if(gender.equals("여")){ 
			ave = 150; 
		} else {								
			System.out.println("성별이 올바르지 않습니다");
			//System.exit(0);							//강제 종료.좋지 않음
			return;
		}
		
		System.out.print("키를 입력해주세요: ");
		float height = scan.nextFloat();				//실무에서는 String으로 받아서 숫자만 있는지 확인해서 처리.
		scan.close();
		
		if(height > ave) {
			System.out.print("평균 초과입니다");
		} else if(height == ave) {
			System.out.print("평균입니다");
		} else {
			System.out.print("평균 미만입니다");
		}
	}
}
