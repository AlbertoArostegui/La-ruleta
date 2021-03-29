package org.pmoo.ruleta;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaJugadores {
	//Atributos
	private ArrayList<Jugador> Lista;
	private static ListaJugadores miLista;
	
	//Constructora
	private ListaJugadores() {
		
	}
	//Métodos
	public static ListaJugadores getListaJugadores() {
		if(ListaJugadores.miLista==null) {
			ListaJugadores.miLista = new ListaJugadores();
		}
		return miLista;
	}
	
	private Iterator<Jugador> getIterador(){
		return ListaJugadores.getListaJugadores().Lista.iterator();
	}
	
	public void hacerApuestas() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.hacerApuesta();
		}
	}
	
	public void comprarFichas() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.comprarFichas();
		}
	}
	
	public void imprimirEstados() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.imprimirEstado();
		}
	}
	
	public void imprimirApuestas() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.imprimirApuestas();
		}
	}
	
}
