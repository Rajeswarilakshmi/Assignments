package com.bating;

public class StringE {
	public static boolean stringE(String str) {
		  int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
		  }

		  return (count >= 1 && count <= 3);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringE stringE=new StringE();
		System.out.println(StringE.stringE("Hello"));
		System.out.println(StringE.stringE("Heelle"));
		System.out.println(StringE.stringE("Heelele"));

	}

}
