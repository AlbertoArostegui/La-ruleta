package org.pmoo.ruleta;

import java.util.*;
import org.pmoo.ruleta.*;

public class Jugador {
	//Atributos
	private ListaFichas fichas;
	private String nombre;
	private int dinero;
	private ListaApuestas apuestas;
	//Constructora
	public Jugador(String pNombre, int pDinero) {
		this.nombre = pNombre;
		this.dinero = pDinero;
		this.fichas = new ListaFichas();
	}
	//Métodos
	public void hacerApuesta() {
		this.apuestas = new ListaApuestas();  //Crear un resetear en lista apuestas para evitar esto
		this.apuestas.realizarApuestas();
	}
	
	public void comprarFichas() {
		Scanner sc = new Scanner(System.in);	//Mirar como preguntar por un double o convertirlo si no
		System.out.println("Introduzca el dinero que quiere invertir");
		int dineroAComprar = sc.nextInt();			//Preguntar cuanto dinero quiere comprar
		int valorEnFichas = dineroAComprar * 10;
		this.fichas.incrementarFichas(valorEnFichas);
	}
	
	public void imprimirEstado() {
		System.out.print(this.nombre);
		this.fichas.imprimirFichas();
	}
	
	public void imprimirApuestas() {
		System.out.print(this.nombre);
		this.apuestas.imprimirApuestas();
	}
	
	
}
