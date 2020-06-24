package com.koreait.hs.level3;

public class MonitorTest2 {

	public static void main(String[] args) {	
		/*
		 * static : 객체들이 값을 공유할때 씁.
		 * 객체마다 다른 값을 가져야 하는 경우에는 static 쓰면 안됨.
		 * static은 안되는 경우를 제외하고는 붙이는 편이 좋음.
		 */
		Monitor.brand = "삼성";
		Monitor.printBrand();		//static 메소드는 객체화 필요없음.
		
		Monitor m1 = new Monitor();
		m1.printInfo(); 			//객체화 필요한 메소드(static안붙은거)
		
		int result = Integer.parseInt("11");	//static 메소드이기 때문에 객체화 없이 사용 가능.
	}
}
