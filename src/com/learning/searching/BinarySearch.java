package com.learning.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int [] intArray = {-22,-15,1,7,20,35,55};

		System.out.println(recursiveBinarySearch(intArray, -15));
		System.out.println(recursiveBinarySearch(intArray, 35));
		System.out.println(recursiveBinarySearch(intArray, 8888));
		System.out.println(recursiveBinarySearch(intArray, 1));

	}
	private static int recursiveBinarySearch(int[] intArray, int i) {
		return recursiveBinarySearch(intArray, 0, intArray.length, i);
		
	}
	public static int iterativeBinarySearch(int [] input, int value) {

		int start = 0;
		int end = input.length;

		while(start < end) {
			int midpoint = (start + end)/2;
			if(input[midpoint] == value) {
				return midpoint;
			}
			else if (input[midpoint] < value) {
				start = midpoint + 1;
			}
			else {
				end = midpoint;
			}
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int [] input, int start, int end, int value) {

		if(start >= end) {
			return -1;
		}
		
		int midpoint = (start+end)/2;
		
		if(input[midpoint] == value) {
			return midpoint;
		}
		else if (input[midpoint] < value) {
			return recursiveBinarySearch(input, midpoint + 1, end, value);
		}
		else {
			return recursiveBinarySearch(input, start, midpoint, value);
		}
			
		}
}

