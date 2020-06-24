package com.koreait.hs.mission;

public class MethodMission2 {
	public static void main(String[] args) {
		//printStar(6);
		//printStar(3);
		
		//printStarSqure(4);
		//printStarTriangle(5);
		printStarTriangleReverse(5);
	}
	
	public static void printStar(int num) {
		for(int i=0; i<num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printStarSqure(int num) {
		for(int i=0; i<num; i++) {
			printStar(num);
		}
	}
	
	public static void printStarTriangle(int num) {
		for(int i=1; i<=num; i++) {
			printStar(i);
		}
	}
	
	public static void printStarTriangleReverse(int num) {
		for(int i=1; i<=num; i++) {
			for(int z=0; z<num-i; z++) {
				System.out.print(" ");
			}
			printStar(i);
		}
	}
}
