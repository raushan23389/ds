package com.interview.string;

import java.util.Scanner;

public class DifferenceOfTwoConsecutiveChar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++) {
			char current = str.charAt(i);
			char previous = str.charAt(i-1);
			
			int gap = current-previous;
			sb.append(gap);
			sb.append(current);
		}
		
		return sb.toString();
	}
}
