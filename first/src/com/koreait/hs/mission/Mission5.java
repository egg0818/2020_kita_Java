package com.koreait.hs.mission;

import java.util.Scanner;

public class Mission5 {
	/* if, switch 상관 노
	 * 정수를 입력해주세요: (0~100)
	 * 90점 이상 A
	 * 80점 이상 B
	 * 70점 이상 C
	 * 나머지는 D입니다.
	 * 
	 * 1의 자리 수가 7점 이상이면 +
	 * 1의 자리 수가 3점 이하면 - 
	 * ex> 95->A, 97->A+, 83->B-
	 * 
	 * D는 무조건 D
	 * 100은 A+
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요(0~100): ");
		int score = scan.nextInt();
		scan.close();

		if(score > 100 || score < 0) {
			System.out.print("잘못 입력하셨습니다");
			return;														//메소드 종료
		}else if(score<70) {
			System.out.print("D");
		} else if(score<80){
			System.out.print("C");
		} else if(score<90){
			System.out.print("B");
		} else {
			System.out.print("A");
		} 
			
		/*
		if(score >= 70 && score%10 >=7 || score == 100){				//조건 많으면 좋지 않다.
			System.out.print("+");
		}else if(score >= 70 && score%10 <= 3 && score != 100) {
			System.out.print("-");
		}*/
		
		if(score >= 70) {
			if(score%10 >= 7 || score == 100) {
				System.out.print("+");
			} else if(score%10 <=3) {
				System.out.print("-");
			}
		}
	}
}
