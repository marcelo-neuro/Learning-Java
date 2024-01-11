package fiap;

import java.util.Scanner;

public class Exemplo01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		verificaPar();
	}
	
	
	//PROCEDIMENTO: VOID, NÃO TEM RETORNO
	public static void verificaPar() {
		int num = 0;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é ímpar.");
		}
	}
}
