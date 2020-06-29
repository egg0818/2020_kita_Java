package com.koreait.mission;

import java.util.Scanner;

public class GreatMission2 {
	/*
	 * 1.사이다(500원)
	 * 2.콜라(600원)
	 * 3.환타(700원)
	 * 4.마운틴듀(800원)
	 * 5.초코우유(400원)
	 * 6.바나나우유(400원)
	 * 메뉴를 선택하세요(종료:0): 1
	 * 사이다 500원
	 * 메뉴를 선택하세요(종료:0): 5
	 * 초코우유 400원
	 * 메뉴를 선택하세요(종료:0): 7
	 * 잘못 입력하셨습니다.
	 * 메뉴를 선택하세요(종료:0): 0
	 * 종료! 총 900원
	 */
	
	public static void main(String[] args) {
		String[] name = {"사이다","콜라","환타","마운틴듀","초코우유","바나나우유"};
		int[] cost = {500,600,700,800,400,400};
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d. %s(%d원)\n",i+1, name[i], cost[i]);
		}
		
		while(true) {
			System.out.print("메뉴를 선택하세요(종료:0): ");
			int num = scan.nextInt();
			int index = num-1;
			
			if(num==0) {
				break;
			}else if(num>name.length || num<0) {
				System.out.println("잘못입력하셨습니다.");
			}else {
				sum += cost[index];
				System.out.printf("%s %d원\n",name[index],cost[index]);
			}
		}
		scan.close();
		System.out.printf("총 %d원 입니다",sum);		
	}
}
