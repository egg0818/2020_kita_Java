package com.koreait.level1;

public class Variable3 {
	public static void main(String[] args) {
		int n1 = 2;
		float n2 = n1;	//int는 float로 자동형변환 될 수 있음	byte < short < int < long < float < double
		long n4 = 2222222;
		double n3 = n2;
		float result = n2 + n1; // float + int = float
		
		System.out.println(n1);
		System.out.println(n2);
	}
}
