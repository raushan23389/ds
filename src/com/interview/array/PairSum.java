package com.interview.array;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
	public static void main(String[] args) {
		int[] intArray = {3,4,5,6,8,9};
		int k =7;
		Map<Integer, Integer> map = new HashMap<>();
		for(int  i=0;i<intArray.length;i++) {
			map.put(intArray[i],i);
		}
		for(int i =0;i<intArray.length;i++) {
			int numTofind = k-intArray[i];
			
			if(map.containsKey(numTofind) && map.get(numTofind)!=i) {
				
			}
		}
	}

}
