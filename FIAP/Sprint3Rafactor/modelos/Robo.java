package projeto.modelos;

import java.util.Scanner;

public class Robo implements Comparable<Robo>{

    private int numero;
    private double nota;
    private int vitorias;
    private int derrotas;
    private int empates;

    private static Scanner sc = new Scanner(System.in);

    public Robo() {
        this.setNumero();
        this.setNota();
        vitorias = 0;
        derrotas = 0;
        empates = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getNota() {
        return nota;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setNumero() {
        int numero;
        System.out.print("Informe o número do robô (valores válidos de 11 a 99): ");
        numero = sc.nextInt();
        while(numero < 11 || numero > 99) {
            System.out.print("Informe o número do robô corretamente (valores válidos de 11 a 99): ");
            numero = sc.nextInt();
        }
        this.numero = numero;
    }

    private void setNota() {
        double nota;
        System.out.print("Informe a nota de design do robô (valores válidos de 0 a 10): ");
        nota = sc.nextDouble();
        while(nota < 0 || nota > 10) {
            System.out.print("Informe a nota de design do robô corretamente (valores válidos de 0 a 10): ");
            nota = sc.nextDouble();
        }
        this.nota = nota;
    }

    public void vencer() {
        vitorias++;
    }

    public void perder() {
        derrotas++;
    }

    public void empatar() {
        empates++;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.getNumero() + "(V: " + this.getVitorias() + "; D: "
                + this.getDerrotas() + "; E: " + this.getEmpates() + ")";
    }

    @Override
    public int compareTo(Robo outro) {
        int ePontuacao = (this.getVitorias() * 5) + (this.getEmpates() * 3);
        int oPontuacao = (outro.getVitorias() * 5) + (outro.getEmpates() * 3);

        if(ePontuacao < oPontuacao) {
            return 1;
        } else if (ePontuacao > oPontuacao) {
            return -1;
        }
        return (this.getNota() >= outro.getNota()) ? 1 : -1;
    }
}
