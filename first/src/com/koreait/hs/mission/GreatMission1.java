package com.koreait.hs.mission;

import java.util.Scanner;

public class GreatMission1 {
/* 숫자 야구게임
 * 
 * 랜덤한 중복되지 않은 숫자 3개(1~9)			//숫자 갯수 바뀔 수 있도록 유연하게.
 * 
 * 4,8,2    (나는 알 수 없는 숫자)
 * ---------- 
 * 1,2,3 > S(숫자,자리 맞는경우):0 / B(자리는 틀렸지만 숫자는 맞는경우):1 / O(다 틀리면):2
 * 4,5,6 > S:1 / B:0 / O:2
 * ...
 * 4,8,2 > S:3 / B:0 / O:0
 * 종료!
 */
	public static void main(String[] args) {
		final int LEN = 3;
		
		Scanner scan = new Scanner(System.in);
		
		int[] rArr = new int[LEN];					//랜덤한 숫자 3개
		int[] myArr = new int[LEN];					//내가 입력하는 숫자 3개
		
		for(int i=0; i<LEN; i++) {					//랜덤 숫자 3개 중복되지 않게 뽑기
			rArr[i] = (int)(Math.random()*9 +1);
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
		/*
		for(int val : rArr) {									//랜덤숫자 출력
			System.out.print(val + " ");
		}
		
		System.out.println();*/
		
		while(true) {
			int s=0,b=0;
			
			for(int z=0; z<LEN; z++) {										//입력받기
				myArr[z] = scan.nextInt();
			}
			
			for(int i=0; i<LEN; i++) {										//비교
				for(int z=0; z<LEN; z++) {
					if(rArr[i] == myArr[z]) {
						if(i==z) { 
							s++; 
						}
						else { 
							b++;
						}
					}
				}
			}
			System.out.printf("s: %d  b:%d  o:%d\n",s,b,LEN-s-b);			//출력
			if(s==LEN) { break;}
		}
		System.out.print("정답");
	}
}
