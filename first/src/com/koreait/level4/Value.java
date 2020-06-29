package com.koreait.level4;

public class Value {
	
	private int val;
	
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
	@Override
	public boolean equals(Object obj) { //오브젝트에 구현된 내용이 주소값 비교이다. 오버라이딩해서 값비교로 바꾸려면?
		
		Value input = (Value) obj; // 형변환을 해줘야한다. getVal() 메소드를 사용하기위해
		
		if (this.getVal() == input.getVal()) { // this는 여기 있는 클래스를 가르킴.
			return true;
		} else {
			return false;
		}
		
	}
	
}
