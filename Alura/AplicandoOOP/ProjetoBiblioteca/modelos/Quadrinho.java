package projetobiblioteca.modelos;

public class Quadrinho extends Titulo{

    private int qtdVolumes;
    private int capitulosPorVolume;
    private int qtdPaginasPorcapitulo;
    private boolean ativo;

    public Quadrinho(String nome, int anoLancamento, int qtdVolumes, int capitulosPorVolume,
            int qtdPaginasPorCapitulo, boolean disponivel, boolean ativo) {
        this.setNome(nome);
        this.setAnoLancamento(anoLancamento);
        this.setQtdVolumes(qtdVolumes);
        this.setCapitulosPorVolume(capitulosPorVolume);
        this.setQtdPaginasPorCapitulo(qtdPaginasPorCapitulo);
        this.setPaginas(qtdVolumes * capitulosPorVolume * qtdPaginasPorcapitulo);
        this.setDisponivel(disponivel);
        this.setAtivo(ativo);
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano de lançamento: " + this.getAnoLancamento());
        System.out.println("Número de volumes: " + this.getQtdVolumes());
        System.out.println("Número de páginas: " + this.getPaginas());
        System.out.println("Avaliação: " + this.getMedia());
        System.out.println("Ativo: " + (this.isAtivo() ? "Sim" : "Não"));
        System.out.println("Disponível no catálogo: " + (this.isDisponivel() ? "Sim" : "Não"));
    }

    //getters / setters
    public int getQtdVolumes() {
        return qtdVolumes;
    }

    public void setQtdVolumes(int qtdVolumes) {
        this.qtdVolumes = qtdVolumes;
    }

    public int getCapitulosPorVolume() {
        return capitulosPorVolume;
    }

    public void setCapitulosPorVolume(int capitulosPorVolume) {
        this.capitulosPorVolume = capitulosPorVolume;
    }

    public int getQtdPaginasPorcapitulo() {
        return qtdPaginasPorcapitulo;
    }

    public void setQtdPaginasPorCapitulo(int qtdPaginasPorVolume) {
        this.qtdPaginasPorcapitulo = qtdPaginasPorVolume;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
