package com.bating;

public class Teen {
	public static boolean hasTeen(int a, int b, int c) {
		  return (a>=13 && a<=19) ||
		         (b>=13 && b<=19) ||
		         (c>=13 && c<=19);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Teen hasTeen=new Teen();
		System.out.println(Teen.hasTeen(13, 20, 10));
		System.out.println(Teen.hasTeen(20, 19, 10));
		System.out.println(Teen.hasTeen(20, 10, 13)); 


	}

	public static char[] loneTeen(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
