package com.learning.generictree;

import java.io.*;

import java.util.*;

public class SizeOfGenericTree {
	 private static class Node {
		    int data;
		    ArrayList<Node> children = new ArrayList<>();
		    
		    Node(){
		    	
		    }
		    Node(int data){
		    	this.data = data;
		    }
		  }

		  public static void display(Node node) {
		    String str = node.data + " -> ";
		    for (Node child : node.children) {
		      str += child.data + ", ";
		    }
		    str += ".";
		    System.out.println(str);

		    for (Node child : node.children) {
		      display(child);
		    }
		  }

		  public static  Node construct(int[] arr) {
		    Node root = null;

		    Stack<Node> st = new Stack<>();
		    for (int i = 0; i < arr.length; i++) {
		      if (arr[i] == -1) { 
		        st.pop();
		      } else {
		        Node t = new Node();
		        t.data = arr[i];

		        if (st.size() > 0) {
		          st.peek().children.add(t);
		        } else {
		          root = t;
		        }

		        st.push(t);
		      }
		    }

		    return root;
		  }

		  public static int size(Node node) {
		    int s = 0;

		    for (Node child : node.children) {
		      s += size(child);
		    }
		    s += 1;

		    return s;
		  }

		  public static int max(Node node) {
			  int max = Integer.MIN_VALUE;
			  for(Node child:node.children) {
				  int cm = max(child);
				  max = Math.max(cm, max);
			  }
			  max = Math.max(node.data, max);
			  return max;
		  }
		  public static int height(Node node) {
			    int ht =-1;
			    for(Node child:node.children) {
			    	int ch = height(child);
			    	ht = Math.max(ch, ht);
			    }
			    ht = ht+1;
			    return ht;
			  }
		  public static void traversals(Node node){
			   System.out.println("Node pre" + node.data);
			   for(Node child:node.children) {
				   System.out.println("Edge pre"+ node.data + "--" + child.data);
				   traversals(child);
				   System.out.println("Edge post"+ node.data + "--" + child.data);
			   }
			   System.out.println("Node post" + node.data);
			  }


		  public static void levelOrder(Node node){
		    Queue<Node> q = new ArrayDeque<>();
		    q.add(node);
		    
		    while(q.size() > 0) {
		    	node = q.remove();
		    	System.out.println(node.data + " ");
		    	
		    	for(Node child:node.children) {
		    		q.add(child);
		    	}
		    }
		    System.out.println(".");
		  }
		  
		  public static void levelOrderLinewise(Node node){
			    Queue<Node> mq = new ArrayDeque<>();
			    mq.add(node);
			    Queue<Node> cq = new ArrayDeque<>();
			    while(mq.size() > 0) {
			    	node = mq.remove();
			    	System.out.print(node.data + " ");
			    	for(Node child :node.children) {
			    		cq.add(child);
			    	}
			    	
			    	if(mq.size() == 0) {
			    		mq = cq;
			    		cq = new ArrayDeque<>();
			    		System.out.println();
			    	}
			    }
			   
			  }
		  
		  public static void levelOrderLinewise2(Node node){
			  Queue<Node> mq = new ArrayDeque<>();
			  mq.add(node);
			  mq.add(new Node(-1));
			    while(mq.size() > 0) {
			    	node = mq.remove();
			    	if(node.data != -1) {
			    	System.out.print(node.data + " ");
			    	for(Node child :node.children) {
			    		mq.add(child);
			    	}
			    }else {
			    	if(mq.size()>0) {
			    		mq.add(new Node(-1));
			    		System.out.println();
			    	}
			    }
			    	
			    	
			    }
			   
			  }
		  
		  public static void levelOrderLinewiseZZ(Node node){
			    Stack<Node> ms = new Stack<>();
			    ms.add(node);
			    Stack<Node> cs = new Stack<>();
			    int level = 0;
			    
			    while(ms.size()>0) {
			    	node = ms.pop();
			    	System.out.print(node.data + " ");
			    	
			    	if(level%2 == 1) {
			    		for(int i =0;i<node.children.size();i++) {
			    			Node child = node.children.get(i);
			    			cs.push(child);
			    		}
			    	}else {
			    		for(int i = node.children.size()-1;i>=0;i--) {
			    			Node child = node.children.get(i);
			    			cs.push(child);
			    		}
			    	}
			    	
			    	if(ms.size() == 0) {
			    		ms =cs;
			    		cs =new Stack<>();
			    		level++;
			    		System.out.println();
			    	}
			    }
			  }
		  
		  public static void removeLeaves(Node node) {
			    for(int i = node.children.size()-1;i>=0;i--) {
			    	Node child = node.children.get(i);
			    	if(child.children.size() == 0) {
			    		node.children.remove(child);
			    	}
			    }
			    
			    for(Node child:node.children) {
			    	removeLeaves(child);
			    }
			    
			 
			  }


		  public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine());
		    int[] arr = new int[n];
		    String[] values = br.readLine().split(" ");
		    for (int i = 0; i < n; i++) {
		      arr[i] = Integer.parseInt(values[i]);
		    }

		    Node root = construct(arr);
//		    int m = height(root);
//		    System.out.println(m);
		 //  levelOrder(root);
		    //traversals(root);
		    // display(root);
		   // levelOrderLinewise(root);
		    //levelOrderLinewiseZZ(root);
		    //levelOrderLinewise2(root);
		    removeLeaves(root);
		  }

}