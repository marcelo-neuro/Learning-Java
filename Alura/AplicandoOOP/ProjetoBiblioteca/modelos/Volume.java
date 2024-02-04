package projetobiblioteca.modelos;

import projetobiblioteca.intefaces.Classificavel;

public class Volume implements Classificavel {

    private int numero;
    private String quadrinho;

    private int totAvaliacoes;
    private double totNota;

    public void avaliar(double nota) {
        this.attTotNota(nota);
        this.attTotAvaliacoes();
    }

    //getters / setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getQuadrinho() {
        return quadrinho;
    }

    public void setQuadrinho(String quadrinho) {
        this.quadrinho = quadrinho;
    }

    public void attTotAvaliacoes() {
        this.totAvaliacoes++;
    }

    public int getTotAvaliacoes() {
        return totAvaliacoes;
    }

    public void attTotNota(double nota) {
        this.totNota += nota;
    }

    public double getTotNota() {
        return totNota;
    }

    public double getMedia() {
        return this.getTotNota() / this.getTotAvaliacoes();
    }
}
