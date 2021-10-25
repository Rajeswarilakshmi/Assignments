package com.bating;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
	private static int cigars;
	private static boolean weekendStatus;
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if ((weekendStatus = false)&&(cigars > 60))
		System.out.println("it is true");
		else
			System.out.println("it is false");
		}
	}

	
