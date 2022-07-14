package com.interview.array;

import java.util.Arrays;

public class SumOfArray {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5};
	System.out.println(Arrays.stream(a).sum());
}
}
