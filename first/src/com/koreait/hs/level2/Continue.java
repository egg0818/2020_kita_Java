package com.koreait.hs.level2;

public class Continue {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if(i==5) {continue;}						//i==5 인 경우만 다음 문장 실행 안하고 for문은 계속 진행. 범위는 break랑 똑같음.
			System.out.println(i);
		}
	}
}
