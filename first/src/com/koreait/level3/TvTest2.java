package com.koreait.level3;

public class TvTest2 {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		tv1.channelUp();
		tv2.channelUp();
		
		System.out.println(tv1.channel);
	}
}
