package com.domain.test;

public class Board extends Notice {

	
	public static void main(String[] args) {
		
		Notice notice = new Notice();
		String category; //카테고리
		String author; //글쓴이
		
		
		
		notice.renewel(); //갱신하기
		notice.write(); //글쓰기
		notice.adjust(); //글수정하기
		notice.delete(); //글삭제하기
		notice.share(); //글공유하기
		notice.movePage(); //페이지이동하기
		
		
	}
}
