package com.koreait.hs.level2;

public class ArrayOrder3 {
	public static void main(String[] args) {
		int[] arr = {100,29,33,13,88,5,46,92,1};					//버블정렬
		
		for(int i=arr.length-1; i>0; i--) {
			for(int z=0; z<i; z++) {
				if(arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
				}
			}
		}
		
		System.out.print("버블정렬 : ");
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
