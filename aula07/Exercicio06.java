package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("R$ #,##0.00");
		
		String[] produtos = new String[] {"Camisa", "Blusa", "Calça", "Vestido", "Meia"};
		
		double[][] precos = new double[5][4];
		double[][] impostos = new double [5][4];
		double[] custo = new double[] {10, 25, 20, 10, 5};
		double custoFinal = 0;
		
		for(int p = 0 ; p < 5 ; p++) {
			for(int l = 0 ; l < 4 ; l++ ) {
				precos[p][l] = (Math.random() * 120);
				
				if(precos[p][l] <= 50) {
					impostos[p][l] = precos[p][l] * 0.05;
				} else if(precos[p][l] <= 100) {
					impostos[p][l] = precos[p][l] * 0.1;
				} else {
					impostos[p][l] = precos[p][l] * 0.2;
				}
			}
		}
		
		for(int p = 0 ; p < 5 ; p++) {
			System.out.println("Nome do produto: " + produtos[p] + " - custo de transporte: " 
					+ f.format(custo[p]));
			for(int l = 0 ; l < 3 ; l++) {
				custoFinal = impostos[p][l] + precos[p][l] + custo[p];
				System.out.println("Loja: " + (l + 1));
				System.out.println("Imposto: " + f.format(impostos[p][l]));
				System.out.println("Preço: " + f.format(precos[p][l]));
				System.out.println("Preço final: " + f.format(custoFinal));
			}
			
			
		}
		
		
		
	}
}
