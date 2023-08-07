package fiap;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[10];
		String nomeBusca = "";
		boolean achou = false;
		
		for(int cont = 0; cont < nomes.length ; cont++) {
			
			System.out.print("Digite o " + (cont + 1) + "º nome: ");
			nomes[cont] = sc.next();
				
		}
		
		System.out.println("Digite um nome que deseja buscar: ");
		nomeBusca = sc.next();
		
		for (int cont = 0 ; cont < nomes.length ; cont++) {
			if (nomes[cont].equalsIgnoreCase(nomeBusca)) {
				achou = true;
			}
		}
		
		System.out.println(achou ? "Achei" : "Não Achei.");
	}
}
