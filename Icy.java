package com.bating;

public class Icy {
	public static boolean icyHot(int temp1, int temp2) {
		  if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
		    return true;
		  } else {
		    return false;
		  }
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icy icyHot=new Icy();
		System.out.println(Icy.icyHot(120, -1));
		System.out.println(Icy.icyHot(-1,120));
		System.out.println(Icy.icyHot(2,120));


	}

}
