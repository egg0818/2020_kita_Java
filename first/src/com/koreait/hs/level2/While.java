package com.koreait.hs.level2;

public class While {
	public static void main(String[] args) {

		for(int i=0; i<5; i++) {							//몇번 돌릴지 알 때 for문 쓴다
			System.out.println(i);
		}
		
		System.out.println("-------");
		
		int i=0;
		while(i<5) {										//어떤 조건동안 계속 돌아야 할 때
			System.out.println(i);
			i++;
		}
	}
}
