package selecao;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dias = 0;
		double taxaServico = 0.0, valorFinal = 0;
		
		System.out.print("Digite o número de dias que o cliente ficou hospedado: ");
		dias = sc.nextInt();
		
		
		if (dias > 15) {
			taxaServico = 5.5;
		} else if (dias < 15) {
			taxaServico = 8;
		} else {
			taxaServico = 6;
		}
		
		valorFinal = (80 * dias) + (dias * taxaServico);
		
		System.out.println("Dias de estadia: " + dias + " Valor da conta: " + valorFinal);
		
	}
}
