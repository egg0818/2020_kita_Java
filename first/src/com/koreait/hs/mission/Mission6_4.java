package com.koreait.hs.mission;

public class Mission6_4 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int z=2; z<10; z++) {
				System.out.printf("%d * %d = %d\t",z,i,z*i);				//%2d : 두자리로!!
			}
			System.out.println();
		}
	}
}