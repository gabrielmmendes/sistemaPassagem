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
public class PassagemInteira extends Passagem {

    private static int qtdAdultos = 0;

    public PassagemInteira(Pessoa titular, Assento assento) {
        super(titular, assento);
    }

    public double defineValor() {
        return cobraTaxaKm();
       
    }

    public static int getQtdAdultos() {
        return qtdAdultos;
    }

    public static void setQtdAdultos(int qtdAdultos) {
        PassagemInteira.qtdAdultos = qtdAdultos;
    }

}
