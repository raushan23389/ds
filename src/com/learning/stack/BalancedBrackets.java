package com.learning.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Stack<Character> stack = new Stack<>();
		
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
			}else if(ch == ')'){
				boolean val = handleClosing(stack,'(');
				if(val == false) {
				System.out.println(val);
				return;
				}
			}else if(ch == '}') {
				boolean val = handleClosing(stack,'{');
				if(val == false) {
					System.out.println(val);
				return;
				}
			}else if(ch == ']') {
				boolean val = handleClosing(stack,'[');
				if(val == false) {
					System.out.println(val);
				return;
				}
			}else {
			}
		}
		
		if(stack.size()==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	private static boolean handleClosing(Stack<Character> stack, char corresoch) {
		if(stack.size()==0) {
			return false;
		}else if(stack.peek()!= '(') {
			return false;
		}else {
			stack.pop();
			return true;
		}
		
	}

}
