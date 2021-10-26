package com.bating;

public class Start {
	public boolean startHi(String str) {
		  if (str.length() < 2) return false;
		  
		  String firstTwo = str.substring(0, 2);
		  
		  if (firstTwo.equals("hi")) {
		    return true;
		  }
		  else {
		    return false;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start Sh=new Start();
		System.out.println(Sh.startHi("hi there") );		
		System.out.println(Sh.startHi("hi"));
		System.out.println(Sh.startHi("hello hi"));


	}

}
