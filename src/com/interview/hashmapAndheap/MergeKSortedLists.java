package com.interview.hashmapAndheap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLists {
	public static class Pair implements Comparable<Pair>{
		int listIndex;
		public Pair(int listIndex, int dataIndex, int value) {
			super();
			this.listIndex = listIndex;
			this.dataIndex = dataIndex;
			this.value = value;
		}
		int dataIndex;
		int value;
		@Override
		public int compareTo(Pair o) {
			
			return this.value - o.value;
		}
		
	}
	public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
	      ArrayList<Integer> rv = new ArrayList<>();
	      Queue<Pair> queue  = new PriorityQueue<>();
	      
	      for(int i =0;i<lists.size();i++) {
	    	  Pair pair = new Pair(i, 0, lists.get(i).get(0));
	    	  queue.add(pair);
	      }
	      
	      while(queue.size() > 0) {
	    	  Pair pair = queue.remove();
	    	  rv.add(pair.value);
	    	  pair.dataIndex++;
	    	  
	    	  if(pair.dataIndex < lists.get(pair.listIndex).size()) {
	    		  pair.value = lists.get(pair.listIndex).get(pair.dataIndex);
	    		  queue.add(pair);
	    	  }
	      }
	      

	      return rv;
	   }

	   public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int k = Integer.parseInt(br.readLine());
	      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
	      for(int i = 0; i < k; i++){
	         ArrayList<Integer> list = new ArrayList<>();

	         int n = Integer.parseInt(br.readLine());
	         String[] elements = br.readLine().split(" ");
	         for(int j = 0; j < n; j++){
	            list.add(Integer.parseInt(elements[j]));
	         }

	         lists.add(list);
	      }

	      ArrayList<Integer> mlist = mergeKSortedLists(lists);
	      for(int val: mlist){
	         System.out.print(val + " ");
	      }
	      System.out.println();
	   }

}
