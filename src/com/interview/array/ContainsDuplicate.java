package com.interview.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int [] arr = {1,2,3,1};
		System.out.println(containsDuplicate(arr));
	}
	
	 public static boolean containsDuplicate(int[] nums) {
	        
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int i =0;
	        boolean res = false;
	        while(i<nums.length) {
	        	if(!map.containsKey(nums[i])) {
	        		map.put(nums[i], 1);
	        	}
	        	else {
	        		int oldValue = map.get(nums[i]);
	        		int currentValue= oldValue+1;
	        		 map.put(nums[i],currentValue );
	        	}
	        	i++;
	        }
	        
	        for(Map.Entry data:map.entrySet()) {
	        	if((int)data.getValue()>1){
	        		res = true;
	        		break;
	        	}else {
	        		res = false;
	        	}
	        		
	        	}
			return res;
	        }
	       
	    }

