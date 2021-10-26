package com.bating;

public class Back {
	public  static String backAround(String str) {
		  String last = str.substring(str.length() - 1);
		  return last + str + last;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Back backAround=new Back();
		System.out.println(Back.backAround("cat"));
		System.out.println(Back.backAround("Hello"));
		System.out.println(Back.backAround("a"));


	}

}
