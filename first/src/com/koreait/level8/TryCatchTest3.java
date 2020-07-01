package com.koreait.level8;

public class TryCatchTest3 {

	public static void main(String[] args) {
		meth();
		
		try {
			meth2(); // 그냥 meth2() 쓰면 에러가 뜬다! try catch문으로 받아줘야함
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("ddd");
		
		try {
			div(10,2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
	
	
	public static int div(int n1, int n2) throws Exception {
		return n1/n2;
	}
	
	public static void meth2() throws ClassNotFoundException {
		Class.forName("");	// 빨간줄이 뜬다 왜? 예외가 발생될거같으니 TRY CATCH문이나 throw문으로 해결해줘!
	}
	
	public static void meth() {
		int result = 2;
		
		
		try {
			Class.forName("");
		}	catch(ClassNotFoundException e) {
		}	catch(Exception e) { //마지막에 줘라!! 에러 껀덕지를 주지마라!! 좋은습관!!
			e.printStackTrace(); 
			System.out.println("예외가 발생했습니다.");
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("result : " + result);
		System.out.println("종료!");
	}

}
