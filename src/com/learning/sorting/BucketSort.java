package com.learning.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
	
	public static void main(String[] args) {
		
		int [] intArray = {54,46,83,66,95,92,43};
		
		BucketSort(intArray);
		
		for(int i = 0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void BucketSort(int[] intArray) {
		List<Integer>[] buckets = new List[10];
		
		for(int i = 0; i < buckets.length;i++) {
			buckets[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < intArray.length; i++) {
			buckets[hash(intArray[i])].add(intArray[i]);
		}
		
		for(List bucket : buckets) {
			Collections.sort(bucket);
		}
		
		int j = 0;
		for(int i = 0; i < buckets.length;i++) {
			for(int value : buckets[i]) {
				intArray[j++] = value;
			}
		}
		
	}
	
	private static int hash(int value) {
		return value / (int) 10;
	}

}
