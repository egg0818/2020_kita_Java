package com.koreait.hs.mission;

public class Mission9 {
	
	/* arr 짝수만 들어가도록 해주세요 순서대로
	 * 0번방에 2, 1번방에 4, 2번방에 6...
	 * ----
	 * 각 방에 있는 모든 값 더하고 출력
	 */
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*2;						//짝수만 더하기
		}
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		for(int i=0; i<arr.length; i++) {
			if(i!=0) { 
				System.out.print(",");	
			}
			System.out.print(arr[i]);
		}
	}
}