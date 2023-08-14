package fiap;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] numeros = new int[4][4];
		int[] somaLinha = new int[4];
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4; j++) {
				System.out.print("Digite um número [" + i + "][" + j + "]: ");
				numeros[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println();
		}
		
		int totLinha = 0;
		int totTabela = 0;
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				totLinha += numeros[i][j]; 
			}
			totTabela += totLinha;
			System.out.println("Total da " + (i + 1) + "ª linha: " + totLinha);
			totLinha = 0;
		}
		
		System.out.println("O valor total da tabela: " + totTabela);
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				somaLinha[i] += numeros[i][j];
			}
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(somaLinha[i]);
		}
		
		
	}
}
