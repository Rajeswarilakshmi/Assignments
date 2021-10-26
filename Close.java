package com.bating;

public class Close {
	public static int close10(int a, int b) {
		  int aDiff = Math.abs(a - 10);
		  int bDiff = Math.abs(b - 10);
		  
		  if (aDiff < bDiff) {
		    return a;
		  }
		  if (bDiff < aDiff) {
		    return b;
		  }
		  return 0;  
		  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Close close10=new Close();
		System.out.println(Close.close10(8,13));
		System.out.println(Close.close10(13,8));
		System.out.println(Close.close10(13,7));

	}

}
