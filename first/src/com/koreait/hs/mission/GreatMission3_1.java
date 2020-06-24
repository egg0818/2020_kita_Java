package com.koreait.hs.mission;

public class GreatMission3_1 {
	public static void main(String[] args) {
		int[][] arr = {
				{90,100,88},		//영어점수
				{34,99,45},			//수학
				{98,65,87}			//국어
		};
		
		/*영어합계 : ? , 평균 : ? 
		 * 수학합계:? , 평균 : ?
		 * 국어합계:? , 평균 : ?
		 * 전체합계:? , 전체평균 :?
		 */
		
		String[] name = {"영어","수학","국어"};
		int[] sum = new int[name.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				sum[i] += arr[i][z];
			}
		}
		
		int t_sum=0;
		int t_count=0;
		
		for(int i=0; i<sum.length; i++) {								//객체지향에서는 계산부분 출력부분 따로 분리해줘야하지만 절차지향으로 짠거라 그냥 합침.
			t_sum += sum[i];
			t_count += sum.length;
			
			System.out.printf("%s합계: %d, 평균: %.2f\n", name[i],sum[i],(float)sum[i]/sum.length);
		}
		
		System.out.printf("전체합계: %d, 전체평균: %.2f", t_sum, (float)t_sum/t_count);
	}	
}
