package com.koreait.hs.level2;

public class Method3 {
	public static void main(String[] args) {
		int result = sum(15,10);
		System.out.println(result);
		
		result = minus(50,30);
		System.out.println(result);
		
	}
	
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
	
	/*public static int sum2(int n1, int n2) {
		if(n1 > 10) {
			return n1+n2;							//비void형 메소드는 무조건 return을 만나야함. 이 경우 조건에 따라 return을 못만날수도 있어서 에러.
		}
	}*/
	
	public static int minus(int n1, int n2) {
		return n1-n2;
	}
}
