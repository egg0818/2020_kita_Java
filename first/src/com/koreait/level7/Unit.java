package com.koreait.level7;

public class Unit {
	public final String name;
	public final int max_hp;
	private int current_hp;
	
	
	public Unit(String name, int max_hp) { // final은 생성자로 값넣는 방법 밖에 없다!! 메소드통해서NO.
		this.name = name;				    // 기본생성자가 없다.
		this.max_hp = max_hp;				// 생성자가 하나라도 있는 순간. 기본생성자를 자동으로 생성해주지 않음 : super()
		this.current_hp = max_hp;			
	}
	
	public int getCurrent_hp() {
		return current_hp;
	}
	
	public void getDamage(int damage) {
		current_hp -= damage;
	}

	public void move(int x, int y) {
		System.out.printf("x:%d, y:%d 좌표로 이동 \n", x, y);
	}
	
	@Override
	public String toString() {
		return String.format("%s, 현재HP : %d",name, getCurrent_hp());
	}
}
