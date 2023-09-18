package fiap;

import java.util.Scanner;

public class Exemplo03 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int tempoEmpresa = 0;
		String nome;
		double salario = 0;
		
		System.out.print("Digite o nome: ");
		nome = sc.next();
		
		System.out.print("Digite o tempo de empresa: ");
		tempoEmpresa = sc.nextInt();
		
		System.out.print("Digite o salário: ");
		salario = sc.nextDouble();
	}
	
	public static void analisar(int tempoEmpresa, double salario) {
		if(tempoEmpresa > 10 && salario < 5000) {
			System.out.println("Tem direito a aumento.");
		} else {
			System.out.println("Não tem direito ao aumento");
		}
	}
}
