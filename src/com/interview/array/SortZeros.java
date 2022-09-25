package com.interview.array;

public class SortZeros {
	
	public static void main(String[] args) {
		int[]  arr = {6,7,0,5,0,6,0};
		
		int left =0;
		int right = arr.length-1;
		
		while(left< right) {
			if(arr[right] == 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}else {
				right--;
			}
		}
		
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
