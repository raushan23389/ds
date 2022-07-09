package com.interview.basicMath;

import java.util.ArrayList;

public class Occurence {
	public static void main(String[] args) {
	
		String s1 = "My name is granar";
		String s2 = "a";
		System.out.println(occur(s1, s2));
}
	
	public static int occur(String input1, String input2) {
		
		if(!input1.contains(input2)) {
			return -1;
		}
		
		input1 = input1.replaceAll("\\s", "");
		char[] charArray = input1.toCharArray();
		ArrayList<Integer> inArrayList = new ArrayList<>();
		for(int i = 0; i<charArray.length;i++) {
			if(charArray[i] == input2.charAt(0)) {
				inArrayList.add(i+1);
			}
		}
		int noOfChar = inArrayList.get(inArrayList.size()-1)-inArrayList.get(0)-inArrayList.size()+2;
		return noOfChar;
		
		
	}
}
