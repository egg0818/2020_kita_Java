/*
 * 1. 랜덤숫자(rArr) 생성자 만들기.
 * 2. 마이숫자(MyArr) 생성자 만들기.
 * 3. MyBall에서 조건 3개만들기 - 숫자를 입력하세요
 * 4. Checker 조건 만들기
 * 
 * 

 */

package com.koreait.baseball;

public class Game {
	public static void main(String[] args) {
		
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		//int val = ball.get(0); // 0번째 인덱스 값 리턴
		//myBall.setNumbers();
		
		do {
			myBall.setNumbers();
		} while (Checker.check(gameCnt, ball, myBall));  // do(반복문)~while(조건) : 조건식이 false일 경우 계속 반복
		
		System.out.println("게임종료!");
		
		//숫자1: 3
		//숫자2: 6 ..
		
		
		
		
	}
	
	
}
