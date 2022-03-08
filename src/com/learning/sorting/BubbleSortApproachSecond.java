package com.learning.sorting;

public class BubbleSortApproachSecond {

	public static void main(String[] args) {
		int [] arr = {20,35,-15,7,55,1,-22};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}


}
