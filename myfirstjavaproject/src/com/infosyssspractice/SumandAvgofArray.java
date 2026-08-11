package com.infosyssspractice;

public class SumandAvgofArray {

	public static void main(String[] args) {
		int sum=0;
		
		int[] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length-1;i++) {
			sum+=arr[i];
		}
		int avg=sum/arr.length;
		System.out.println("sum of the array "+sum);
		System.out.println("avg of array is "+avg);
		

	}

}
