package com.domain.test;

public class Board extends Notice {

	
	public static void main(String[] args) {
		
		Notice notice = new Notice();
		String category; //ī�װ�
		String author; //�۾���
		
		
		
		notice.renewel(); //�����ϱ�
		notice.write(); //�۾���
		notice.adjust(); //�ۼ����ϱ�
		notice.delete(); //�ۻ����ϱ�
		notice.share(); //�۰����ϱ�
		notice.movePage(); //�������̵��ϱ�
		
		
	}
}
