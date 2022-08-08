package com.learning.stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Stack<Character> stack =new Stack<>();
		
		for(int i =0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch == ')') {
				if(stack.peek() == '(') {
					System.out.println(true);
					return;
				}else {
					while(stack.peek()!='(') {
						stack.pop();
					}
					stack.pop();
				}
			}else {
				stack.push(ch);
			}
		}
		System.out.println(false);
	}

}
