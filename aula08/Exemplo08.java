package fiap;

import java.util.Scanner;

public class Exemplo08 {
	
	static Scanner sc = new Scanner(System.in);
	static String[] linhaProdutos = new String[] {"Computador", "Notebook", "Tablet"};

	public static void main(String[] args) {
	
		String[] meses = new String[] {"Jan", "Fev", "Mar"};
		int produtos[][] = carregaMatriz(meses);
		int[] somaProdutos = somaLnProduto(produtos);
		int[] somaMeses = somaColMes(produtos);
		
		relatorio(meses, somaProdutos, somaMeses);
		
	}
	
	public static int [][] carregaMatriz(String[] meses) {
		int produtos[][] = new int[3][3];
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println("\n" + linhaProdutos[i]);
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print("Quantidade do mês de: " + meses[j] + ": ");
				produtos[i][j] = sc.nextInt();
			}
		}
		
		return produtos;
	}
	
	public static int[] somaLnProduto(int[][] produtos) {
		int somaProdutos[] = new int[3];
		for(int r = 0 ; r < 3 ; r++) {
			for(int c = 0 ; c < 3; c++) {
				somaProdutos[r] += produtos[r][c];
			}
		}
		return somaProdutos;
	}
	
	public static int[] somaColMes(int[][] produtos) {
		int[] somaMeses = new int[3];
		
		for(int r = 0 ; r < 3; r++) {
			for(int c = 0 ; c < 3; c++) {
				somaMeses[r] += produtos[c][r];
			}
		}
		
		return somaMeses;
	}
	
	public static void relatorio(String[] meses, int[] somaProdutos, int[] somaMeses) {
		System.out.println("\nSoma dos produtos no trimestre: ");
		for(int i = 0; i < 3 ; i++) {
			System.out.println(linhaProdutos[i] + ": " + somaProdutos[i]);
		}
		
		System.out.println("\nSoma dos produtos em cada mês: ");
		for(int i = 0 ; i< 3 ; i++) {
			System.out.println(meses[i] + ": " + somaMeses[i]);
		}
	}
}
