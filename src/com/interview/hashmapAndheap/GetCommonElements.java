package com.interview.hashmapAndheap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetCommonElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int [] arr1 = new int[n1];
		
		for(int i =0;i<n1;i++) {
			arr1[i] = scan.nextInt();
		}
		
		int n2 = scan.nextInt();
		int [] arr2 = new int[n1];
		
		for(int i =0;i<n1;i++) {
			arr2[i] = scan.nextInt();
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int value:arr1) {
			if(map.containsKey(value)) {
				int oldVlaue = map.get(value);
				map.put(value, oldVlaue+1);
			}else {
				map.put(value, 1);
			}
		}
		
		for(int value:arr2) {
			if(map.containsKey(value)) {
				System.out.println(value);
				map.remove(value);
			}
		}
	}
}
