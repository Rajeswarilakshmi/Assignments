package com.bating;

public class Char {
	public static String missingChar(String str, int n) {
		  String front = str.substring(0, n);
	      String back = str.substring(n+1, str.length());
	      return front + back;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Char missingchar=new Char();
		System.out.println(Char.missingChar("kitten", 1));
		System.out.println(Char.missingChar("kitten", 0));
		System.out.println(Char.missingChar("kitten", 4));

	}

}
