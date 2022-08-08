package com.interview.string;

import java.util.Scanner;

public class PalindromicSubString {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	solution(str);
			
	}

	private static void solution(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String sub = str.substring(i,j);
				if(palindromic(sub) == true) {
					System.out.println(sub);
				}
			}
		}
		
	}

	private static boolean palindromic(String sub) {
		int i=0;
		int j=sub.length()-1;
		
		while(i<=j) {
			char ch1 = sub.charAt(i);
			char ch2 = sub.charAt(j);
			
			if(ch1!=ch2) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
