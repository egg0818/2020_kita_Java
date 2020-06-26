package com.koreait.hs.baseball;

import java.util.Scanner;

public class MyBall {

	private int[] myArr;
	private Scanner scan = new Scanner(System.in);

	public MyBall(int num) {
		myArr = new int[num];
	}

	public void setNumbers() {
		for (int i = 0; i < myArr.length; i++) {
			// int input = scan.nextInt();
			// myArr[i] = input;
			
			String val = scan.nextLine();
			
			try {									// 
				myArr[i] = Integer.parseInt(val);   //Integer.parseInt() : 문자열을 정수형으로 바꿔준다
				} catch(Exception e) {	//정수형이 아니면 0이 뜨게한다.
					i--;
					System.out.println("숫자 입력하세요");
					continue;
				}
			
			System.out.printf("숫자%d : %d \n", i + 1, myArr[i]);

			if (myArr[i] < 1 || myArr[i] > 9) {
				System.out.println("1~9값만 입력하세요.");
				i--;
				continue; // 스킵하고 계속 진행
			}

			for (int z = 0; z < i; z++) {
				if (myArr[i] == myArr[z]) {
					System.out.println("중복 된 값이 존재합니다.");
					i--;
					break; // z for문까지만 벗어남
				}

			}
		}

	}
	
	
	public int get(int idx) {
		return myArr[idx]; 
	}
	
}
