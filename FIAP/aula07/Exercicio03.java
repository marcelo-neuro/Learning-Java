package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat  f = new DecimalFormat("R$ #,##0.00");
	
		String[] lojas = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
		String[] produtos = new String[] {"W", "X", "Y", "Z"};
		
		double[][] precos = new double[4][8];
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("----------- " + produtos[i] + "----------" );
			for(int j = 0 ; j < 8 ; j++) {
				
				precos[i][j] = (double) (Math.random() * 190);
				System.out.println("Preco do produto na loja " + lojas[j] + ": " + f.format(precos[i][j]));
			}
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("----------- " + produtos[i] + "----------" );
			for(int j = 0 ; j < 8 ; j++) {
				
				if(precos[i][j] < 120) {
					System.out.println("Loja: " + lojas[j] + " Preço: " + f.format(precos[i][j]));
				}
			}
		}
	}
}
