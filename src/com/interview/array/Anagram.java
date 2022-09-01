package com.interview.array;

import java.util.Arrays;

public class Anagram {

	  public boolean isAnagram(String s, String t) {
		  s = s.replaceAll("\\s", "");
		  t = t.replaceAll("\\s", "");
		  
		  if(s.length()!=t.length()) {
			  return false;
		  }
		  char[] ch1 = s.toCharArray();
		  char[] ch2 = t.toCharArray();
		  Arrays.sort(ch1);
		  Arrays.sort(ch2);
		  boolean status = Arrays.equals(ch1, ch2);
		  if(status) {
			  return true;
		  }else {
		return false;
		  }
	    }
	  
	  public static void main(String[] args) {
		Anagram anagram = new Anagram();
		System.out.println(anagram.isAnagram("anagram","nagaram"));
	}
}
