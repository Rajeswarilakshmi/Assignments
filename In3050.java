package com.bating;

public class In3050 {
	public static boolean in3050(int a, int b) {
		  if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
		    return true;
		  }
		  if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
		    return true;
		  }
		  return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		In3050 in3050=new In3050();
		System.out.println(In3050.in3050(30,31));
		System.out.println(In3050.in3050(30,41));
		System.out.println(In3050.in3050(40,50));

	}

}
