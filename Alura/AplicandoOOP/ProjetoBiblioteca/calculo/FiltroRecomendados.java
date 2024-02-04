package projetobiblioteca.calculo;

import projetobiblioteca.intefaces.Classificavel;

public class FiltroRecomendados {

    private double notaMinima;

    public FiltroRecomendados(double notaMinima) {
        this.setNotaMinima(notaMinima);
    }

    public void recomendar(Classificavel classificavel) {
        if(classificavel.getMedia() >= notaMinima) {
            System.out.println("Recomendamos esse!");
        } else {
            System.out.println("Esse não é um dos prediletos.");
        }
    }

    //getter / setter
    public double getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(double notaMinima) {
        this.notaMinima = notaMinima;
    }
}
