package com.koreait.level4;

public class ValueTest {

	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");

		System.out.println("1: " + str == str2);	//주소값비교
		System.out.println("2: " + str.equals(str2)); //값비교
		
		Value val1 = new Value(1);
		Value val2 = new Value(2);
		
		System.out.println("3: " + (val1==val2)); //주솟값비교
		System.out.println("4: " + val1.equals(val2)); //주솟값비교인데, 오버라이딩해서 값비교로 만들고싶음 
	

}
}

/*
 * 
 *
 */