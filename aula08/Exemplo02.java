package fiap;

import java.util.Scanner;

public class Exemplo02 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int op = 0;
		
		do {
			System.out.println("[1] - Adição");
			System.out.println("[2] - Subtração");
			System.out.println("[3] - Multiplicação");
			System.out.println("[4] - Divisão");
			System.out.println("[5] - Sair");
			
			System.out.print("Escolha uma opção: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				adicao();
				break;
				
			case 2:
				subtracao();
				break;
				
			case 3:
				multiplicacao();
				break;
				
			case 4: 
				divisao();
				
				break;
				
			case 5: 
				System.exit(0);
				break;
				
			default:
				System.out.println("Opção inválida - digite novamente.");
			}
		} while(op != 5);
		
	}
	
	public static void adicao() {
		int n1, n2, r = 0;
		
		System.out.println("---------- ADIÇÃO ----------");
		
		System.out.print("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		n2 = sc.nextInt();
		
		r = n1 + n2; 
		System.out.println("Resultado: " + r);	
	}
	
	public static void subtracao() {
		int n1, n2, r = 0;
		
		System.out.println("---------- SUBRITAÇÃO ----------");
		
		System.out.print("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		n2 = sc.nextInt();
		
		r = n1 - n2; 
		System.out.println("Resultado: " + r);	
	}
	
	public static void multiplicacao() {
		int n1, n2, r = 0;
		
		System.out.println("---------- 	MULTIPLICAÇÃO ----------");
		
		System.out.print("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		n2 = sc.nextInt();
		
		r = n1 * n2; 
		System.out.println("Resultado: " + r);	
	}
	
	public static void divisao() {
		int n1, n2, r = 0;
		
		System.out.println("---------- DIVISÃO ----------");
		
		System.out.print("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		n2 = sc.nextInt();
		
		r = n1 / n2; 
		System.out.println("Resultado: " + r);	
	}
}
