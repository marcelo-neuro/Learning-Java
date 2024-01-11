package fiap;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[10];
		String nomeBusca = "";
		
		for(int cont = 0; cont < nomes.length ; cont++) {
			
			System.out.print("Digite o " + (cont + 1) + "º nome: ");
			nomes[cont] = sc.next();
				
		}
		
		System.out.println("Digite um nome que deseja buscar: ");
		nomeBusca = sc.next();
		
		for (int cont = 0 ; cont < nomes.length ; cont++) {
			if (nomes[cont].equalsIgnoreCase(nomeBusca)) {
				System.out.println("Achei - posição: " + (cont+ 1));
			} else {
				System.out.println("Não Achei");
			}
		}
	}
}
