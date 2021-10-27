package com.bating;

public class Notstring {
	 public String notString(String str) {
	        if (str.length() >=3 && str.substring(0,3).equals("not")) {
	            return str;
	        }
	        return "not " + str;
	    }

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Notstring ns=new Notstring();
	        System.out.println(ns.notString("candy"));
	        System.out.println(ns.notString("x"));
	        System.out.println(ns.notString("not bad"));
	    }

	

	}


