package com.bating;

public class WarmUp {
public boolean sleepIn(boolean weekday, boolean vacation) {
	
		 if (weekday == false && vacation == false) 
			 return true;
	         else if (weekday == true && vacation == false) 
	            return false;
	        else if (weekday == true && vacation == true) 
	            return true;
	        else if (weekday == false && vacation == true) {
	            return true;
	        } else {
	            return false;
	        }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WarmUp wup = new WarmUp();
		System.out.println(wup.sleepIn(true, false) );
		System.out.println(wup.sleepIn(true, false) );
		System.out.println(wup.sleepIn(false, true) );

	}

}
