package fiap;

import java.util.Scanner;

public class Exemplo07 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		exibeArrStr(carregaNome(4), "Aluno ");
		
	}
	
	public static String[] carregaNome(int numAlunos) {
		String nomes[] = new String[numAlunos];
		
		for(int i = 0; i < numAlunos; i++) {
			System.out.print("Digite o " + (i + 1) + "º nome: ");
			nomes[i] = sc.next();
		}
		
		return nomes;
	}
	
	public static void exibeArrStr(String arr[], String msg) {
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(msg + (i + 1) + ": " + arr[i]);
		}
 	}
	
}
