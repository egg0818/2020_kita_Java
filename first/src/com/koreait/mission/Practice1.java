package com.koreait.mission;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 1 입력: ");
		//int n1 = scan.nextInt();
		String n1 = scan.next();
		
		int num1 = Integer.parseInt(n1);								//n1 파싱
		
		System.out.print("숫자 2 입력: ");
		//int n2 = scan.nextInt();
		String n2 = scan.next();
		
		int num2 = Integer.parseInt(n2);								//n2 파싱
		
		scan.close();
		//System.out.println(n1 + " + " + n2 + " = " + (n1+n2)); 		//파싱하지 않으면  문자열1과 문자열2가 그대로 합쳐져서 나옴. (숫자의 합x).
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); 	
	}
}