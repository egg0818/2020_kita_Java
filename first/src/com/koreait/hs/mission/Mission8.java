package com.koreait.hs.mission;

import java.util.Scanner;

public class Mission8 {
	/* 랜덤값 10~90을 맞히는 게임
	 * 
	 * 값 입력 : 20
	 * UP
	 * 값 입력: 40
	 * UP
	 * 값 입력 : 60
	 * DOWN
	 * 값 입력 : 50
	 * Great!
	 */
	public static void main(String[] args) {
		int min = 10;												//수정하기 편하게 따로 지정해주는게 좋음
		int max = 90;
		int num = (int)((Math.random() * (max-min+1)) + min);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("값 입력: ");
			int num2 = scan.nextInt();
			
			if(num2 > max || num2<min) {
				System.out.println("잘못입력하셨습니다");
			}else if(num2 < num) {
				System.out.println("UP");
			} else if(num2 > num) {
				System.out.println("Down");
			} else {
				System.out.println("great!");
				break;
			}
		}
		scan.close();
	}
}
