package com.koreait.hs.level2;

import java.util.Arrays;

public class ArrCopy {
	public static void main(String[] args) {
		int[] arr = {2,4,6,7,10,15};
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(arr == arr2);										//주소값 같은지
		System.out.println("arr : " + Arrays.toString(arr));					//배열 출력하는 방법.
		System.out.println("arr2 : " + Arrays.toString(arr2));
	}
}

