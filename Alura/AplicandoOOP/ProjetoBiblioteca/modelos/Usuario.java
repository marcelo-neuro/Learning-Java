package projetobiblioteca.modelos;

import java.util.LinkedList;

public class Usuario {

    private String nome;
    private String id;
    private int tempoParaLerUmaPagina;
    private LinkedList<Titulo> titulosFavoritos;

    public Usuario(String nome, String id, int tempoParaLerUmaPagina) {
        this.setNome(nome);
        this.setId(id);
        this.setTempoParaLerUmaPagina(tempoParaLerUmaPagina);
        this.titulosFavoritos = new LinkedList<Titulo>();
    }

    public void adcionarAosFavoritos(Titulo titulo) {
        titulosFavoritos.add(titulo);
    }

    public void removerDosFavoritos(Titulo titulo) {
        titulosFavoritos.remove(titulo);
    }

    public void removerDosFavoritos(String nomeTitulo) {
        for (Titulo titulo: this.getTitulosFavoritos()) {
            if(titulo.getNome().equals(nomeTitulo)) {
                this.getTitulosFavoritos().remove(titulo);
                return;
            }
        }
    }

    public void exibeUsuario() {
        System.out.println("Nome do usuário: " + this.getNome());
        System.out.println("Id: " + this.getId());
        System.out.println("Titulos favoritos: ");

        if(this.getTitulosFavoritos().isEmpty()) {
            System.out.println("\tEsse usuário não possuí nenhum título favoritado.");
        } else {
            for(Titulo titulo: this.getTitulosFavoritos()) {
                System.out.println("\t " + titulo.getNome() + " - " + titulo.getAnoLancamento() + "\t("
                + titulo.getClass().getSimpleName() + ")");
            }
        }

    }

    //getters / setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTempoParaLerUmaPagina() {
        return tempoParaLerUmaPagina;
    }

    public void setTempoParaLerUmaPagina(int tempoParaLerUmaPagina) {
        this.tempoParaLerUmaPagina = tempoParaLerUmaPagina;
    }

    public LinkedList<Titulo> getTitulosFavoritos() {
        return titulosFavoritos;
    }
}
