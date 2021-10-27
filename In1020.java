package com.bating;

public class In1020 {
	public static boolean in1020(int a, int b) {
		   return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
		  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		In1020 in1020=new In1020();
		System.out.println(In1020.in1020(12,99));
		System.out.println(In1020.in1020(21,12));
		System.out.println(In1020.in1020(8,99));

	}

}
