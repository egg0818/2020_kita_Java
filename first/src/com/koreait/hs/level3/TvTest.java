package com.koreait.hs.level3;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv();				//new: 객체 생성 키워드
										//new로 객체를 생성해서 Tv타입의 tv1 변수에 저장해줌. (저장을 안해주면 의미 없음. 그냥 사라져버림)
										// () : 기본 생성자를 호출한 것. 메소드의 한 종류. 객체를 생성할 떄 딱 한번만 씀.
										//전역변수일때는 Tv tv1; 쓰면 자동으로 null 들어가는데 지역변수일때는 저렇게 적어주면 좋지 않다. Tv tv1 = null; 이라도 적어주는 것이 좋다.
		
		
		System.out.println(tv1.name);			//레퍼런스 변수는 디폴트 null
		System.out.println(tv1.power);			//boolean 디폴트 false
		System.out.println(tv1.channel);		//숫자형 디폴트 0
		
		System.out.println("------------------");
		tv1.name = "삼성Tv";
		System.out.println(tv1.name);
		tv1.changePower();
		System.out.println(tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel: " + tv1.channel);
		
	}
}
