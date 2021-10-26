package com.bating;

public class Startoz {
	public static String startOz(String str) {
		   String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Startoz startOz=new Startoz();
		System.out.println(Startoz.startOz("ozymandias"));
		System.out.println(Startoz.startOz("bzoo"));
		System.out.println(Startoz.startOz("oxx"));


	}

}
