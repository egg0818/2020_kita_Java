package com.koreait.hs.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		ArrayList list2 = new ArrayList();		//Object 타입. Object: 최상위 부모클래스.
		list2.add(1);							//모든 타입을 입력받을 수 있음.
		list2.add("sdf");
		list2.add("ddfs");
		list2.add(1,30);						//1번 인덱스에 30을 넣겠다.
		
		list2.remove(list2.size() -1);			//마지막 값 삭제\
		
		ArrayList<Integer> list3 = new ArrayList();  //정수값만 받도록 제약사항 줄 수 있음. <> : 제네릭
		
		int value = list3.get(2);				// list3의 2번 인덱스 자리의 값을 얻는다.
		
	/*	for(int i=0; i<list.size(); i++) {
			int val = (int)list.get(i);
			System.out.print(val+", ");
		}
		
		System.out.println();
		
		for(Object val:list) {						//Object 타입.
			System.out.print((int)val + ", ");
		}
		
		for(int val:list3){
			System.out.print(val + ", ");			//list3은 int로 제약사항을 줬기 때문에 Object 대신 int쓴다.
		}
		*/
		
		System.out.println();
		
		System.out.println(list2);		
	}
}