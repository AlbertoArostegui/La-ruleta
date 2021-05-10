package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;


import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuegoTest {
	
	Juego j1;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		j1 = null;
	}

	@Test
	public void testGetJuego() {
		j1 = Juego.getJuego();
	}

	@Test
	public void testJugar() {
		
		j1 = Juego.getJuego();
		j1.Jugar();
	}

}
