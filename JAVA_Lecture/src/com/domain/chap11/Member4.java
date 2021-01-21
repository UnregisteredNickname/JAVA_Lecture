package com.domain.chap11;

import java.util.*;

public class Member4 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member4(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member4 cloned = (Member4) super.clone();
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		//���� ������ Member4 ��ü�� ����
		return cloned;
	}
	
	public Member4 getMember() {
		Member4 cloned = null;
		try {
			cloned = (Member4) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
}