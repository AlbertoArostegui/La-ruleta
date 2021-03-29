package org.pmoo.ruleta;

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
		double dineroAComprar = 0;			//Mirar como preguntar por un double o convertirlo sino
		//Preguntar cuanto dinero quiere comprar
		double valorEnFichas = dineroAComprar * 10;
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
