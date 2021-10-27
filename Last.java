package com.bating;

public class Last {
	public static boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Last lastDigit=new Last();
		System.out.println(Last.lastDigit(7,17));
		System.out.println(Last.lastDigit(6,17));
		System.out.println(Last.lastDigit(3,13));
		

	}

}
