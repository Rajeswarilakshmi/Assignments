package com.bating;

public class Max {
	public static int intMax(int a, int b, int c) {
		  int max;
		  if (a > b) {
		    max = a;
		  } else {
		    max = b;
		  }
		  if (c > max) {
		    max = c;
		  }
		  
		  return max;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max intMax=new Max();
		System.out.println(Max.intMax(1,2,3));
		System.out.println(Max.intMax(1,3,2));
		System.out.println(Max.intMax(3,2,1));

	}

}
