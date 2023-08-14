package fiap;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] numeros = new int[3][3];
		
		for(int linha = 0; linha < 3 ; linha++) {
			for(int coluna = 0 ; coluna < 3 ; coluna++) {
				System.out.print("Matriz números[" + linha + "]" + "[" 
			+ coluna + "]: ");
				numeros[linha][coluna] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
