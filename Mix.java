package com.bating;

public class Mix {
	public static boolean mixStart(String str) {
		  if (str.length() < 3) return false;
		  String two = str.substring(1, 3);
		  
		  if (two.equals("ix")) {
		    return true;
		  } else {
		    return false;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mix mixStart=new Mix();
		System.out.println(Mix.mixStart("mix snacks"));
		System.out.println(Mix.mixStart("pix snacks"));
		System.out.println(Mix.mixStart("piz snacks")); 


	}

}
