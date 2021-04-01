package org.pmoo.ruletatests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pmoo.ruleta.*;

public class ruletatest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Ficha f1;
		
		f1 = new Ficha(15, 15);
		
		f1.imprimir();
		
	}

}
