package com.bating;

public class Parrot {
	public boolean parrotTrouble(boolean talking, int hour) {
        if (talking&(hour<7|hour>20)) {
            return true;
        } else {
            return false;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Parrot p=new Parrot();
	     System.out.println(p.parrotTrouble(true,6));
	     System.out.println(p.parrotTrouble(true,7));
         System.out.println(p.parrotTrouble(false,6));

	}

}
