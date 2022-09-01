package com.interview.hashmapAndheap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFreqquency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				int oldValue = map.get(ch);
				map.put(ch, oldValue+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		char mfc = str.charAt(0);
	
		for(Character ch :map.keySet()) {
			if(map.get(ch) > map.get(mfc)) {
				mfc = ch;
			}
		}
		
		System.out.println(mfc);
	}
}
