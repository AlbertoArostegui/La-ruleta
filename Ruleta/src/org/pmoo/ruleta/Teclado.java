package org.pmoo.ruleta;


import java.util.Scanner;



public class Teclado {
	//Atributos 
	private static Teclado miTeclado;
	private Scanner teclado;
	
	//Constructora
	private Teclado() {
		this.teclado= new Scanner(System.in);
	}
	
	public static Teclado getTeclado() {
		if(Teclado.miTeclado==null) {
			Teclado.miTeclado = new Teclado();
		}
		return Teclado.miTeclado;
	}
	
	public int leerEntero(String pMensajePrevio, int pDesde, int pHasta) {
		System.out.print(pMensajePrevio);
		int texto=teclado.nextInt();
		teclado.nextLine();
		return texto;
	}
	
	public double leerDouble(String pMensajePrevio, double pDesde, double pHasta) {
		System.out.print(pMensajePrevio);
		double texto=teclado.nextDouble();
		teclado.nextLine();
		return texto;
	}

	
	public boolean leerSiNo(String pMensajePrevio) {
		System.out.print(pMensajePrevio);
		boolean resultado = false;
		String texto = teclado.nextLine();
		if(texto.equalsIgnoreCase("si")) {
			resultado = true;
		}
		else if (texto.equalsIgnoreCase("no")) {
			resultado = false;
		}
		return resultado;
	}
	
	
	public String leerString(String pMensajePrevio) {
		System.out.print(pMensajePrevio);
		String texto=teclado.nextLine();
		return texto;
	}
}
