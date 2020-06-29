package com.koreait.level3;

public class MonitorTest {
	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		
		Monitor m2 = new Monitor();
		
		m1.brand = "삼성";
		m1.inch = 30;
		m2.brand = "LG";
		m2.inch = 35;
		Monitor.brand = "삼성"; //static은 클래스명.변수
		
		m1.printInfo();
		m2.printInfo();
	}
}
