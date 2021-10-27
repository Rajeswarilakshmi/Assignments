package com.bating;

public class EndUp {
	public static String endUp(String str) {
		  if (str.length() <= 3) return str.toUpperCase();
		  int cut = str.length() - 3;
		  String front = str.substring(0, cut);
		  String back  = str.substring(cut); 
		  return front + back.toUpperCase();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EndUp endUp=new EndUp();
		System.out.println(EndUp.endUp("Hello"));
		System.out.println(EndUp.endUp("hi there"));
		System.out.println(EndUp.endUp("Hi"));

	}

}
