package com.korea.it.bj.baseball;

public class Checker {
	
	public static boolean check(int gameCnt, Baseball b, MyBall mb) {
		int s = 0;
		int ba = 0;
		
		for(int i = 0; i < gameCnt; i++) {
			for(int z = 0; z < gameCnt; z++) {
				if(b.get(i) == mb.get(z)) {
					if(i == z) {
						s++;
					} else {
						ba++;
					}
				}
			}
		}
		
		System.out.printf("S:%d B:%d O:%d \n", s, ba, gameCnt-s-ba);
		
		if(s==gameCnt) {
			return false; //why false??
		}
		
		return true;
		
		
	}

}
