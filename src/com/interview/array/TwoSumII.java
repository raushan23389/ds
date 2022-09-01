package com.interview.array;

public class TwoSumII {
	
	 public static  int[] twoSum(int[] numbers, int target) {
	        
	        
	        int i =0;
	        int j =numbers.length-1;
	        
	        while(i<j) {
	        	if(numbers[i] + numbers[j] == target) {
	        		break;
	        	}
	        	if(numbers[i] + numbers[j] > target) {
	        		j--;
	        		continue;
	        	}
	        	if(numbers[i] +numbers[j] < target) {
	        		i++;
	        		continue;
	        	}
	        }
	        return new int[] {i+1,j+1};
	    }
	 
	 public static void main(String[] args) {
		int [] arr = {2,7,11,15};
		int[] a = twoSum(arr, 9);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
