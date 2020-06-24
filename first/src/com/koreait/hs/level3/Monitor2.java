package com.koreait.hs.level3;

public class Monitor2 {
	String brand;
	int inch;
	static int cnt;
	
	public Monitor2(String brand, int inch) {
		cnt++;
		this.brand = brand;
		this.inch = inch;
	}
	
	void printInfo() {
		System.out.printf("brand: %s, inch: %d", this.brand, this.inch);
	}
}
