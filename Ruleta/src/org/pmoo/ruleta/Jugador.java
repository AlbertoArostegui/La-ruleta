package org.pmoo.ruleta;

public class Jugador {
	//Atributos
	private ListaFichas fichas;
	private String nombre;
	private double dinero;
	private ListaApuestas apuestas;
	//Constructora
	public Jugador(String pNombre, double pDinero) {
		this.nombre = pNombre;
		this.dinero = pDinero;
		this.fichas = new ListaFichas();
	}
	//Métodos
	public String getNombre() {
		return this.nombre;
	}
	
	public void hacerApuesta() {
		System.out.println(this.nombre);
		this.apuestas.resetear();
		int importeApuestas = this.apuestas.realizarApuestas(this.fichas.valorFichasEnPosesion());
		this.fichas.decrementarFichas(importeApuestas);
	}
	
	public void comprarFichas() {
		boolean suficiente = false;
		double dineroAComprar = 0;
		do {
		dineroAComprar = Teclado.getTeclado().leerDouble("¿Cuanto dinero quieres introducir?(Max:1000000 [1M]) ", 0, 1000000);
		if (dineroAComprar<=this.dinero) {
			suficiente = true;
		}
		} while (!suficiente);
		this.dinero = this.dinero - dineroAComprar;
		int valorEnFichas = (int) (dineroAComprar * 10);
		this.fichas.incrementarFichas(valorEnFichas);
		Banca.getBanca().venderFichas(valorEnFichas);
	}
	
	public void imprimirEstado() {
		System.out.print(this.nombre);
		this.fichas.imprimirFichas();
	}
	
	public void imprimirApuestas() {
		System.out.print(this.nombre);
		this.apuestas.imprimirApuestas();
	}
	
	public void recogerPremio(int pNumeroPremiado) {
		int premio = this.apuestas.repartirPremios(pNumeroPremiado);
		this.fichas.incrementarFichas(premio);
	}
	
	public void canjearFichas(){
		this.dinero = this.dinero + Banca.getBanca().canjearFichas(this.fichas.valorFichasEnPosesion());
		this.fichas.resetear();
		System.out.print("Despues de canjear las fichas tu dinero es el siguiente:");
		System.out.println(this.dinero);
	}
}
