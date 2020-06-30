package com.koreait.level7;

public class Marine extends Unit implements AttackUnit { //impements 인터페이스를 상속
														//인퍼페이스에서 상속 받으려면 extends
	private int damage;
	
	public Marine() {  
		super("마린", 50); //부모가 가진 생성자를 호출해야하기때문에 기본생성자를 만듬. (기본생성자가 없으니까)
		damage = 5;		//고정이니까 하드코딩 해줌 (문제안됨)
	}
	
	@Override
	public void attack(Unit u) {
		if(u == this){return;}
		System.out.println("따다다다~");
		u.getDamage(damage);
	}
	
	
}
