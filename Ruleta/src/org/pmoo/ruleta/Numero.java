package org.pmoo.ruleta;

public class Numero extends Apuesta {
	//Atributos
	
	//Constructora
	public Numero(int pValorApuesta, int pCodigoApuesta) {
		super(pValorApuesta, 36, pCodigoApuesta);
	}
	//M�todos
	public int premio(int pNumeroPremiado) {
		int premio = 0;
		if (pNumeroPremiado == this.codigo) {
			premio = this.devolverPremio();
		}
		
		else {
			Banca.getBanca().recogerGanancias(this.valor.valorFichasEnPosesion());
		}
		return premio;
	}
}
