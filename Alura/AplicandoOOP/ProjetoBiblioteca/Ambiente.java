package projetobiblioteca;

import projetobiblioteca.calculo.CalculadoraDeTempoParaLeiruta;
import projetobiblioteca.modelos.Livro;
import projetobiblioteca.modelos.Quadrinho;
import projetobiblioteca.modelos.Titulo;
import projetobiblioteca.modelos.Usuario;


public class Ambiente {
    public static void main(String[] args) {

        Livro l1 = new Livro("Fundação", 1980, 500, true);

//        l1.exibeFichaTecnica();

        Quadrinho q1 = new Quadrinho("Boa Noite PunPun", 2016, 7, 20, 20, true, false);

//        q1.exibeFichaTecnica();

        Usuario u1 = new Usuario("Felipe", "123321", 6);
        u1.adcionarAosFavoritos(l1);
        u1.adcionarAosFavoritos(q1);

//        u1.removerDosFavoritos("Fundação");
//        u1.removerDosFavoritos(q1);
//        u1.exibeUsuario();

        CalculadoraDeTempoParaLeiruta cal1 = new CalculadoraDeTempoParaLeiruta(u1, new Titulo[] {l1});
        cal1.adcionarTitulo(q1);
        cal1.removerTitulo("Fundação");
        cal1.exibeResultado();
    }
}
