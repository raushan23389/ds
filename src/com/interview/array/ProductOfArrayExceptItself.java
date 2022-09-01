package com.interview.array;

public class ProductOfArrayExceptItself {
	
	 public static String intToRoman(int num) {
	        
	        int[] intArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	        
	        StringBuilder roman = new StringBuilder();
	        for(int i=0;i<intArray.length;i++){
	            while(num >= intArray[i]){
	                num = num - intArray[i];
	                roman.append(romanLetters[i]);
	            }
	        }
	        return roman.toString();
	    }
	 
	 
	 public static void main(String[] args) {
		 
		String s = intToRoman(1100);
		
		
	}

}
