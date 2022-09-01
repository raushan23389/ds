package com.interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	  public List<List<String>> groupAnagrams(String[] strs) {
	        Map<String, List<String>> map = new HashMap<>();
	        
	        for(String st:strs) {
	        	char [] chars = st.toCharArray();
	        	Arrays.sort(chars);
	        	String key = String.valueOf(chars);
	        	if(!map.containsKey(key)) {
	        		map.put(key, new ArrayList<>());
	        	}
	        		map.get(key).add(st);
	        	
	        
	        }
	    	return new ArrayList<>(map.values());
	    }
	  public static void main(String[] args) {
		GroupAnagrams ga = new GroupAnagrams();
		String[]strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(ga.groupAnagrams(strs));
	}
}
