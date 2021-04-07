package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumeroTest {

	Apuesta a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		a1 = null;
		a2 = null;
	}

	@Test
	public void testPremio() {
		a1 = new Numero(10000, 1);
		a2 = new Numero(20000, 2);
		a3 = new Numero(10000, 3);
		a4 = new Numero(20000, 4);
		a5 = new Numero(10000, 5);
		a6 = new Numero(20000, 6);
		a7 = new Numero(10000, 7);
		a8 = new Numero(20000, 8);
		a9 = new Numero(10000, 9);
		a10 = new Numero(20000, 10);
		a11 = new Numero(10000, 11);
		a12 = new Numero(20000, 12);
		a13 = new Numero(10000, 13);
		a14 = new Numero(20000, 14);
		a15 = new Numero(10000, 15);
		a16 = new Numero(20000, 16);
		a17 = new Numero(10000, 17);
		a18 = new Numero(20000, 18);
		a19 = new Numero(10000, 19);
		a20 = new Numero(20000, 20);
		a21 = new Numero(10000, 21);
		a22 = new Numero(20000, 22);
		a23 = new Numero(10000, 23);
		a24 = new Numero(20000, 24);
		a25 = new Numero(10000, 25);
		a26 = new Numero(20000, 26);
		a27 = new Numero(10000, 27);
		a28 = new Numero(20000, 28);
		a29 = new Numero(10000, 29);
		a30 = new Numero(20000, 30);
		a31 = new Numero(10000, 31);
		a32 = new Numero(20000, 32);
		a33 = new Numero(10000, 33);
		a34 = new Numero(20000, 34);
		a35 = new Numero(10000, 35);
		a36 = new Numero(360000, 36);
		a37 = new Numero(370000, 37);
		
		
		assertEquals(a1.premio(1), 360000); 
		assertEquals(a2.premio(1), 0);		
		
		assertEquals(a1.premio(2), 0);
		assertEquals(a2.premio(2), 720000); 
	}

	@Test
	public void testNumero() {
		a1 = new Numero(100000, 1);
		a2 = new Numero(1000, 2);
		
		assertNotNull(a1);
		assertNotNull(a2);
	}

}
