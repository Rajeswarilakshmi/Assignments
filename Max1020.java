package com.bating;

public class Max1020 {
	public static int max1020(int a, int b) {
		  if (b > a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  
		  if (a >= 10 && a <= 20) return a;
		  if (b >= 10 && b <= 20) return b;
		  return 0;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max1020 max1020=new Max1020();
		System.out.println(Max1020.max1020(11,19));
		System.out.println(Max1020.max1020(19,11));
		System.out.println(Max1020.max1020(9,11));

	}

}
