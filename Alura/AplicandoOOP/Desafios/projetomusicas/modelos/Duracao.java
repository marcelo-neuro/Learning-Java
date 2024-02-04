package projetomusicas.modelos;

public class Duracao {
    private final int minutos;
    private final int segundos;

    public Duracao(int minutos, int segundos) {
        if(minutos < 0 || segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Valores inválidos para a duração");
        }
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public String toString() {
        return (this.getMinutos() + " : " + this.getSegundos());
    }
}
