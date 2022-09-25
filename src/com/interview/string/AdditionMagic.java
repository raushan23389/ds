package com.interview.string;

import java.util.HashMap;
import java.util.Map;

public class AdditionMagic {

public int characterReplacement(String s, int k) {
        
        Map<Character,Integer> map = new HashMap();
        int res = 0;
        int left = 0;
       
        
        for(int right =0;right<s.length();right++ ) {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0)+1 );
           
            char mfc = extracted(s, map);
            if((right - left +1) - map.get(mfc) > k) {
            	int val = map.get(s.charAt(left));
            	map.put(s.charAt(left),val-1);
            	left++;
            }
            res = Math.max(res,(right - left +1));
        }
        return res;
        
    }

private char extracted(String s, Map<Character, Integer> map) {
	char mfc = s.charAt(0);
	
	for(Character ch :map.keySet()) {
		if(map.get(ch) > map.get(mfc)) {
			mfc = ch;
		}
	}
	return mfc;
}
	 
	 public static void main(String[] args) {
		//AdditionMagic.add(1, "hello");
		
	}
}
