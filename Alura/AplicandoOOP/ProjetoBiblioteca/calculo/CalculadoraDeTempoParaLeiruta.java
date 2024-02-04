package projetobiblioteca.calculo;

import projetobiblioteca.modelos.Titulo;
import projetobiblioteca.modelos.Usuario;

import java.util.ArrayList;

public class CalculadoraDeTempoParaLeiruta {

    private int totTempo;
    private ArrayList<Titulo> listaTitulos;
    private Usuario leitor;

    public CalculadoraDeTempoParaLeiruta(Usuario leitor, Titulo[] titulos) {
        this.setLeitor(leitor);
        this.listaTitulos = new ArrayList<Titulo>();

        for(Titulo titulo: titulos) {
            this.adcionarTitulo(titulo);
        }

    }

    public CalculadoraDeTempoParaLeiruta(Usuario leitor, Titulo titulo) {
        this.setLeitor(leitor);
        this.adcionarTitulo(titulo);
    }

    public CalculadoraDeTempoParaLeiruta(Usuario leitor) {
        this.setLeitor(leitor);
    }

    public void exibeResultado() {
        System.out.println("Tempo necessário estimado para ler a lista de títulos: " + this.getTotTempo());
    }

    public void adcionarTitulo(Titulo titulo) {
        this.getListaTitulos().add(titulo);
        this.attTotTempo();
    }

    public void removerTitulo(Titulo titulo) {
        this.getListaTitulos().remove(titulo);
        this.attTotTempo();
    }

    public void removerTitulo(String nomeTitulo) {
        for(Titulo titulo: this.getListaTitulos()) {
            if(titulo.getNome().equals(nomeTitulo)) {
                this.getListaTitulos().remove(titulo);
                attTotTempo();
                return;
            }
        }
    }

    //getters / setters
    public int getTotTempo() {
        return totTempo;
    }

    public void attTotTempo() {
        int totTempo = 0;
        for(Titulo titulo: this.getListaTitulos()) {
            totTempo += titulo.getPaginas() * this.getLeitor().getTempoParaLerUmaPagina();
        }
        this.totTempo = totTempo;
    }

    public Usuario getLeitor() {
        return leitor;
    }

    public void setLeitor(Usuario leitor) {
        this.leitor = leitor;
    }

    public ArrayList<Titulo> getListaTitulos() {
        return listaTitulos;
    }
}
