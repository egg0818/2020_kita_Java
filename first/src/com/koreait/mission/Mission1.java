package com.koreait.mission;

public class Mission1 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;
		
		//결과를 변수에 담고 그 변수를 콘솔에 찍으면 3.3333 나오도록
		
		float result = (float)n1/n2;		//n2는 자동으로  float으로 형변환 됨.
		System.out.println(result);
		
		//3.3 나오도록
		System.out.printf("%.1f\n",result);		
	}
}
