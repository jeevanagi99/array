package com.X_workz.array;

public class sumofOddNumbers {

	public static void main(String[] args) {
		int numbers[]= {21,22,23,24,25,26,27,28,29,30};
		int sum=0;
		for (int i=0;i<numbers.length;i++) {
			if(numbers[i]%2!=0) {
				sum=sum+numbers[i];
			}
		}
		System.out.println(sum);

	}
}