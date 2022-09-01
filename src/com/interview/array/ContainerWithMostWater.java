package com.interview.array;

public class ContainerWithMostWater {

public static int maxArea(int[] height) {
        
	int res =0;
//	brutforce
//	for(int i =0;i<height.length;i++) {
//		for(int j = i+1;j<height.length;j++) {
//			int area = (j-i) * Math.min(height[i], height[j]);
//			res = Math.max(res, area);
//		}
//	}
	int left =0;
	int right = height.length-1;
	while(left<right) {
		int area = (right-left) * Math.min(height[left], height[right]);
		res= Math.max(area, res);
		
		if(height[left] < height[right]) {
			left++;
		}else {
			right--;
		}
		
		
	}
	
	return res;
    }

public static void main(String[] args) {
	int[] arr = {1,8,6,2,5,4,8,3,7};
	System.out.println(maxArea(arr));
}
}
