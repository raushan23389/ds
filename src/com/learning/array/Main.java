package com.learning.array;

public class Main {

	public static void main(String[] args) {
		
		int[] intArray = new int[7];
		
		intArray[0]=20;
		intArray[1]=25;
		intArray[2]=30;
		intArray[3]=35;
		int index= -1;
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]==35) {
				index = i;
				break;
			}
			
		}
		System.out.println(index);
	}
}
