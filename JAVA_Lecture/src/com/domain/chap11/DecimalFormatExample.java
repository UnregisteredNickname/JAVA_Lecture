package com.domain.chap11;

import java.text.*;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
	
		DecimalFormat df = new DecimalFormat("0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("00000000000.00000");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("#.# %");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("\uC6D0 #,###");
		System.out.println( df.format(num));	
	}
}
