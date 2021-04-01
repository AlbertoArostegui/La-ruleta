package org.pmoo.ruleta;

public class Ficha {
	//Atributos
	private int valor;
	private int precio;
	
	//Constructora
	public Ficha(int pValor, int pPrecio) {
		this.valor = pValor;
		this.precio = pPrecio;
	}
	//Métodos
	public void imprimir() {
		System.out.print("Ficha de ");
		System.out.print(valor);
		System.out.print(" por valor de ");
		System.out.print(precio);
		System.out.println(" céntimos");
	}
}
