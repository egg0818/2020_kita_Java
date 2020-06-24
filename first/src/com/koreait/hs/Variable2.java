package com.koreait.hs;

public class Variable2 {
	public static void main(String[] args) {
		int num = 10;
		int num2, num3 = 20;
		int num4 = 10, num5 = 20;		//초기화 방식 다양
		
		/*변수명(상수명 메소드명 포함) 주의사항 
		 * 책 25p
		1. 소문자로 시작 (가능한 카멜 케이스 기법) ex> int myMaxHeight;
		2. 특수문자는 _(언더바), $(달러)만 사용가능 - 특수문자로 시작해도 무방(위치 상관 없음)
		3. 숫자로 시작하면 안됨 ex> int 12a;
		4. 예약어 사용 안됨 	ex> int char;
		5. 띄어쓰기 안됨(언더바 붙이면 가능) 
		6. 대소문자 구분
		*/

		final int MY_MAX_HEIGHT = 10; 	//상수 (final 붙이면 됨),변수와는 다르게 변하지 않는수.다른 값 입력할 수 없음.
										//상수는 굳이 사용하지 않아도 되지만 실수 원천봉쇄하기 위해 씀.
		final int MY_MAX_HEIGHT2 = 1_000_000; //_는 없는거랑 똑같지만 자리수 구분하기 위해 쓰기도 함
		//상수 명은 무조건 대문자, 구분은 언더바로 한다.
		
	}
}
