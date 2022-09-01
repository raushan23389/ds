package com.interview.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KFrequentElement {

	   public static int[] topKFrequent(int[] nums, int k) {
	        int [] returnArray = new int[k];
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int i =0;i<nums.length;i++) {
	        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
	        }
	        
	        List<Integer> al = new ArrayList<>(map.keySet());
	        Collections.sort(al,(a,b)->{
	        	return map.get(b)-map.get(a);
	        });
	        
	        for(int i =0;i<k;i++) {
	        	returnArray[i] = al.get(i);
	        	System.out.println(al.get(i));
	        }
		   return returnArray;
	    }
	   public static void main(String[] args) {
		int [] arr = {3,3,3,2,2,7};
		int k = 2;
		System.out.println(topKFrequent(arr, k));
	}
}
