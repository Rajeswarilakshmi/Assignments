package com.bating;

public class Warmup2 {
	public int diff21(int n){
	if (n<= 21){
	    return 21 - n;
	  } 
	else {
	    return (n - 21) * 2;
	  }
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Warmup2 Diff=new Warmup2();
        System.out.println(Diff.diff21(19));
        System.out.println(Diff.diff21(10));
        System.out.println(Diff.diff21(21));

	}

}
