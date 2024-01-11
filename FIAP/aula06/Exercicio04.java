package fiap;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] gabarito = new String[] {"A", "A", "A", "A","A", "A","A", "A"};
		String[] prova = new String[8];
		
		int numAluno = 0;
		int totalAprovados = 0;
		
		for(int aluno = 0 ; aluno < 2 ; aluno++) {
			double nota = 0;
			
			System.out.println("Digite o número do " + (aluno + 1) + "º aluno: ");
			numAluno = sc.nextInt();
			
			for(int q = 0 ; q < gabarito.length ; q++) {
				System.out.println("Digite a resposta da questão " + (q + 1) + ":");
				prova[q] = sc.next();
				
				if(gabarito[q].equalsIgnoreCase(prova[q])) {
					nota++;
				}
			}
			
			System.out.println("A nota do aluno nº " + numAluno + " foi: " + nota);
			
			if(nota >= 6) {
				totalAprovados++;
			}
		}
		
		System.out.println("Total de aprovados: " + totalAprovados);
		double porceAprovados = (totalAprovados / 2) * 100;
		System.out.println("Percentual de aprovados: " + porceAprovados);
		
	}
}
