package com.koreait.hs.level3;

import java.util.Arrays;

public class List {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		//리터럴은 4만 사용할 수 있고	[1,2,3,4] 출력
		int[] temp = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = 4;
		
		arr=temp;
		System.out.println(Arrays.toString(arr));
	}
}
