package com.koreait.level4;

public class ValueTest {

	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");

		System.out.println("1: " + str == str2);	//주소값비교
		System.out.println("2: " + str.equals(str2)); // 원래 주소값 비교인데 String으로 오버라이딩 돼서 값비교가 됨 
		
		Value val1 = new Value(1);
		Value val2 = new Value(1);
		
		System.out.println("3: " + (val1==val2)); //주소값비교
		System.out.println("4: " + val1.equals(val2)); //주소값비교인데, 오버라이딩해서 값비교로 만들고싶음. 어떻게해야할까? 
	

	}
}

/*
 * 
 *
 */