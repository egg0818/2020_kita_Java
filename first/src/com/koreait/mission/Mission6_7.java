package com.koreait.mission;

public class Mission6_7 {
	public static void main(String[] args) {

		int star = 5;
		/*
		for(int i=0; i<star; i++){
			for(int z=star-1; z>i; z--) {
				System.out.print(" ");
			}
			for(int r=0; r<=i; r++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		for(int i=1; i<=star; i++) {
			for(int z=star; z>0; z--) {							//삼항연산자...이용....
				System.out.print(i<z ? " " : "*");
			}
			System.out.println();
		}
	}
}
