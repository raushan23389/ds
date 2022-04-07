package com.learning.sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		mergeSort(intArray, 0, intArray.length);
		
		for(int i = 0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void mergeSort(int[] input,int start,int end) {
		
		if(end-start<2) {
			return;
		}
		//logical partition happened for the array
		int mid = (start + end)/2;
		//partitioning left side array-for end position alwasys pass 1 greater
		mergeSort(input, start, mid);
		//partitioning right side array
		mergeSort(input, mid, end);
		//merge left and right array method
		merge(input,start,mid,end);
		
	}

	private static void merge(int[] input, int start, int mid, int end) {
		
		//if last element in left partition is less than equal to first element in right position , nothing needs to do
		if(input[mid-1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end-start];
		//traversing through left and right array and storing smaller element in temp array
		while(i < mid && j<end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
			
		}
		
		System.arraycopy(input, i,input,start + tempIndex,mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);
	}
}
