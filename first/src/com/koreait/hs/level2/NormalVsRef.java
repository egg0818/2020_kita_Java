package com.koreait.hs.level2;

public class NormalVsRef {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("before num: "+ num);
		changeVal(num);
		System.out.println("after num: "+num);				//num 값이 바뀌지 않음. 일반변수는 메소드 영향을 안받음. 복사해서 넘겨주는 거라 서로 다른 변수.
		
		int[] numArr = {10};
		System.out.println("before numArr[0] : " + numArr[0]);
		changeVal(numArr);
		System.out.println("after numArr[0] : " + numArr[0]);			//레퍼런스 변수는 메소드 영향을 받음.주소값을 넘겨줌. 서로 같은 주소값을 가르키기 때문에 값 바뀜.
		
	}
	
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
	}
	
	public static void changeVal(int num) {
		num = 30;
	}
}
