package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("R$ #,##0.00");
		
		int[][] produtos = new int[5][2];
		double precoFinal = 0;
		double[][] produtosPreco = new double[5][2];
		
		for(int i = 0; i < 5 ; i++) {
			System.out.print("Digite o código do " + (i + 1) + "º produto: ");
			produtos[i][0] = sc.nextInt();
			
			System.out.print("Digite a quantidade do " + (i + 1) + "º produto: ");
			produtos[i][1] = sc.nextInt();
			
			System.out.print("Digite o preço do " + (i + 1) + "º produto: ");
			produtosPreco[i][0] = sc.nextDouble();
			
			produtosPreco[i][1] = (double) produtos[i][1] * produtosPreco[i][0];
		}
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Código do produto: " + produtos[i][0] + "\t"
					+ "Quantidade do produto: " + produtos[i][1] + "\t"
					+ "Preço do produto: " + f.format(produtosPreco[i][0]) + "\t"
					+ "Subtotal do produto: " + f.format(produtosPreco[i][1]));
			
			precoFinal += produtosPreco[i][1];
		}
		
		System.out.println("\n Preço final: " + f.format(precoFinal));
		
	}
}
