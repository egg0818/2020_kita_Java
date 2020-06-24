package com.koreait.hs.mission;

public class Mission6_6 {
	public static void main(String[] args) {
		int star = 4;
		
		for(int i=1; i<=star; i++) {
			for(int z=1; z<=i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
