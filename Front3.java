package com.bating;

public class Front3 {
	public static String front3(String str) {
		   String front;
		  
		  if (str.length() >= 3) {
		    front = str.substring(0, 3);
		  }
		  else {
		    front = str;
		  }

		  return front + front + front;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Front3 front3=new Front3();
		System.out.println(Front3.front3("Java"));
		System.out.println(Front3.front3("Chocolate"));
		System.out.println(Front3.front3("abc"));

	}

}
