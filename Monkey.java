package com.bating;

public class Monkey {
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if (aSmile && bSmile) {
		    return true;
		  }
		  if (!aSmile && !bSmile) {
		    return true;
		  }
		  return false;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey monkeyTrouble=new Monkey();
		System.out.println(Monkey.monkeyTrouble(true,true));
		System.out.println(Monkey.monkeyTrouble(false,false));
		System.out.println(Monkey.monkeyTrouble(true,false));
		

	}

}
