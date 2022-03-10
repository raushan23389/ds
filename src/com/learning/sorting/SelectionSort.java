package com.learning.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		
		int[] intArr =  {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex = intArr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
			int largestIndex = 0;
			for(int i =1; i<=lastUnsortedIndex; i++) {
				if(intArr[i] > intArr[largestIndex]) {
					largestIndex =i;
				}
			}
			swap(intArr, largestIndex, lastUnsortedIndex);
		}
		
		for(int i = 0; i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public static void swap (int [] arr, int i, int j) {
		if(i==j) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
