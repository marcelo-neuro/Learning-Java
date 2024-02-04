package projetomusicas.modelos;

import projetomusicas.interfaces.Classificavel;

public class Podcast extends Audio implements Classificavel {

    private String host;
    private String[] participantes;
    private String descricao;

    public Podcast(String titulo, int minutos, int segundos, String host, String[] participantes, String descricao) {
        this.setTitulo(titulo);
        this.setDuracao(minutos, segundos);
        this.setHost(host);
        this.setParticipantes(participantes);
        this.setDescricao(descricao);
    }

    //getters / setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String[] participantes) {
        this.participantes = participantes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return (this.getClassificacao());
    }
}
