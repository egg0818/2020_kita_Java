package com.koreait.hs.level3;

public class BoardTest {
	public static void main(String[] args) {
		BoardVO bv1 = new BoardVO("제목1", "내용1",1);
		
		BoardVO bv2 = new BoardVO(); //정의된 생성자가 없으면 자동으로 만들어지지만
									//생성자가 정의되어 있을 경우에는 안생김
		
		bv2.setTitle("제목2");
		bv2.setContent("내용2");
		bv2.setWriteId(2);
		System.out.println(bv2.getTitle());
		System.out.println(bv2.getContent());
		System.out.println(bv2.getWriteId());
	}
}
