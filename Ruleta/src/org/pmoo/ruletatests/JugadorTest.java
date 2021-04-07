package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;
import org.pmoo.ruleta.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JugadorTest {
	
	Jugador j1, j2;

	@Before
	public void setUp() throws Exception {
	
		j1 = new Jugador("Alberto", 10000);
		j2 = new Jugador("David", 2000);
	
	}

	@After
	public void tearDown() throws Exception {
	
		j1 = null;
		j2 = null;
	
	}

	@Test
	public void testJugador() {

		Jugador j3;
		
		j3 = new Jugador("Alvaro", 50000);
		assertNotNull(j1);
		assertNotNull(j2);
		assertNotNull(j3);
		
	}

	@Test
	public void testGetNombre() {
	
		assertEquals(j1.getNombre(), "Alberto");
		assertEquals(j2.getNombre(), "David");
	
	}

	@Test
	public void testHacerApuesta() {
		j1.hacerApuesta();
	}

	@Test
	public void testComprarFichas() {
		/*j1.comprarFichas();
		
		j1.imprimirEstado();*/
	}

	@Test
	public void testImprimirEstado() {
		j1.imprimirEstado();
	}

	@Test
	public void testImprimirApuestas() {
		j1.imprimirApuestas();
	}

	@Test
	public void testRecogerPremio() {
	
	}

	@Test
	public void testCanjearFichas() {
		fail("Not yet implemented");
	}

}
