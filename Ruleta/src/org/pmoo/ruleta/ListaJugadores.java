package org.pmoo.ruleta;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaJugadores {
	//Atributos
	private ArrayList<Jugador> lista;
	private static ListaJugadores miLista;
	
	//Constructora
	private ListaJugadores() {
		this.lista = new ArrayList<Jugador>();
	}
	//Métodos
	public static ListaJugadores getListaJugadores() {
		if(ListaJugadores.miLista==null) {
			ListaJugadores.miLista = new ListaJugadores();
		}
		return miLista;
	}
	
	private Iterator<Jugador> getIterador(){
		return ListaJugadores.getListaJugadores().lista.iterator();
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
	
	public void repartirPremios(int pNumeroPremiado) {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.recogerPremio(pNumeroPremiado);
		}
	}
	
	public void preguntarSiContinuarJugandoMas() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		boolean jugar;
		while(itr.hasNext()) {
			actual = itr.next();
			System.out.println(actual.getNombre());
			jugar = Teclado.getTeclado().leerSiNo("Quieres seguir jugando 5 rondas mas?");
			if (!jugar) {
				actual.canjearFichas();
				this.lista.remove(actual);
			}
		}
	}
	
	public void anadirJugador(Jugador pNuevoJugador) {
		this.lista.add(pNuevoJugador);
	}
	
	public boolean quedaAlgunJugador() {
		boolean queda = false;
		if (this.lista.size()>0) {
			queda = true;
		}
		return queda;
	}
	
}
