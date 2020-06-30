package com.koreait.level4;

public class ValueTest2 {

	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println(str);
		
		System.out.println();
		
		Value val = new Value(1000); 
		System.out.println(val); //문자열 + object라서 자동으로 tostring()호출
								//println은 자동으로 String으로 바꿔서 출력.val을 그대로 써도 toString() 호출


		String strVal = String.valueOf(val);  //println 메소드에서 처리하는 일
		String strVal2 = strVal.toString(); 	//(String으로 변환하는과정)
		// 없어도 됨. 그냥적어둔것!!
		
	}
	
	
}

/* 
 * String.format : printf 라고 생각 하면됨. 대신 리턴함.format이 유연해서 이걸 쓰기를 추천함!!
 * Strting.vaLueOf : print라고 생각 하면됨. 대신 리턴함
 * 
 * final은 클래스에 붙이면 상속불가, 변수앞에 붙이면 상수, 메소드에 붙이면 오버라이딩x
 * + static 못붙임. 프리징 시킨다고 보면 됨.
 * 
 * 
 */
