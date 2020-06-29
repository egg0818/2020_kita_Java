package com.koreait.mission;

public class MethodMission1 {
	
	public static void main(String[] args) {
		//guguDan(5);
		
		guguDan(4,7);							//오버로딩
	}
	
	public static void guguDan(int num) {	
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		System.out.println();
	}
	
	public static void guguDan(int sDan, int eDan) {					//오버로딩
		for(int i=sDan; i<=eDan; i++) {
			guguDan(i);
		}
	}
}
