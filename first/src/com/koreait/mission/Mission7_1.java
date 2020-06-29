package com.koreait.mission;

public class Mission7_1 {
	
	/*
	 * While문을 사용하여
	 * 1~100을 모두 더한 값 출력
	 * 합계:5050
	 */
	public static void main(String[] args) {
		int sum=0, num=0;
		
		while(num++ <100) {
			sum += num;
			//num++;							//조건문 안에 넣어버림
		}
		System.out.print(sum);
	}
}
