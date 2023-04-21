
package repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int idade = 0;
			int qtdIdade50 = 0, somaIdade = 0, qtdIdade = 0, qtdAzul = 0, qtdRuivo = 0;
			double peso = 0, altura = 0;
			char olho, cabelo;
			
			for(int i = 0 ; i < 2 ; i++) {
				System.out.print("Digite a idade: ");
				idade = sc.nextInt();
				
				System.out.print("Digite o peso: ");
				peso = sc.nextDouble();
				
				System.out.print("Digite a altura: ");
				altura = sc.nextDouble();
				
				System.out.println("Digite a cor dos olhos: ");
				olho = sc.next().toUpperCase().charAt(0);
				while(olho != 'A'&& olho != 'P' && olho != 'V' && olho != 'C') {
					System.out.print("Digite a cor dos olhos corretamente: ");
					olho = sc.next().toUpperCase().charAt(0);
				}
				
				System.out.print("Digite a cor do cabelo: ");
				cabelo = sc.next().toUpperCase().charAt(0);
				while(cabelo != 'P' && cabelo != 'C' && cabelo != 'L' && cabelo != 'R') {
					System.out.print("Digite a cor do cabelo corretamente: ");
					cabelo = sc.next().toUpperCase().charAt(0);
				}
				
				
				if (idade > 50 && peso < 60) {
					qtdIdade50++;
				}
				
				if (altura < 1.5) {
					somaIdade += idade;
					qtdIdade++;
				}
				
				if (olho == 'A') {
					qtdAzul++;
				}
				
				if (cabelo == 'R' && olho != 'A') {
					qtdRuivo++;
				}
			}
			
			System.out.println("Quantidade de pessoas com mais de 50 anos com menos de 50Kg: " + qtdIdade50);
	
			if (qtdIdade == 0) {
				System.out.println("A média da idade das pessoas com menos de 1,50m de altura é: 0");
			} else {
				double media = somaIdade/qtdIdade;
				System.out.println("A média da idade das pessoas com menos de 1,50m de altura é: " + media);
			}
			
			if(qtdAzul == 0) {
				System.out.println("A porcentagem de pessoas com os olhos azuis é: 0%");
			} else {
				double porce = (qtdAzul / 2.0) * 100.0;
				System.out.println("A porcentagem de pessoas com os olhos azuis é: " + porce + "%");
			}
			
			System.out.println("A quantidade de pessoas que tem o cabelo ruivo e não tem os olhos azuis é: " + qtdRuivo);
	}

}