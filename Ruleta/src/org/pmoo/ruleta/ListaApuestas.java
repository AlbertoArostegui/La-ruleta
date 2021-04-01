package org.pmoo.ruleta;

import java.util.Iterator;
import java.util.ArrayList;

public class ListaApuestas {
	//Atributos
	private ArrayList<Apuesta> lista;
	
	
	//Constructora
	public ListaApuestas() {
		this.lista = new ArrayList<Apuesta>();
	}
	//Métodos
	private Iterator<Apuesta> getIterador() {
		return this.lista.iterator();
	}
	
	public void realizarApuestas() {
		
	}
	
	public void imprimirApuestas() {
		Iterator<Apuesta> itr = getIterador();
		while (itr.hasNext()) {
			Apuesta unaApuesta = itr.next();
			
			unaApuesta.imprimir();
		}
	}
}
