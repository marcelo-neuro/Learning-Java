package fiap;

import java.util.Scanner;

public class Exercicio04 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("---------- DEFININDO A TABELA DE ERROS ----------");
		int[][] chamados = setChamado();
		
		System.out.println("---------- RELATÓRIO DE ERROS ----------");
		printErros(chamados);
		
		System.out.println("---------- RELATÓRIO DE CRITÉRIOS ----------");
		int[] qtdCriterios = getCriterio(chamados);
		String[] criterios = {"Sistema parado", "Grave", "Não grave", "Duvida"};
		for(int c = 0; c < qtdCriterios.length ; c++) {
			System.out.println("Número de chamados - " + criterios[c] + ": " 
					+ qtdCriterios);
		}
	}
	
	
	public static int[][] setChamado() {
		
		int[][] chamados = new int[5][3];
		
		for(int r = 0 ; r < 5 ; r++) {
			System.out.print("Informe a identificação do funcionário: ");	
			chamados[r][0] = sc.nextInt();
			
			System.out.print("Informe o código do erro: ");
			chamados[r][1] = sc.nextInt();
			while(chamados[r][1] < 1 || chamados[r][1] > 3) {
				System.out.print("Informe o código do erro corretamente: ");
				chamados[r][1] = sc.nextInt();
			}
			
			System.out.print("Informe o critério do chamado: ");
			chamados[r][2] = sc.nextInt();
			while(chamados[r][2] < 1 || chamados[r][2] > 4) {
				System.out.print("Informe o critério do chamado corretamente: ");
				chamados[r][2] = sc.nextInt();
			}
		}
		
		return chamados;	
	}
	
	public static void printErros(int[][] chamados) {
		int[] numCodigos = {0, 0, 0};
		
		for(int e = 0 ; e < chamados.length ; e++) {
			switch (chamados[e][1]) {
			case 1:
				numCodigos[0]++;
				break;
				
			case 2:
				numCodigos[1]++;
				break;
				
			case 3:
				numCodigos[2]++;
				break;
			}
		}
		
		for(int c = 0 ; c < numCodigos.length ; c++) {
			System.out.println("Número de chamados com o código do erro " + (c + 1) + ": "
					+ numCodigos[c]);
		}
	}
	
	public static int[] getCriterio(int[][] chamados) {
		int[] qtdCriterio = new int[4];
		
		for(int c = 0 ; c < chamados.length ; c++) {
			switch (chamados[c][2]) {
			case 1:
				qtdCriterio[0]++;
				break;
				
			case 2: 
				qtdCriterio[1]++;
				break;
				
			case 3:
				qtdCriterio[2]++;
				break;
				
			case 4: 
				qtdCriterio[3]++;
				break;
			}
		}
		
		return qtdCriterio;
	}
}
