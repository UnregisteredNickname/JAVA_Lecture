package com.domain.chap11;

import java.util.*;

public class Key1Example {
	public static void main(String[] args) {
		//Key1 ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key1, String> hashMap = new HashMap<Key1, String>();
		
		//�ĺ�Ű "new Key1(1)"�� "ȫ�浿"�� ������
		hashMap.put(new Key1(1), "ȫ�浿");
		
		//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� �о��
		String value = hashMap.get(new Key1(1));
		System.out.println(value);
	}	
}