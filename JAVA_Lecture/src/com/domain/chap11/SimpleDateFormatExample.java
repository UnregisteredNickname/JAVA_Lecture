package com.domain.chap11;

import java.util.*;
import java.text.*;


public class SimpleDateFormatExample { 
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("������ D��° ��");
		System.out.println( sdf.format(now));

		sdf = new SimpleDateFormat("�̴��� d��° ��");
		System.out.println( sdf.format(now));
	}
}
