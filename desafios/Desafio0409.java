package fiap;

import java.util.Scanner;

public class Desafio0409 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] tabela = new int[7][4];
		int iMelhor = 0;
		int iPior = 0;
		
		String[] produtos = new String[] {"Notebooks", "Computadores", "Tablets", "Servidores"};
		
		// carregamento
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("Linha de produtos: " + produtos[i]);
			for(int j = 0 ; j < 4 ; j++) {
				System.out.print("Vendas " + (j + 1) + "º TRI: ");
				tabela[j][i] = sc.nextInt();
			}
		}
		
		//soma produto
		System.out.println("\n---------- TOTAL DE PRODUTOS VENDIDOS POR LINHA ----------");
		for(int i = 0 ; i < 4 ; i++) {
			System.out.print(produtos[i] + ": ");
			for(int j = 0 ; j < 4 ; j++) {
				tabela[5][i] += tabela[j][i];
			}
			System.out.println(tabela[5][i]);
			
			if(tabela[5][i] > tabela[5][iMelhor]) {
				iMelhor = i;
			}
			
			if(tabela[5][i] < tabela[5][iPior]) {
				iPior = i;
			}
		}
		

		//soma trimestre
		System.out.println("\n---------- TOTAL DE PRODUTOS VENDIDOS POR TRIMESTRE ----------");
		for(int i = 0 ; i < 4 ; i++) {
			System.out.print((i + 1) + "º trimestre: ");
			for(int j = 0 ; j < 4 ; j++) {
				tabela[4][i] += tabela[i][j];
			}			
			System.out.println(tabela[4][i]);
		}
		
		//carregamento de metas
		for(int i = 0 ; i < 4 ; i++) {
			tabela[6][i] = 10;
		}
		
		System.out.println("\n---------- MELHORES E PIORES LINHAS DE PRODUTOS ----------");
		System.out.println("Melhor linha: " + produtos[iMelhor] + " - Vendas: " + tabela[5][iMelhor]);
		System.out.println("Pior linha: " + produtos[iPior] + " - Vendas: " + tabela[5][iPior]);
		
		
		System.out.println("\n---------- PRODUTOS QUE ATINGIRAM A META ----------");
		for(int i = 0 ; i < 4 ; i++) {
			if(tabela[6][i] <= tabela[4][i]) {
				System.out.println((i + 1) + "º trimestre");
			}
		}
	}
}
