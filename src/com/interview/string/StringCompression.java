package com.interview.string;

import java.util.Scanner;

public class StringCompression {

	public static String compression1(String str){
		String s = str.charAt(0) + "";
		for(int i=1;i<str.length();i++) {
			char currentElement = str.charAt(i);
			char previousElement = str.charAt(i-1);
			
			if(currentElement != previousElement) {
				s = s + currentElement;
			}
					
		}

		return s;
	}

	public static String compression2(String str){
		String s = str.charAt(0) + "";
		int count = 1;
		
		for(int i=1;i<str.length();i++) {
			char currentElement = str.charAt(i);
			char previousElement = str.charAt(i-1);
			
			if(currentElement==previousElement) {
				count++;
			}
			else {
				if(count > 1) {
					s = s + count;
					count =1;
				}
				s = s+currentElement;
			}
		}
		
		if(count > 1) {
			s = s+count;
			count =1;
		}

		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}
