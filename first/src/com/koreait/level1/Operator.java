package com.koreait.level1;

public class Operator {
	public static void main(String[] args) {
		int n1 = 10;
		n1++;
		System.out.println(n1);
		
		int n2 = 10;
		System.out.println(n2+1); //결과는 똑같지만 변수안의 값은 다름. (n1은 실제로 1이 더해지고 n2는 그대로 10)
		
		++n1;
		System.out.println(n1);
		
	}
}
