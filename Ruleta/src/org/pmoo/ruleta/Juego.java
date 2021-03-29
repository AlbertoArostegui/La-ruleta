package org.pmoo.ruleta;

public class Juego {
	//Atributos
	private static Juego miJuego = null;
	
	//Constructora
	private Juego() {
		
	}
	//Métodos
	public static Juego getJuego() {
		if (miJuego == null) {
			miJuego = new Juego();
		}
		return miJuego;
	}
	//Álvaro la chupa
}
