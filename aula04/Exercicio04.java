package repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int idade = 0, qtdId = 0;
		double peso = 0, altura = 0;
		char corCabelo, corOlho;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < 3 ; i++) {
			System.out.print("Digite a idade: ");
			idade = sc.nextInt();
			
			System.out.print("Digite a altura: ");
			altura = sc.nextDouble();
			
			System.out.print("Digite o peso: ");
			peso = sc.nextDouble();
			
			System.out.print("Digite a cor do cabelo: ");
			corCabelo = sc.next().toUpperCase().charAt(0);
			while (corCabelo != 'P' && corCabelo != 'C' && corCabelo != 'L'
					&& corCabelo != 'R') {
				System.out.print("Digite a cor do cabelo corretamente: ");
				corCabelo = sc.next().toUpperCase().charAt(0);
			}
			
			System.out.print("Digite a cor dos olhos: ");
			corOlho = sc.next().toUpperCase().charAt(0);
			while (corOlho != 'A' && corOlho != 'P' && corOlho != 'V' 
					&& corOlho != 'C') {
				System.out.println("Digite a cor dos olhos corretamente: ");
				corOlho = sc.next().toUpperCase().charAt(0);
			}
			
			if (idade > 50) {
				qtdId++;
			}
			
		
		}

	}

}
