package com.learning.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapter {

	 public static class QueueToStackAdaptr {
		    Queue<Integer> mainQ;
		    Queue<Integer> helperQ;

		    public QueueToStackAdaptr() {
		      mainQ = new ArrayDeque<>();
		      helperQ = new ArrayDeque<>();
		    }

		    int size() {
		      return mainQ.size();
		    }

		    void push(int val) {
		     mainQ.add(val);
		    }

		    int pop() {
		    	if(size()==0) {
			    	 System.out.println("queue underflow");
			    	 return -1;
			     }else {
			    	 while(mainQ.size()>1) {
			    		 helperQ.add(mainQ.remove());
			    	 }
			    	 int val = mainQ.remove();
			    	 
			    	 while(helperQ.size() > 0) {
			    		 mainQ.add(helperQ.remove());
			    	 }
			    	 return val;
		    }
		    }

		    int top() {
		     if(size()==0) {
		    	 System.out.println("queue underflow");
		    	 return -1;
		     }else {
		    	 while(mainQ.size()>1) {
		    		 helperQ.add(mainQ.remove());
		    	 }
		    	 int val = mainQ.remove();
		    	 helperQ.add(val);
		    	 
		    	 while(helperQ.size() > 0) {
		    		 mainQ.add(helperQ.remove());
		    	 }
		    	 return val;
		     }
		    }
		  }

		  public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    QueueToStackAdaptr st = new QueueToStackAdaptr();

		    String str = br.readLine();
		    while (str.equals("quit") == false) {
		      if (str.startsWith("push")) {
		        int val = Integer.parseInt(str.split(" ")[1]);
		        st.push(val);
		      } else if (str.startsWith("pop")) {
		        int val = st.pop();
		        if (val != -1) {
		          System.out.println(val);
		        }
		      } else if (str.startsWith("top")) {
		        int val = st.top();
		        if (val != -1) {
		          System.out.println(val);
		        }
		      } else if (str.startsWith("size")) {
		        System.out.println(st.size());
		      }
		      str = br.readLine();
		    }
		  }

}
