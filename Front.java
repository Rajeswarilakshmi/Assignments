package com.bating;

public class Front {
	 public static String frontBack(String str) {
	        if (str.length() == 0) {
	            return "";
	        } else if (str.length() == 1) {
	            return str;
	        } 
	        else {
	            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) +
	                    str.charAt(0);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Front frontBack=new Front();
		System.out.println(Front.frontBack("code"));
		System.out.println(Front.frontBack("a"));
		System.out.println(Front.frontBack("ab"));
		

	}

}
