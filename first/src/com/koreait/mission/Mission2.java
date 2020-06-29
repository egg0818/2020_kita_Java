package com.koreait.mission;

import java.util.Scanner;

public class Mission2 {
	
	/*
	 * 스캐너로 정수값 하나 입력받고,
	 * 그 값이 홀수면 "홀수입니다"
	 * 그 값이 짝수면 "짝수입니다"
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		if((scan.nextInt() % 2) == 1) {
			System.out.println("홀수입니다");
		}else { 
			System.out.println("짝수입니다");
		}
		scan.close();
	}
}
