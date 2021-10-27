package com.bating;

public class Posneg {
	public boolean posNeg(int a, int b, boolean negative) {
        if(negative) {
            if(a<0 && b<0) {
                return true;
            }
        } else {
            if( (a<0 && b>0) || (a > 0 && b<0)) {
                return true;
            }
        }

        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Posneg pn=new Posneg();
        System.out.println(pn.posNeg(1,-1,false));
        System.out.println(pn.posNeg(-1,1,false));
        System.out.println(pn.posNeg(-4,-5,true));
        //System.out.println(pn.posNeg(-4,5,true));

	

	}

}
