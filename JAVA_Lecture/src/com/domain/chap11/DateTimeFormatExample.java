package com.domain.chap11;

import java.time.*;
import java.time.format.*;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = 
			DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
