package org.pmoo.ruleta;

public class Paridad extends Apuesta {
	//Atributos
	
	//Constructora
	public Paridad(int pValorApuesta, int pCodigoApuesta) {
		super(pValorApuesta, 3, pCodigoApuesta);
	}
	//M�todos
	public int premio(int pNumeroPremiado) {
		int premio = 0;
		if (((pNumeroPremiado%2) != 0)&& this.codigo==1) {   //Impar
			premio = this.devolverPremio();
		}
		else if (((pNumeroPremiado%2)==0)&&this.codigo==2) { //Par
			premio = this.devolverPremio();
		}
		
		else {
			Banca.getBanca().recogerGanancias(this.valor.valorFichasEnPosesion());
		}
		return premio;
	}
}
