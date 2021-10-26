package com.bating;

public class Lone {
	public static boolean LoneTeen(int a, int b) {
		   boolean aTeen = (a >= 13 && a <= 19);
		  boolean bTeen = (b >= 13 && b <= 19);
		   return (aTeen && !bTeen) || (!aTeen && bTeen);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lone LoneTeen=new Lone();
		System.out.println(Lone.LoneTeen(13, 99));
		System.out.println(Lone.LoneTeen(21,19));
		System.out.println(Lone.LoneTeen(13,13)); 


	}

}
