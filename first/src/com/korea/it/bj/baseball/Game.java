package com.korea.it.bj.baseball;

import com.koreait.hs.baseball.Checker;

public class Game {

	public static void main(String[] args) {
			
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		do {myBall.setNumbers();
		} while (Checker.check(gameCnt, ball, myBall));  // do(반복문)~while(조건) : 조건식이 false일 경우 계속 반복
		
		// System.out.println("게임종료!");
		
	}

}
