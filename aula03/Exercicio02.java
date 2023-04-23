package selecao;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double investimento = 0.0, juros = 0.0, valorCorrigido = 0.0;
		char tipo;
		
		System.out.println("Digite o valor do investimento: ");
		investimento = sc.nextDouble();
		
		System.out.println("Digite o tipo de investimento: ");
		System.out.println("P - Poupança;");
		System.out.println("F - Fundo de renda fixa;");
		System.out.println("C - CDB;");
		System.out.println("A - Ações.");
		tipo = sc.next().toUpperCase().charAt(0);
		
		while (tipo != 'P' && tipo != 'F' && tipo != 'C' && tipo != 'A') {
			System.out.print("Digite o tipo de investimento corretamente: ");
			tipo = sc.next().toUpperCase().charAt(0);
		}
		
		switch (tipo) {
		case 'P':
			juros = 0.03;
			break;
			
		case 'F':
			juros = 0.05;
			break;
			
		case 'C':
			juros = 0.06;
			break;
			
		case 'A':
			juros  = 0.1;
			break;
		}
		
		valorCorrigido = investimento + (investimento * juros);
		
		System.out.println("O valor corrigido do investimento é: R$" + valorCorrigido);
	}
}
