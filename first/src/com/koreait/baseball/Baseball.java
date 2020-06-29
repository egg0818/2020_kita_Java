package com.koreait.baseball;

import java.util.Arrays;

public class Baseball {

	
	public int[] rArr;


	public Baseball (int num) {  // 생성자. 생성자는 클래스 설명할때 같이 됨
		rArr = new int[num];
		setRandom();
	}
	

	private void setRandom() {
		for(int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1);
			for(int z = 0; z < i; z++) {
				if(rArr[i] ==rArr[z]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(rArr));
	}
	
	
	public int get(int idx) {
		return rArr[idx]; 
	}
	
	
	

	
}


