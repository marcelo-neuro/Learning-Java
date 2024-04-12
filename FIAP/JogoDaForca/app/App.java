package br.com.neuro.app;

import br.com.neuro.modelos.Forca;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Forca f = new Forca();

        System.out.println("Jogo da Forca");

        do {
            System.out.println("Palavra: " + f.getPalavraFechada());
            System.out.println("Erros: " + f.getErros());
            System.out.print("Chute uma letra: ");
            char letra = sc.next().toLowerCase().charAt(0);
            f.chuta(letra);
        } while (!(f.acertou() || f.enforcou()));

        String msg = f.acertou() ? "\nVocê acertou!" : "\nVocê perdeu!";
        System.out.println(msg);
        System.out.println("Palavra: " + f.getPalavraAberta());
    }
}
