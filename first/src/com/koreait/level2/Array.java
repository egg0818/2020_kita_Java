package com.koreait.level2;

public class Array {
	public static void main(String[] args) {
		//변수 선언을 줄이기 위해 배열 사용한다.
		//반복문 for문에 찰떡
		
		int[] arr = new int[100];						//배열 공간만 만든 것. arr은 레퍼런스 변수.값이 아닌 주소값을 저장한다.
		//int arr[]										//C에서 배열을 만드는 방법. 자바에서도 쓸 수 있지만 일반변수처럼 보이기 때문에 비추.
		char[] arr2 = new char[20];
		float[] arr3 = new float[10];					//일반배열은 숫자값인 경우 빈공간은 0
		String[] arr4 = new String[200];				//레퍼런스 배열의 각각의 방 (String[0], String[1]..)도 레퍼런스 변수
														//각각의 빈 방에는 null 들어있다.
														//변수 arr4에는 주소값이 저장되어 있다.
		
		boolean[] arrb = new boolean[10];				//boolean 빈공간은 false
				
		
		int[] arr5 = {10,20,30,40};						//배열 공간과 값을 한번에
		
		arr[0] = 10;									//배열에 값 넣는 방법
		arr[1] = 20;
		arr[2] = 30;									
		arr[99] = 990;									//arr[100] 배열은 인덱스가 0~99 
		
		System.out.println(arr[0]);						//값 출력
		System.out.println(arr);						//주소값 출력
		System.out.println(arr4[1]);					//String[] 기본값 null
		System.out.println(arr3[0]);					//float[] 기본값 0.0 
		System.out.println(arrb[0]);					//boolean[] 기본값 false
		
		
		//---------------------------------------------------------------
		
		System.out.println("-----------------------------------");
		
		int[] arr7 = new int[100];
		
/*		for(int i=0; i<100; i++) {						//입력과 출력은 for문 하나에 같이 쓸 수 있지만 각각 분리하는 것이 좋다.(메소드를 만들 떄, 메소드는 한가지 일만 해야하기 때문에 입력이나 출력 한가지만 해야함)
			arr7[i] = 5;
		}
		
		for(int i=0; i<100; i++) {
			System.out.println(arr7[i]);
		}*/
		
		for(int i=0; i<arr7.length; i++) {
			arr7[i] = 5;
		}
		
		for(int i=0; i<arr7.length; i++) {				//리터럴값은 되도록 사용하지 않는 것이 좋다. 수정할때 좋게. 100 대신 arr7.length 사용
			System.out.println(arr7[i]);				//'객체주소값.~' 은 null일때는 사용할 수 없음.에러뜬다.
														// . 뒤에 ()가 없으면 속섣 (ex> arr.length)
														// ()가 있으면 기능?
		}
	}
}
