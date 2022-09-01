package com.interview.binarytree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PathToNodeSum {
	public static class Node {
	    int data;
	    Node left;
	    Node right;

	    Node(int data, Node left, Node right) {
	      this.data = data;
	      this.left = left;
	      this.right = right;
	    }
	  }

	  public static class Pair {
	    Node node;
	    int state;

	    Pair(Node node, int state) {
	      this.node = node;
	      this.state = state;
	    }
	  }

	  public static Node construct(Integer[] arr) {
	    Node root = new Node(arr[0], null, null);
	    Pair rtp = new Pair(root, 1);

	    Stack<Pair> st = new Stack<>();
	    st.push(rtp);

	    int idx = 0;
	    while (st.size() > 0) {
	      Pair top = st.peek();
	      if (top.state == 1) {
	        idx++;
	        if (arr[idx] != null) {
	          top.node.left = new Node(arr[idx], null, null);
	          Pair lp = new Pair(top.node.left, 1);
	          st.push(lp);
	        } else {
	          top.node.left = null;
	        }

	        top.state++;
	      } else if (top.state == 2) {
	        idx++;
	        if (arr[idx] != null) {
	          top.node.right = new Node(arr[idx], null, null);
	          Pair rp = new Pair(top.node.right, 1);
	          st.push(rp);
	        } else {
	          top.node.right = null;
	        }

	        top.state++;
	      } else {
	        st.pop();
	      }
	    }

	    return root;
	  }

	  public static void display(Node node) {
	    if (node == null) {
	      return;
	    }

	    String str = "";
	    str += node.left == null ? "." : node.left.data + "";
	    str += " <- " + node.data + " -> ";
	    str += node.right == null ? "." : node.right.data + "";
	    System.out.println(str);

	    display(node.left);
	    display(node.right);
	  }

	  public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi)
		  {
			    if (node == null) { //1
			      return;
			    }
			    if (node.left == null && node.right == null) { //2
			      sum += node.data; //3
			      if (sum >= lo && sum <= hi) { //4
			        System.out.println(path + node.data);
			      }
			      return;
			    }
			    pathToLeafFromRoot(node.left, path + node.data + " ", sum + node.data, lo, hi); //5
			    pathToLeafFromRoot(node.right, path + node.data + " ", sum + node.data, lo, hi);

			  }
	  public static void printSingleChildNodes(Node node, Node parent){
		  if(node==null) {
			  return;
		  }
		  if(parent !=null && parent.left == node && parent.right ==null) {
			  System.out.println(node.data);
		  }
		  if(parent !=null && parent.right == node && parent.left ==null) {
			  System.out.println(node.data);
		  }
		   printSingleChildNodes(node.left, node);
		   printSingleChildNodes(node.right, node);
		  }
	  
	  public static Node removeLeaves(Node node) {
		  if(node==null) {
			  return null;
		  }
		  if(node.left == null && node.right == null) {
			  return null;
		  }
		  
		  node.left = removeLeaves(node.left);
		  node.right = removeLeaves(node.right);
		  return node;
	  }
	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    Integer[] arr = new Integer[n];
	    String[] values = br.readLine().split(" ");
	    for (int i = 0; i < n; i++) {
	      if (values[i].equals("n") == false) {
	        arr[i] = Integer.parseInt(values[i]);
	      } else {
	        arr[i] = null;
	      }
	    }

//	    int lo = Integer.parseInt(br.readLine());
//	    int hi = Integer.parseInt(br.readLine());

	    Node root = construct(arr);
//	    pathToLeafFromRoot(root, "", 0, lo, hi);
	    printSingleChildNodes(root, null);
	  }
}
