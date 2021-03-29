package org.pmoo.ruleta;

public class Banca {
	//Atributos
	private static Banca miBanca = null;
	
	
	//Constructora
	private Banca() {
		
	}
	//Métodos
	public static Banca getMiBanca(){
		if (miBanca == null) {
			miBanca = new Banca();
		}
		return miBanca;
	}
	//Alvaro la chupa biende
	
}
