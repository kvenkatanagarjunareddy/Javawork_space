package com.infosyssspractice;

public class TargetSum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int target=9;
		int left=0;
		int right=arr.length-1;
		boolean status=false;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				status=true;
				System.out.println(arr[left]+"-"+arr[right]+" is "+target);
				left++;
				right--;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
			
		}
		if(!status) {
			System.out.println("no elements found");
		}

	}

}
