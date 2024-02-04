package projetomusicas.modelos;

public abstract class Audio {

    private String titulo;
    private Duracao duracao;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;

    public void curtir() {
        this.attCurtidas();
        this.attClassificacao();
    }

    public void reproduzir() {
        this.attTotalReproducoes();
        this.attClassificacao();
    }

    //getters / setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Duracao getDuracao() {
        return duracao;
    }

    public void setDuracao(int minutos, int segundos) {
        this.duracao = new Duracao(minutos, segundos);
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    private  void attTotalReproducoes() {
        this.totalReproducoes++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    private void attCurtidas() {
        this.curtidas++;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void attClassificacao() {
        this.classificacao = (double) this.getCurtidas() / this.getTotalReproducoes();
    }
}
