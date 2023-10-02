package fiap;

import java.util.Scanner;

public class Exercicio06 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char[] sexo = setSexo();
		char[] corCabelo = setCorCabelo();
		char[] corOlho = setCorOlho();
		int[] idade = setIdade();
		
		System.out.println("Média das idades das pessoas que possuem olhos pretos e cabelo "
				+ "castanho: " + setMedia(corOlho, corCabelo, idade));
		
		System.out.println("Maior idade entre os habitantes: " + setMaiorIdade(idade));
		
		
		
		
	}
	
	
	public static char[] setSexo() {
		char[] sexo = new char[5];
		for(int p = 0 ; p < sexo.length ; p++) {
			System.out.print("Informe o sexo do habitante nº" + (p + 1) + ": ");
			sexo[p] = sc.next().toUpperCase().charAt(0);
			while(sexo[p] != 'M' && sexo[p] != 'F') {
				System.out.print("Informe o sexo do habitante nº" + (p + 1) + 
						" corretamente: ");
				sexo[p] = sc.next().toUpperCase().charAt(0);
			}
		}
		
		return sexo;
	}
	
	public static char[] setCorCabelo() {
		char[] corCabelo = new char[5];
		for(int p = 0 ; p < corCabelo.length ; p++) {
			System.out.print("Informe a cor do cabelo do habitante nº" + (p + 1) + ": ");
			corCabelo[p] = sc.next().toUpperCase().charAt(0);
			while(corCabelo[p] != 'L' && corCabelo[p] != 'P' && corCabelo[p] != 'C') {
				System.out.print("Informe a cor do cabelo do habitante nº" + (p + 1) + 
						" corretamente: ");
				corCabelo[p] = sc.next().toUpperCase().charAt(0);
			}
		}
		
		return corCabelo;
	}
	
	public static char[] setCorOlho() {
		char[] corOlho = new char[5];
		for(int p = 0 ; p < corOlho.length ; p++) {
			System.out.print("Informe a cor dos olhos do habitande " + (p + 1) + ": ");
			corOlho[p] = sc.next().toUpperCase().charAt(0);
			while(corOlho[p] != 'A' && corOlho[p] != 'C') {
				System.out.print("Informe a cor dos olhos do habitande " + (p + 1) + 
						" corretamente: ");
				corOlho[p] = sc.next().toUpperCase().charAt(0);
			}
		}
		
		
		return corOlho;
	}
	
	public static int[] setIdade() {
		int[] idade = new int[5];
		
		for(int p = 0; p < idade.length ; p++) {
			System.out.print("Informe a idade do habitante nº" + (p + 1) + ":");
			idade[p] = sc.nextInt();
			while(idade[p] < 0) {
				System.out.print("Informe a idade do habitante nº" + (p + 1) + 
						" corretamente:");
				idade[p] = sc.nextInt();
			}
		}
		
		
		return idade;
	}
	
	public static double setMedia(char[] corOlho, char[] corCabelo, int[] idade) {
		double media = 0;
		
		for(int p = 0 ; p < corOlho.length ; p++) {
			if(corOlho[p] == 'C' && corCabelo[p] == 'P') {
				media += idade[p];
			}
		}
		
		media /= 5;
		return media;
	}
	
	public static int setMaiorIdade(int[] idade) {
		int maiorIdade = 0;
		
		for(int p = 0 ; p < idade.length ; p++) {
			if(idade[p] > maiorIdade) {
				maiorIdade = idade[p];
			}
		}
		
		return maiorIdade;
	}
	
	
	public static int setFeminino(char[] sexo, int[] idade, char[] corOlho, 
			char[] corCabelo) {
		int contFem = 0;
		
		for(int p = 0 ; p < sexo.length ; p++) {
			if(sexo[p] == 'F' && (idade[p] >= 18 && idade[p] <= 35) 
					&& corOlho[p] == 'A' && corCabelo[p] == 'L') {
				contFem++;
			}
		}
		
		return contFem;
	}
}
