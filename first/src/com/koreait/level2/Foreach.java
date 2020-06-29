package com.koreait.level2;

public class Foreach {
	public static void main(String[] args) {
		int[] arr = {29,33,13,88,5,46,92,1,19};	
		
		/* foreach 문은 sequence가 있는 객체는 모두 사용가능
		 * 객체가 가지고 있는 값을 순차적으로 하나씩 넘겨준다.
		 * (자신이 가지고 있는 길이만큼)
		 */
		
		for(int val : arr) {
			System.out.print(val+ " ");
		}
		
		System.out.println();
		
		//아래 문장과 같은 의미
		for(int i=0; i<arr.length; i++) {
			int val = arr[i];
			System.out.print(val+ " ");
		}
	}
}
