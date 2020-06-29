package com.koreait.mission;

public class Practice3 {
	public static void main(String[] args) {
		int len =9;
		int[] arr = new int[len];
		//1~9  중 3개. 중복되지 않도록.
		
		for(int i=0; i<len; i++) {
			arr[i] = (int)(Math.random()*9 +1);
			for(int z=0; z<i; z++) {
				if(arr[i] == arr[z]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}