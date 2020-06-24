package com.koreait.hs.mission;

public class Mission6_5 {
	
	/*
	      *****
	      *****
	      *****
	      *****
	      *****
	 */
	public static void main(String[] args) {
		int star = 5;
		
		for(int i=1; i<=star; i++) {
			for(int z=1; z<=star; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		/*for(int i=1; i<=star*star; i++) {                        //for문 하나로도 만들 수 있지만 가독성이 떨어짐. 비추
			System.out.print("*");
			if(i%star ==0) {
				System.out.println();
			}
		}*/
	}
}
