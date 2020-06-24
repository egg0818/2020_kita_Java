package com.koreait.hs;

public class Operator5 {
	public static void main(String[] args) {
		//비교연산자 boolean
		int n1 = 10;
		int n2 = 11;
		int n3 = 11;
		
		//System.out.println(n1 = n2);			//n2를 n1에 주고 n1을 출력. 이렇게 쓰면 안됨.
		System.out.println(n1 == n2);			//비교연산자. 
		
		boolean result = (n1 == n2);
		System.out.println(n1);
		System.out.println(result);
		
		System.out.println();
		result = (n1!=n2);
		System.out.println(result);
		System.out.println(n1 != n2);
		
		System.out.println();
		result = (n1>n2);
		System.out.println("n1 > n2: "+ result);
		result = (n1<n2);
		System.out.println("n1 < n2: " + result);
		
		System.out.println();
		result = (n1>=n2);
		System.out.println("n1 >= n2: " + result);
		result = (n1<=n2);
		System.out.println("n1 <= n2: " + result);
		
		result = (n1<=n2) || (n2>n3);
		System.out.println(result);
		
		result = (n1<=n2) && (n2<n3);
		System.out.println(result);
	}
}
