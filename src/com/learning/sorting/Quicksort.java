package com.learning.sorting;

public class Quicksort {
	public static void main(String[] args) {
		
		int [] intArray = {20,35,-15,7,55,1,-22};
		
		quikSort(intArray, 0, intArray.length);
		for(int i=0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void quikSort(int[] input, int start, int end) {
		//dealing with one lement array so nothing needs to do
		if(end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(input,start,end);
		//soting left subarray
		quikSort(input, start, pivotIndex);
		//sorting right subarray
		quikSort(input, pivotIndex+1, end);
	}

	private static int partition(int[] input, int start, int end) {
		
		//this is using the first element as a pivot
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while(i < j) {
			//note-empty loop body
			while(i < j && input[--j] >= pivot);
			if(i < j) {
				input[i] = input[j];
			}
			//empty loop
			while(i < j && input[++i] <= pivot);
			if(i < j) {
				input[j] = input[i];
			}
		}
		input[j] = pivot;
		return j;
	}

}
