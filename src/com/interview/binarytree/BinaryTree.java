package com.interview.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left, Node right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		public static class pair{
			Node node;
			int state;
			
			pair(Node node, int state){
				this.node = node;
				this.state = state;
			}
		}
		
		public static void display(Node node) {
			if(node == null) {
				return;
			}
			String str = "";
			str += (node.left == null) ? "." : node.left.data + "";
			str +=  " <- " + node.data + " -> ";
			str += ( node.right ==null) ? "." : node.right.data + "";
			System.out.println(str);
			display(node.left);
			display(node.right);
		}
		 public static int size(Node node) {
			   if(node == null) {
				   return 0;
			   }
			   int ls = size(node.left);
			   int rs = size(node.right);
			   int ts = ls + rs+ 1;
			   return ts;
			  }

			  public static int sum(Node node) {
			    if(node == null) {
			    	return 0;
			    }
			    int ls = sum(node.left);
			    int rs = sum(node.right);
			    int ts = ls + rs + node.data;
			    return ts;
			  }

			  public static int max(Node node) {
			    if(node == null) {
			    	return Integer.MIN_VALUE;
			    }
			    
			    int lm = max(node.left);
			    int rm = max(node.right);
			    int tm = Math.max(node.data, Math.max(lm, rm));
			    return tm;
			  }

			  public static int height(Node node) {
			    if(node == null) {
			    	return -1;//for edges and 0 for nodes
			    }
			    
			    int lh = height(node.left);
			    int rh = height(node.right);
			    int th = Math.max(lh, rh) + 1;
			    return th;
			  }
			  
			  public static void traversals(Node node) {
				  if(node == null) {
					  return;
				  }
				  
				  System.out.println(node.data + "in preOrder");
				  traversals(node.left);
				  System.out.println(node.data + "in INOrder");
				  traversals(node.right);
				  System.out.println(node.data + "in postOrder");
			  }
			  
			  public static void levelOrderraversals(Node node) {
				  Queue<Node> mq = new ArrayDeque<>();
				  mq.add(node);
				  
				  while(mq.size() >0) {
					  int count = mq.size();
					  for(int i=0;i<count;i++) {
						  node = mq.remove();
						  System.out.print(node.data + " ");
						  
						  if(node.left!=null) {
							  mq.add(node.left);
						  }
						  
						  if(node.right!=null) {
							  mq.add(node.right);
						  }
					  }
					  System.out.println();
				  }
				  
			  }

			  public static void iterativePrePostInTraversal(Node node) {
				  Stack<pair> st = new Stack<>();
				  pair pair = new pair(node, 1);
				  st.push(pair);
				  String pre = "";
				  String in = "";
				  String post = "";
				  
				  while(st.size() > 0) {
					  pair top = st.peek();
					  if(top.state == 1) {     //pre,s++,left
						  pre = pre + top.node.data + " ";
						  top.state++;
						  if(top.node.left != null) {
							  pair lp = new pair(top.node.left, 1);
							  st.push(lp);
						  }
					  }
					  else if(top.state == 2) { //in,s++,right
						  in = in + top.node.data + " ";
						  top.state++;
						  if(top.node.right != null) {
							  pair rp = new pair(top.node.right, 1);
							  st.push(rp);
						  }
					  }else { // post, pop
						  post = post + top.node.data + " ";
						  st.pop();
					  }
				  }
				  
				  System.out.println(pre);
				  System.out.println(in);
				  System.out.println(post);
				    
				  }
			  
			public static void printKLevelsDown(Node node, int k,Node blocker){
				   if(node ==null || k <0 || node==blocker) {
					   return;
				   }
				   if(k ==0) {
					   System.out.println(node.data);
				   }
				   printKLevelsDown(node.left, k-1,blocker);
				   printKLevelsDown(node.right, k-1,blocker);
			}
			
			static ArrayList<Node> path;
			public static boolean find(Node node, int data) {
				if(node == null) {
					return false;
				}
				if(node.data == data) {
					path.add(node);
					return true;
				}
				boolean filc = find(node.left, data);
				if(filc) {
					path.add(node);
					return true;
				}
				boolean firc = find(node.right,data);
				if(firc) {
					path.add(node);
					return true;
				}
				return false;
			}
			
			public static void printKNodesFar(Node node, int data, int k) {
				path = new ArrayList<>();
				find(node,data);
				for(int i =0;i<path.size();i++) {
					printKLevelsDown(path.get(i), k-i,i==0?null:path.get(i-1));
				}
				    
				  }
			
			
		public static void main(String[] args) {
			Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
			
			Node root = new Node(arr[0], null, null);
			pair rtp = new pair(root, 1);
			
			Stack<pair> st = new Stack<>();
			st.push(rtp);
			
			int i = 0;
			while(st.size()>0) {
				pair top = st.peek();
				if(top.state==1) {
					i++;
					if(arr[i] !=null) {
						top.node.left = new Node(arr[i], null, null);
						pair lp = new pair(top.node.left,1);
						st.push(lp);
					}else {
						top.node.left=null;
					}
					top.state++;
				}else if(top.state==2) {
					i++;
					if(arr[i] !=null) {
						top.node.right = new Node(arr[i], null, null);
						pair rp = new pair(top.node.right,1);
						st.push(rp);
					}else {
						top.node.right =null;
					}
					top.state++;
				}else {
					st.pop();
				}
			}
			
			//display(root);
//			System.out.println(size(root));
//			System.out.println(sum(root));
//			System.out.println(max(root));
//			System.out.println(height(root));
		//	traversals(root);
		//	levelOrderraversals(root);
		//	iterativePrePostInTraversal(root);
			//
			//printKNodesFar(root, , k);
		}
		
	}
	
}
