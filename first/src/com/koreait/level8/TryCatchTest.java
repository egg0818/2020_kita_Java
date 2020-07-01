/* 쓰는 이유 : 런타임 에러(컴파일에러x)가 발생되면 프로그램이 종료 된다. ㅇ 
 * 
 */

package com.koreait.level8;

public class TryCatchTest {

	public static void main(String[] args) {
		/*
		try {						// 예외가 발생될거같은 부분을 넣어준다. 에러가 안터지면 실행
			
		} catch(Exception e) {		// 에러(예외)가 터지면 실행. 에러를 catch!!
			
		} finally { 				// 에러가 터지든 안터지든 ★무조건★ 실행
			
		}
		*/
		
		int result = 0;
		
		try {
			result = 10/0; // 에러!!
		} catch(Exception e) {
			e.printStackTrace(); // 에러 메세지를 띄어주는 메소드!!
			System.out.println("예외가 발생했습니다.");
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("result : " + result);
		System.out.println("종료!");
		
		

	}
}
	
