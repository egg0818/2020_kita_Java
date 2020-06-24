package com.koreait.hs;

public class ConditionOperator {
	public static void main(String[] args) {
		int num = 3;
		boolean isOdd = (num % 2 == 1 ? true : false);				//삼항식.if문 대신 쓸 수 있지만 가독성이 떨어지므로 간단한 것에만 사용하는 것이 좋다.
		System.out.printf("%d is odd? %b \n",num,isOdd);
		
		String result = (num % 2 == 1 ? "홀수" : "짝수");
		System.out.printf("%d is %s \n",num,result);
		
	}
}
