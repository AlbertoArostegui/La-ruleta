package org.pmoo.ruleta;

public class Juego {
	//Atributos
	private static Juego miJuego = null;
	
	//Constructora
	private Juego() {
		
	}
	//M�todos
	public static Juego getJuego() {
		if (miJuego == null) {
			miJuego = new Juego();
		}
		return miJuego;
	}
	//�lvaro la chupa
}
