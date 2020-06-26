package com.korea.it.bj.baseball;

import java.util.Scanner;

public class MyBall {

	private int[] myArr;
	
	private Scanner scan = new Scanner(System.in);

	

	public MyBall(int num) {
		myArr = new int[num];
	}

	public void setNumbers() {
		for (int i = 0; i < myArr.length; i++) {
			
			
			
			String val = scan.nextLine();
			

			try { 
				myArr[i] = Integer.parseInt(val); 
			} catch (Exception e) { 
				i--;
				System.out.println("숫자만 입력하세요");
				continue;
			}

			System.out.printf("숫자%d : %d", i - 1, myArr[i]);
		

			if (myArr[i] > 10 || myArr[i] < 0) {
				System.out.println("숫자 1~9까지 입력하세요");
				i--;
				continue;
			}
			
			for(int z = 0; z < myArr.length; z++) {
				if (myArr[i]==myArr[z]) {
					System.out.println("중복 된 숫자입니다");
					i--;
					break;
				}
			}

		}

	}
	public int get(int idx) {
		return myArr[idx];
	}

	
	}

