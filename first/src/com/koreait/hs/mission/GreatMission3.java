package com.koreait.hs.mission;

public class GreatMission3 {
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
		
		String[] name = {"영어", "수학", "국어"};
		int[] sum = new int[name.length];
		
		for(int i=0; i<arr.length; i++) {					//각 과목 점수 합산
			for(int z=0; z<arr[i].length; z++) {
				sum[i] += arr[i][z];
			}
		}

		int t_sum =0;				//전체 점수 합산
		int t_count=0;				//전체 평균 구하기 위한 카운트
		
		for(int i=0; i<sum.length; i++) {							
			t_sum += sum[i];
			t_count += arr[i].length;
			System.out.printf("%s합계: %d, 평균: %.2f\n", name[i],sum[i],(float)sum[i]/arr[i].length);			//과목당 합계, 평균 출력
		}
		
		System.out.printf("전체 합계: %d, 전체 평균: %.2f\n",t_sum,(float)t_sum/t_count);			//전체 합산, 전체 평균 출력
	}
}
