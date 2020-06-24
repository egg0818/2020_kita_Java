package com.koreait.hs.level2;

public class Array2 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int[][] arr2 = {						//2차월 배열 [행][열] 
				{10,20,30},						// (0,0) (0,1) (0,2)
				{12,13,14,11},						// (1,0) (1,1) (1,2)
			};
		
		int[][][] arr3 = new int[3][4][5];		//3차원배열. 잘 안씀. DB에서 자료를 가져오면 보통 2차원 배열

		System.out.println(arr.length);			//2(행의 갯수) 나옴. {10,20,30} 처럼 {}로 묶인 것 세트.
		System.out.println(arr[0].length);		//3(열의 갯수) 나옴. 0번째 행의 값 갯수. 가변이 가능하다.. 1번쨰 행의 갯수는 다를수도 있다.
																				// {10,20,30}
																				// {12,13,14,11}
		
		for(int i=0; i<arr2.length; i++) {				//2차원 배열 출력
			for(int z=0; z<arr2[i].length;z++) {
				System.out.print(arr2[i][z] + ", ");
			}
			System.out.println();
		}
	
	}
}
