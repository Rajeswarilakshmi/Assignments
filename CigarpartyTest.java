package com.bating;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CigarpartyTest extends AppTest {

	
		 @Test
		  public void testCigarParty1() {
		    Cigarparty cpc = new  Cigarparty ();
		    assertFalse(cpc.CigarParty(30, false));
		  }

		@Test
		  public void testCigarParty2() {
			Cigarparty cpc = new  Cigarparty ();
		    assertFalse(cpc.CigarParty(50, false));
		  }

		  @Test
		  public void testCigarParty3() {
			  Cigarparty cpc = new  Cigarparty ();
		    assertFalse(cpc.CigarParty(70, true));
		  }
		  public static void main(String[] args) {
				// TODO Auto-generated method stub
			  System.out.println("is it true");

			}


	}
