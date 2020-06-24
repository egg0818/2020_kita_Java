package com.koreait.hs.level2;

public class Method4 {
	public static void main(String[] args) {
		sum(4,5);
		sum(5,7,9);
		sum(1,2,3,4);
	}
	
	public static void sum(int ...arr) {				//int ...arr(매개변수) -> 배열로 만들어진다. 매개변수를 여러개 쓴다면 맨 위에 써야한다. '...' 가변인자
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sul: " + sum);
	}

}
