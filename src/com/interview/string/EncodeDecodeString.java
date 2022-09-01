package com.interview.string;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {

	public static String encode(List<String> strs ) {
		StringBuilder builder = new StringBuilder();
		for(String str:strs) {
			builder.append(str.length()).append("#").append(str);
		}
		return builder.toString();
		
	}
	
	public static  List<String> decode(String s ){
		List<String> list = new ArrayList<>();
		int i =0;
		while(i<s.length()) {
			int j =i;
			while(s.charAt(j) != '#') {
				j++;
			}
			
			int length = Integer.valueOf(s.substring(i,j));
			i = j+1+length;
			list.add(s.substring(j+1,i));
		}
		return list;
	}
	
	public static void main(String[] args) {
		//List<String> s = List.of("neet","code");
		String s = "4#neet4#code";
		System.out.println(decode(s));
	}
}
