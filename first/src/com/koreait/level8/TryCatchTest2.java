package com.koreait.level8;

public class TryCatchTest2 {

	public static void main(String[] args) {
		meth();

	}

	public static void meth() {
	int result = 2;
		
		try {
			if(result % 2 == 0) {
				return;				// 리턴 들어가면 프로그램이 끝나는데, finally는 나옴!
			}
		}	catch(Exception e) {
			e.printStackTrace(); 
			System.out.println("예외가 발생했습니다.");
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("result : " + result);
		System.out.println("종료!");
		
	}
}
