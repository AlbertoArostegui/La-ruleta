package org.pmoo.ruleta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	//Atributos
	private static Teclado miTeclado = null;
	//Constructora
	private Teclado() {
	}
	
	public static Teclado getTeclado() {
		if (Teclado.miTeclado==null) {
			Teclado.miTeclado = new Teclado();
		}
		return miTeclado;
	}
	
	public int leerEntero(String pMensajePrevio, int pDesde, int pHasta) {
		boolean falla;
		boolean intervaloNoCorrecto;
		int numero = -1;
		Scanner teclado = new Scanner(System.in);
		do {
			try {
				System.out.println(pMensajePrevio);
				numero = teclado.nextInt();
				falla = false;
			} catch (InputMismatchException e) {
				System.out.println("Numero no valido.");
				falla = true;
				teclado.nextLine();
			}
			intervaloNoCorrecto = false;
			if ((numero>pHasta)|| (numero<pDesde)) {
				System.out.println("El valor introducido no es valido.");
				intervaloNoCorrecto = true;
				teclado.nextLine();
			}
		} while (falla || intervaloNoCorrecto);
		teclado.close();
		return numero;
	}
	
	public double leerDouble(String pMensajePrevio, double pDesde, double pHasta) {
		boolean falla;
		boolean intervaloNoCorrecto;
		double numero = -1;
		Scanner teclado = new Scanner(System.in);
		do {
			try {
				System.out.println(pMensajePrevio);
				numero = teclado.nextDouble();
				falla = false;
			} catch (InputMismatchException e) {
				System.out.println("Numero no valido.");
				falla = true;
				teclado.nextLine();
			}
			intervaloNoCorrecto = false;
			if ((numero>pHasta)|| (numero<pDesde)) {
				System.out.println("El valor introducido no es valido.");
				intervaloNoCorrecto = true;
				teclado.nextLine();
			}
		} while (falla || intervaloNoCorrecto);
		teclado.close();
		return numero;
	}

	
	public boolean leerSiNo(String pMensajePrevio) {
		boolean falla;
		boolean stringIncorrecta;
		String SiNo="No";
		boolean si = false;
		Scanner teclado = new Scanner(System.in);
		do {
			try {
				System.out.println(pMensajePrevio);
				SiNo = teclado.nextLine();
				falla = false;
			} catch (InputMismatchException e) {
				System.out.println("Numero no valido.");
				falla = true;
				teclado.nextLine();
			}
			stringIncorrecta = false;
			/*if (SiNo!="Si"&&SiNo!="si"&&SiNo!="No"&&SiNo!="no") {
				System.out.println("El valor introducido no es valido.");
				stringIncorrecta = true;
				teclado.nextLine();
			}*/
		} while (falla || stringIncorrecta);
		teclado.close();
		if (SiNo=="Si"||SiNo=="si") {
			si=true;
		}
		return si;
	}
	
	
	public String leerString(String pMensajePrevio) {
		boolean falla;
		String str="Default";
		Scanner teclado = new Scanner(System.in);
		do {
			try {
				System.out.println(pMensajePrevio);
				str = teclado.nextLine();
				falla = false;
			} catch (InputMismatchException e) {
				System.out.println("Numero no valido.");
				falla = true;
				teclado.nextLine();
			}	
		} while (falla);
		teclado.close();
		return str;
	}
}
