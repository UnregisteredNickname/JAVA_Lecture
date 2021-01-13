package com.domain.test;

public class Notice {
	//필드
	int number; //번호
	String title; //주제
	String date; //날짜
	String views; //조회수
	
	
	public Notice() { //생성자 
	}

	
	//메소드
	void renewel() { //페이지 갱신하기
		System.out.println("페이지를 갱신합니다");
	}
	
	void write() { //글쓰기
		System.out.println("글쓰기");
	}
	
	void adjust() { //글수정하기
		System.out.println("글수정하기");
	}
	
	void delete() { //글삭제하기
		System.out.println("글삭제하기");
	}
	
	void share() { //글공유하기
		System.out.println("글공유하기");
	}
	
	void movePage() { //페이지 이동하기
		System.out.println("페이지 이동하기");
	}
	
	
	
}
