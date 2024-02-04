package projetomusicas.calculadora;

import projetomusicas.interfaces.Classificavel;

public class FiltroRecomendacoes {

    public void analisarRecomendacao(Classificavel classificavel) {
        if(classificavel.getNota() >= 10) {
            System.out.println("Todo mundo ta amando essa!");
        } else if(classificavel.getNota() >= 7) {
            System.out.println("Essa é boa.");
        } else {
            System.out.println("Que tal deixar essa para depois?");
        }
    }

}
