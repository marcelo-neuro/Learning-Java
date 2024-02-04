package projetobiblioteca.modelos;

public class Livro extends  Titulo{
    public Livro(String nome, int anoLancamento, int paginas, boolean disponivel) {
        this.setNome(nome);
        this.setAnoLancamento(anoLancamento);
        this.setPaginas(paginas);
        this.setDisponivel(disponivel);
    }
}
