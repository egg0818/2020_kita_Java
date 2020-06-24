package com.koreait.hs.level3;

public class TvTest3 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];					//tvArr 에는 배열 자체의 주소값
		tvArr[0] = new Tv();					//배열 각각의 칸에는 각각의 객체의 주소
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
	}
}
