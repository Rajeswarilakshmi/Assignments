package com.bating;

public class Near {
	public boolean nearHundred(int n) {
		  return ((Math.abs(100 - n) <= 10) ||
		          (Math.abs(200 - n) <= 10));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Near near=new Near();
		System.out.println(near.nearHundred(93));
		System.out.println(near.nearHundred(90));
		System.out.println(near.nearHundred(89));


	}

}
