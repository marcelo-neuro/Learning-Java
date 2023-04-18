package repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#0.00");
		
		int idade = 0, qtdId50 = 0, qtdAlt = 0;
		double altura = 0, peso = 0, somaAltura = 0, pesoMenor = 0;
		String nome;
		
		for (int i = 0; i < 2 ; i++) {
			System.out.print("Digite a idade: ");
			idade = entrada.nextInt();
			
			System.out.print("Digite o peso: ");
			peso = entrada.nextDouble();
			
			System.out.print("Digite a altura: ");
			altura = entrada.nextDouble();
			
			if (idade > 50) {
				qtdId50++;
			}
			
			if (idade > 10 && idade < 20) {
				somaAltura += altura;
				qtdAlt++;
			}
			
			if (peso < 40) {
				pesoMenor++;
			}
			
		}
		
		entrada.close();
		
		System.out.println("Quantidade de pessoas mais velhas que 50 anos: " + qtdId50);
		
		if (qtdAlt == 0) {
			System.out.println("Média das alturas: 0");
		} else {
			System.out.println("Média das alturas: " 
					+ numFormatado.format(somaAltura / qtdAlt));
		}
		
		double porce = (pesoMenor/2) *100;
		
		System.out.println("Porcentagem de pessoas com peso menor que 40: " 
		+ porce + "%");
		
		
		
	}
}
