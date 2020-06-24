package com.koreait.hs.level2;

public class For {
	public static void main(String[] args) {
	
		/*
		for( ; ; ) {										//무한루프
			System.out.println("반복문!");
		}*/
		
		for(int i=0; i<10; i++) {							//for(시작점;반복 조건;증감식){}
			System.out.println("반복");
		}
		
		for(int i=100; i<110; i++) {						//시작이 반드시 0이어야 하는 것은 아니다.
			System.out.println(i);
		}
	}
}
