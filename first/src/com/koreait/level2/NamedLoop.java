package com.koreait.level2;

public class NamedLoop {
	public static void main(String[] args) {
		
		Parent:												//for문에 별명붙임
		for(int i=0; i<5; i++) {
			Parent2:										//안쪽 for문에도 별명 붙일 수 있다.
			for(int z=0; z<20; z++) {
				if(z ==15) {
					break Parent;							//바깥 for문까지 박살. continue도 쓸 수 있다.
				}
				System.out.printf("%d - %d\n", i,z);
			}
		}
	}
}
