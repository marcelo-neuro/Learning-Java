package fiap;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] tabelaMilha = new int[4][5];
		
		for(int i = 0 ; i < 4; i++) {
			System.out.print("Digite o código do " + (i + 1) + "º cliente: ");
			tabelaMilha[i][0] = sc.nextInt();
			
			System.out.println("Digite a quantidade de milhad do " + (i + 1) + "º cliente: ");
			tabelaMilha[i][1] = sc.nextInt();
			
			System.out.println("Digite a categoria do cliente " + (i + 1) + "º cliente: ");
			tabelaMilha[i][2] = sc.nextInt();
			while(tabelaMilha[i][2] > 3 || tabelaMilha[i][2] < 1) {
				System.out.println("Digite uma categoria válida: ");
				tabelaMilha[i][2] = sc.nextInt();
			}
			
			switch(tabelaMilha[i][2]) {
			case 1:
				tabelaMilha[i][3] = 10000;
				break;
	
			case 2:
				tabelaMilha[i][3] = 5000;
				break;
				
			case 3:
				tabelaMilha[i][3] = 0;
			}
			
			tabelaMilha[i][4] = tabelaMilha[i][1] + tabelaMilha[i][3];
		}
		
		for(int i = 0; i < 4 ; i++) {
			System.out.println("Código do cliente: " + tabelaMilha[i][0] + "\t"
					+ "Quant. Milhagem: " + tabelaMilha[i][1] + "\t"
					+ "Categoria: " + tabelaMilha[i][2] + "\t"
					+ "Bônus: " + tabelaMilha[i][3] + "\t"
					+ "Milhagem Atual: " + tabelaMilha[i][4] + "\n");
		}
		
	}
}
