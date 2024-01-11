package fiap;

import java.util.Scanner;

public class Exemplo05 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double nota1 = 0, nota2 = 0, media = 0;
		String nome;
		
		System.out.print("Digite o nome: ");
		nome = sc.next();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = calculaMedia(nota1, nota2);
		System.out.println(media);
	}
	
	public static double calculaMedia(double nota1, double nota2) {
		double media = (nota1 + nota2) / 2;
		return media;
	}
}
