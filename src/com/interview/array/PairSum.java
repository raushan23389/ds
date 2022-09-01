package com.interview.array;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
	 public static int[] twoSum(int[] nums, int target) {
		 
		 Map<Integer,Integer> map = new HashMap<>();
		 int [] arr = new int[2];
		 
		 for(int i =0;i<nums.length;i++) {
			 if(map.containsKey(target - nums[i])) {
				 arr[0] = map.get(target - nums[i]);
				 arr[1] = i;
				 return arr;
			 }
			 else {
				 map.put(nums[i], i);
			 }
		 }
		 return arr;
	        
	    }
	public static void main(String[] args) {
		int[]arr = {2,7,11,15};
		twoSum(arr, 9);
		
		}
	

}
