package com.domain.test;

public class Notice {
	//�ʵ�
	int number; //��ȣ
	String title; //����
	String date; //��¥
	String views; //��ȸ��
	
	
	public Notice() { //������ 
	}

	
	//�޼ҵ�
	void renewel() { //������ �����ϱ�
		System.out.println("�������� �����մϴ�");
	}
	
	void write() { //�۾���
		System.out.println("�۾���");
	}
	
	void adjust() { //�ۼ����ϱ�
		System.out.println("�ۼ����ϱ�");
	}
	
	void delete() { //�ۻ����ϱ�
		System.out.println("�ۻ����ϱ�");
	}
	
	void share() { //�۰����ϱ�
		System.out.println("�۰����ϱ�");
	}
	
	void movePage() { //������ �̵��ϱ�
		System.out.println("������ �̵��ϱ�");
	}
	
	
	
}
