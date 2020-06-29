package com.koreait.level3;

public class BoardVO {
	private String title;			//public, private 안붙인 디폴트는 같은 패키지 안에서만 작용.
	private String content;			//상수가 아닌 이상 private 붙이자. 값 넣고 빼는건 메소드로.
	private int writeId;
	
	/*
	 * private : 같은 클래스 안에서
	 * default : 같은 패키지
	 * protected : 같은 패키지 + 상속관계
	 */
	
	public BoardVO() {}
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}

	public int getWriteId() {
		return writeId;
	}	
}