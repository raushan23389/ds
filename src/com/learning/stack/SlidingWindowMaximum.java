package com.learning.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowMaximum {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    int [] nge = new int[a.length];
	   Stack<Integer> stack = new Stack<>();
	   stack.push(a.length-1);
	   nge[a.length-1] = a.length;
	   
	   for(int i =a.length-2;i>=0;i--) {
		   while(stack.size()>0 && a[i] > a[stack.peek()]) {
			   stack.pop();
		   }
		   if(stack.size()==0) {
			   nge[i] = a.length;
		   }else {
			   nge[i]  = stack.peek();
		   }
		   stack.push(i);
	   }
	   int j =0;
	   for(int i =0;i<a.length-k;i++) {
		   if(j<i) {
			   j=i;
		   }
		   while(nge[j] < i+k) {
			   j = nge[j];
		   }
		   
		   System.out.println(a[j]);
	   }
	 }
}
