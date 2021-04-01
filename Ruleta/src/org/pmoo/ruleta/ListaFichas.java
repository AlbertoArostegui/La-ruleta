package org.pmoo.ruleta;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaFichas {
	//Atributos
	private ArrayList<Ficha> lista;
	
	//Constructora
	public ListaFichas() {
		lista = new ArrayList<Ficha>();
		
	}
	//Métodos
	private Iterator<Ficha> getIterador() {
		return lista.iterator();
	}
	public void incrementarFichas(int pNum) {
		
	}
	public void decrementarFichas(int pNum) {
		
	}
	public int valorFichasApostadas( ) {
		
	}
	public void imprimirFichas() {
		Iterator<Ficha> itr = getIterador();
		Ficha unaFicha;
		
		while (itr.hasNext()) {
			unaFicha = itr.next();
			
			unaFicha.imprimir
		}
	}
}
