/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema;

/**
 *
 * @author Otávio Camargo Marciano - 201900244
 */
public class PassagemMeia extends Passagem{
	
	private static int qtdCriancas = 0;

    public PassagemMeia( Pessoa titular, Assento assento) {
        super( titular, assento);
    }

   
    public double defineValor() {
		return cobraTaxaKm()/2;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public static int getQtdCriancas() {
		return qtdCriancas;
	}

	public static void setQtdCriancas(int qtdCriancas) {
		PassagemMeia.qtdCriancas = qtdCriancas;
	}

}
