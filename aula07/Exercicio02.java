package fiap;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] m = new int[2][2];
		int[][] r = new int[2][2];
		int maior = 0;

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("Informe o número M[" + l + " , " + c + "]:");
				m[l][c] = sc.nextInt();

				if (m[l][c] > maior) {
					maior = m[l][c];
				}
			}
		}

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				r[l][c] = (m[l][c] * maior);
				System.out.println("Resultado - R[" + l + " , " + c + "]: " + r[l][c]);
			}
		}

	}
}
