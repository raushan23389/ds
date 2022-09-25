package com.interview.hashmapAndheap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class KSortedArray {

	public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n = Integer.parseInt(br.readLine());
	      int[] arr = new int[n];

	      for (int i = 0; i < n; i++) {
	         arr[i] = Integer.parseInt(br.readLine());
	      }

	      Queue<Integer> queue = new PriorityQueue<>();
	      int k = Integer.parseInt(br.readLine());
	      
	      for(int i=0;i<=k;i++) {
	    	  queue.add(arr[i]);
	      }
	      
	      for(int i = k+1;i<arr.length;i++) {
	    	  System.out.println(queue.remove());
	    	  queue.add(arr[i]);
	      }
	      
	      while(queue.size() > 0)
	      {
	    	  System.out.println(queue.remove());
	      }
	   }
}
