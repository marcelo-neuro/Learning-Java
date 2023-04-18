package repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int idade = 0;
			double peso = 0, altura = 0;
			char olho, cabelo;
			
			for(int i = 0 ; i < 4 ; i++) {
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
				
				
				
			}
	}

}
