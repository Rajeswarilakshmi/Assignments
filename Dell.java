package com.bating;

public class Dell {
	public static String delDel(String str) {
		  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
		    return str.substring(0, 1) + str.substring(4);
		  }
		  return str;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dell del=new Dell ();
		System.out.println(Dell.delDel("adelbc"));
		System.out.println(Dell.delDel("adelHello"));
		System.out.println(Dell.delDel("adedbc"));
	}
}
