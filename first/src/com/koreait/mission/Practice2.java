package com.koreait.mission;

public class Practice2 {
	public static void main(String[] args) {
		//랜덤값 뽑기
		double r = Math.random();							//1미만의 값 나옴 ~0.999999999999999999...
		
		int rVal = (int)(r * 10);							//0~9사이의 랜덤 (r*10을 하면 9.999999... 최댓값. 정수형으로 바꾸기)
		int rVal2 = (int)(r * 16);							//0~15 (r*16을 하면 15.99999... 가 최댓값. 정수형으로 바꾸면 소수점 날아감)
		int rVal3 = (int)(Math.random() * 16);				//한줄로 나타낼 수 있음
		int rVal4 = (int)((Math.random() * 15) + 1);		//1~15 (0~14 나타낸 후 +1)
		int rVal5 = (int)((Math.random() * 21) + 30);		//30~50
		int rVal6 = (int)((Math.random() * 32) + 46);		//46~77
		System.out.println(rVal6);
	}
}