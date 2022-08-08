package com.interview.string;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}
