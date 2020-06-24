package com.koreait.hs.level2;

public class Break {
	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			if(i==5) {break;}						//i==5 인 경우 for문 빠져나감.
			System.out.println(i);
		}
		
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<3;j++) {
				if(i==5) {break;}						//i==5 인 경우 가장 작은, break가 포함되어있는 for문만 빠져나감.
				System.out.println(i);
			}
		}
	}
}
