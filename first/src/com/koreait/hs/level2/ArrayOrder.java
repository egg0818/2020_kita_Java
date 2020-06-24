package com.koreait.hs.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		int[] arr = {29,33,15,88,5,46,92,1,19};
		
		for(int i=0; i<arr.length-1; i++) {							//순차정렬
			for(int j=i+1 ; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("순차정렬 : ");
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
		
		
	}
}
