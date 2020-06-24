package com.koreait.hs;

public class If {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		if(n1 > n2) {									//else if가 여러개일 경우, 여러개가 true여도 가장 먼저 만나는 true만 실행된다.
			System.out.println("n1 > n2");
		}
		else if(n1 == n2) {
			System.out.println("n1 = n2");
		}
		else {
			System.out.println("n1 <= n2");
		}
		
		System.out.println("끝");
	}
}
