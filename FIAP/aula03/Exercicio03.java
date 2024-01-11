package selecao;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.print("Digite a idade do atleta: ");
		idade = sc.nextInt();
		
		String msg = "";
		
		if (idade < 3) {
			System.out.println("Idade não permitida.");
		} else if (idade <= 4) {
			msg = " Categoria: Mirim";
		} else if (idade <= 7) {
			msg = " Categoria: Infantil A";
		} else if (idade <= 10) {
			msg = " Categoria: Infantil B";
		} else if (idade <= 13) {
			msg = " Categoria: Juvenil A";
		} else if (idade <= 17) {
			msg = " Categoria: Juvenil B";
		} else if (idade <= 50) {
			msg = " Categoria: Adulto";
		} else {
			msg = " Categoria: Veterano";
		}
		
		System.out.println("Idade: " + idade + msg);
	}
}
