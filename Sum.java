package com.bating;

public class Sum {
	public static int sumDouble(int a, int b) {
		int sum = a + b;
		  if (a == b) {
		    sum = sum * 2;
		  }
		  
		  return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sumDouble=new Sum();
		System.out.println(Sum.sumDouble(1,2));
		System.out.println(Sum.sumDouble(3,2));
		System.out.println(Sum.sumDouble(2,2));

	}

}
