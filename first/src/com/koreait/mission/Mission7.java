package com.koreait.mission;

import java.util.Scanner;

public class Mission7 {
	
	/*숫자를 입력(종료:0): 5
	 * 숫자를 입력(종료:0): 7
	 * ..
	 * 숫자를 입력(종료:0): 0
	 * 합계 : 12
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum=0;
		
		while(true) {
			System.out.print("숫자를 입력(종료:0): ");
			int num = scan.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;	
		}
		System.out.println("합계 : " + sum);
		scan.close();
	}
}
