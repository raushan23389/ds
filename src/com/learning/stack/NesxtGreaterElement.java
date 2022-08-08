package com.learning.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NesxtGreaterElement {

	 public static void display(int[] a){
		    StringBuilder sb = new StringBuilder();

		    for(int val: a){
		      sb.append(val + "\n");
		    }
		    System.out.println(sb);
		  }

		public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    int n = Integer.parseInt(br.readLine());
		    int[] a = new int[n];
		    for(int i = 0; i < n; i++){
		       a[i] = Integer.parseInt(br.readLine());
		    }

		    int[] nge = solve(a);
		    display(nge);
		 }

		 public static int[] solve(int[] arr){
			 int [] nxe = new int[arr.length];
			 Stack<Integer> stack = new Stack<>();
			 stack.push(arr[arr.length-1]);
			 nxe[arr.length-1] = -1;
			 
			 for(int i = arr.length-2;i>=0;i--) {
				 
				 while(stack.size() > 0 && arr[i] > stack.peek()) {
					 stack.pop();
				 }
				 
				 if(stack.size()==0) {
					 nxe[i] = -1;
				 }else {
					 nxe[i] = stack.peek();
				 }
				 
				 stack.push(arr[i]);
			 }
		   
		   return nxe;
		 }

}
