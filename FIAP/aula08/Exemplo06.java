package fiap;

import java.util.Scanner;

public class Exemplo06 {
	static Scanner sc = new Scanner(System.in);
	static String nome;
	
	public static void main(String[] args) {
		double media = 0;
		
		media = notas();
		analisa(media);
		
	}
	
	public static double calculaMedia(double nota1, double nota2) {
		double media = (nota1 + nota2) / 2;
		return media;
	}
	
	public static double notas() {
		double nota1 = 0, nota2 = 0, media = 0;
		
		
		System.out.print("Digite o nome: ");
		nome = sc.next();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		return media;
	}
	
	public static void analisa(double media) {
		if(media >= 6) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}
	}
}
