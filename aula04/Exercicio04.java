package repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int idade = 0, qtdId50 = 0, somaIdade = 0, contIdade = 0, contOlhoA = 0, contCabeloOlho;
		double peso = 0, altura = 0;
		char corCabelo, corOlho;

		Scanner sc = new Scanner(System.in);


		int i = 0;
		while (i < 5) {
			System.out.print("Digite a idade: ");
			idade = sc.nextInt();

			System.out.print("Digite a altura: ");
			altura = sc.nextDouble();

			System.out.print("Digite o peso: ");
			peso = sc.nextDouble();

			System.out.print("Digite a cor do cabelo: ");
			corCabelo = sc.next().toUpperCase().charAt(0);
			while (corCabelo != 'P' && corCabelo != 'C' && corCabelo != 'L'
					&& corCabelo != 'R') {
				System.out.print("Digite a cor do cabelo corretamente: ");
				corCabelo = sc.next().toUpperCase().charAt(0);
			}

			System.out.print("Digite a cor dos olhos: ");
			corOlho = sc.next().toUpperCase().charAt(0);
			while (corOlho != 'A' && corOlho != 'P' && corOlho != 'V'
					&& corOlho != 'C') {
				System.out.println("Digite a cor dos olhos corretamente: ");
				corOlho = sc.next().toUpperCase().charAt(0);
			}

			if (idade > 50 && peso < 60) {
				qtdId50++;
			}

			if (altura < 1.5) {
				somaIdade += idade;
				contIdade++;
			}

			if (corOlho == 'A') {
				contOlhoA++;
			}

			if (corCabelo == 'R' && corOlho != 'A') {
				contCabeloOlho++;
			}

			i++;
		}

		System.out.println("Quantidade de pessoas com mais de 50 anos e menos de 60Kg: " + qtdId50);

		if(contIdade == 0) {
			System.out.println("Média das idades das pessoas que tem menos de 1,50 de altura: 0");
		} else {
			double mediaIdade = somaidade/contIdade;
			System.out.println("Média das idades das pessoas que tem menos de 1,50 de altura: " + mediaIdade);
		}

		if (contOlhoA == 0) {
			System.out.println("Porcentagem de pessoas com os olhos azuis: 0");
		} else {
			double porce = (contOlhoA / i) * 100;
			System.out.println("Porcentagem de pessoas com os olhos azuis: " + porce + "%");
		}

		System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + contCabeloOlho);

	}

}
