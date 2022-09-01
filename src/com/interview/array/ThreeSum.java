package com.interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> solution = new ArrayList<>();
        for(int i=0;i<nums.length -2;i++) {
        	if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
        		int target = 0 - nums[i];
        		int left = i+1;
        		int right = nums.length-1;
        		while(left<right) {
        			if(nums[left] + nums[right] == target) {
        				ArrayList<Integer> minisolution = new ArrayList<>();
        				minisolution.add(nums[i]);
        				minisolution.add(nums[left]);
        				minisolution.add(nums[right]);
        				solution.add(minisolution);
        				
        				while(left<right && nums[left] == nums[left+1]) {
        					left++;
        				}
        				while(left<right && nums[right] == nums[right-1]) {
        					right--;
        				}
        				left++; 
        				right--;
        						
        			}
        			else if(nums[left] +nums[right] > target) {
        				right--;
        			}else {
        				left++;
        			}
        		}
        	}
        }
        return solution;
    }
	
	
	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		threeSum(arr);
	}

}
