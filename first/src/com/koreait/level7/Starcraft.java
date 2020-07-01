package com.koreait.level7;

public class Starcraft {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		FireBat fb = new FireBat();
		
//		m1.attack(m2);
//		m1.attack(m2);
//		m2.attack(m2); // 자기 자신을 공격해서 실행이 안 됨
//		
//		
//		System.out.println(m1);
//		System.out.println(m2);
//		//마린, 현재HP : 50
		
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);

		System.out.println(m1);
		
		m1.attack(fb);
		m1.attack(fb);
		
		System.out.println(fb);
		
		medic.heal(fb);  // heal 의 타입을 Unit으로 하는게 좋다
		medic.heal(m1);
		System.out.println(m1);
		
		System.out.println(fb instanceof Carable); // 객체 + instanceof + 클래스
		System.out.println(m1 instanceof Carable); // 형변환이 가능하면 true 아니면 false
	}

}


