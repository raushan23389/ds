package com.interview.string;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}
	
	public static void solution(ArrayList<Integer> al){
		for(int i = al.size()-1; i >= 0;i--) {
			int value = al.get(i);
			if(isprime(value) == true) {
				al.remove(i);
			}
		}
	}

	private static boolean isprime(int value) {
		for(int div =2;div * div<=value;div++) {
			if(value%div==0) {
				return false;
			}
		}
		return true;
	}
		
	
}
