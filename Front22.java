package com.bating;

public class Front22 {
	public static String front22(String str) {
		   int take = 2;
		  if (take > str.length()) {
		    take = str.length();
		  }
		  
		  String front = str.substring(0, take);
		  return front + str + front;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Front22 front22=new Front22();
		System.out.println(Front22.front22("kitten"));
		System.out.println(Front22.front22("Ha"));
		System.out.println(Front22.front22("abc"));

	}

}
