package com.bating;

public class Every {
	public  static String everyNth(String str,int n) {
		   String result = "";
		  for (int i=0; i<str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  return result;
		  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Every everyNth=new Every();
		System.out.println(Every.everyNth("Miracle",2));
		System.out.println(Every.everyNth("abcdefg",3));
		System.out.println(Every.everyNth("abcdefg",3));

	}

}
