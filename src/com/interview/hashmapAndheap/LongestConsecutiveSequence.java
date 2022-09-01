package com.interview.hashmapAndheap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveSequence {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] arr =new int[n];
	
	for(int i =0;i<n;i++) {
		arr[i]  = scan.nextInt();
	}
	
	Map<Integer, Boolean>  map = new HashMap<>();
	
	for(int val:arr) {
		
		map.put(val, true);
	}
	
	for(int val:arr) {
		if(map.containsKey(val-1)) {
			map.put(val, false);
		}
	}
	int msp =0;
	int ml = 0;
	for(int val:arr) {
		if(map.get(val) == true) {
			int tl = 1;
			int tsp = val;
			while(map.containsKey(tsp +1)) {
				tl++;
		}
			if(tl > ml) {
				msp = tsp;
				ml = tl;
			}
	}
}
	
	for(int i =0;i<ml;i++) {
		System.out.println(msp +i);
	}
	
}
}
