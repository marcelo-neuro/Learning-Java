package projetobiblioteca.modelos;

import projetobiblioteca.intefaces.Classificavel;

public abstract class Titulo implements Classificavel {

    private String nome;
    private int anoLancamento;
    private int paginas;
    private int totAvaliacoes;
    private double sumNota;
    private boolean disponivel;


    public void avaliar(double nota) {
        this.attTotAvaliacoes();

        this.attSumNota(nota);
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano de lançamento: " + this.getAnoLancamento());
        System.out.println("Número de páginas: " + this.getPaginas());
        System.out.println("Avaliação: " + this.getMedia());
        System.out.println("Disponível no catálogo: " + (this.isDisponivel() ? "Sim" : "Não"));
    }

    //getters / setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getTotAvaliacoes() {
        return totAvaliacoes;
    }

    private void attTotAvaliacoes() {
        this.totAvaliacoes++;
    }

    public double getSumNota() {
        return sumNota;
    }

    private void attSumNota(double sumNota) {
        this.sumNota += sumNota;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getMedia() {
        if(this.getTotAvaliacoes() == 0) {
            return 0;
        }

        return (this.getSumNota() / this.getTotAvaliacoes());
    }
}
