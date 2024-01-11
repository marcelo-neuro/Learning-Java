package fiap;

import java.util.Scanner;

public class Exemplo04 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int op = 0;
		
		do {
			
			int n1 = 0, n2 = 0;
			System.out.println("[1] - Adição");
			System.out.println("[2] - Subtração");
			System.out.println("[3] - Multiplicação");
			System.out.println("[4] - Divisão");
			System.out.println("[5] - Sair");
			
			System.out.print("Escolha uma opção: ");
			op = sc.nextInt();
			
			if(op >=5 && op < 0) {
				System.out.print("Digite o primeiro número: ");
			n1 = sc.nextInt();
			System.out.print("Digite o segundo número: ");
			n2 = sc.nextInt();
			}
			
			
			switch (op) {
			case 1:
				
				adicao(n1, n2);
				break;
				
			case 2:
				subtracao(n1, n2);
				break;
				
			case 3:
				multiplicacao(n1, n2);
				break;
				
			case 4: 
				divisao(n1, n2);
				
				break;
				
			case 5: 
				System.exit(0);
				break;
				
			default:
				System.out.println("Opção inválida - digite novamente.");
			}
		} while(op != 5);
	}
	
	public static void adicao(int n1, int n2) {
		int r = 0;
		
		System.out.println("---------- ADIÇÃO ----------");
		r = n1 + n2; 
		System.out.println("Resultado: " + r);	
	}
	
	public static void subtracao(int n1, int n2) {
		int r = 0;
		
		System.out.println("---------- ADIÇÃO ----------");
		r = n1 + n2; 
		System.out.println("Resultado: " + r);	
	}
	
	public static void multiplicacao(int n1, int n2) {
		int r = 0;
		
		System.out.println("---------- ADIÇÃO ----------");
		r = n1 + n2; 
		System.out.println("Resultado: " + r);	
	}
	
	public static void divisao(int n1, int n2) {
		int r = 0;
		
		System.out.println("---------- ADIÇÃO ----------");
		r = n1 + n2; 
		System.out.println("Resultado: " + r);	
	}
}
