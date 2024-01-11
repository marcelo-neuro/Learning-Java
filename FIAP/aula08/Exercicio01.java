package fiap;

import java.util.Scanner;

public class Exercicio01 {

	static Scanner sc = new Scanner(System.in);
	static String nome;
	
	public static void main(String[] args) {
		int tipo = 0;
		int diarias = 0;
		double preco = 0;
		String pagamento;
		
		System.out.print("Informe o nome: ");
		nome = sc.next();
		
		System.out.print("informe o tipo de acomodação: ");
		tipo = sc.nextInt();
		while(tipo < 1 && tipo > 3) {
			System.out.println("Informe o tipo de acomodação corretamente: ");
			tipo = sc.nextInt();
		}
		
		System.out.print("Informe a quantidade de diárias: ");
		diarias = sc.nextInt();
		
		System.out.print("Informe a forma de pagamento: ");
		pagamento = sc.next();
		
		preco = calculaEstadia(tipo, diarias);
		exibeValor(pagamento, preco);
		
	}
	
	public static double calculaEstadia(int tipo, int diarias) {
		double preco = 0;
		double valorDiaria = 0;
		switch(tipo) {
		case 1:
			valorDiaria = 380;
			break;
			
		case 2: 
			valorDiaria = 450;
			break;
			
		case 3: 
			valorDiaria = 560;
			break;
		}
				
		preco = valorDiaria * diarias;
		return preco;
	}
	
	public static void exibeValor(String formaPagamento, double preco) {
		double precoFinal = 0;
		if(formaPagamento.equalsIgnoreCase("V")) {
			precoFinal = preco - (preco * 0.1);
		}
		
		System.out.println(nome + " sua estadia em nosso hotel custará: " + precoFinal);
		
	}
}
