package com.koreait.level1;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이? ");
		int age = scan.nextInt();
		System.out.println("나이: "+ age);
		
		System.out.print("이름? ");
		String name = scan.next();
		System.out.println("이름: "+name);
		
		scan.close(); 		//stream 은 쓰고나면 종료해줘야 함. stream : 입출력할때 쓰는 애들(빨대)
	}
}
