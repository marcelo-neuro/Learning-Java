package repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.##");
		
		int idade = 0;
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		
		
		for (int i = 1; i <= 20 ; i++) {
			System.out.print("Digite a idade: ");
			idade = sc.nextInt();
			
			if (idade <= 15) {
				cont1++;
			} else if (idade <= 30) {
				cont2++;
			} else if (idade <= 45) {
				cont3++;
			} else if (idade <= 60) {
				cont4++;
			} else {
				cont5++;
			}
			
		}
		
		System.out.println("Quantidade de pessoas na 1ª faixa: " + cont1);
		System.out.println("Quantidade de pessoas na 2ª faixa: " + cont2);
		System.out.println("Quantidade de pessoas na 3ª faixa: " + cont3);
		System.out.println("Quantidade de pessoas na 4ª faixa: " + cont4);
		System.out.println("Quantidade de pessoas na 5ª faixa: " + cont5);
		
		if (cont1 == 0) {
			System.out.println("Porcentagem de pessoas na 1ª faixa: 0%");
		} else {
			double doubleCont1 = (double) cont1;
			double porce = (doubleCont1 / 20) * 100;
			String porceFormatada = format.format(porce);
			System.out.println("Porcentagem de pessoas na 1ª faixa: " + porceFormatada + "%");
		}
	}
}
