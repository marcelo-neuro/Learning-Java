package projeto.alura;

import java.util.Collections;
import java.util.Scanner;

import projeto.alura.modelo.Cartao;
import projeto.alura.modelo.Compra;



public class Menu {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double limiteCartao = 0;
		Cartao cartao;
		int sair = 0;
		
		System.out.print("Informe o limite do cartão: ");
		limiteCartao = sc.nextDouble();
		while(limiteCartao <= 0) {
			System.out.print("Informe o limite do cartão corretamente: ");
			limiteCartao = sc.nextDouble();
		}
		cartao = new Cartao(limiteCartao);
		
		do {
			boolean compraRealizada = false;
			
			System.out.print("Informe a descrição do produto: ");
			sc.nextLine();
			String descricao = sc.nextLine();
			System.out.print("Informe o valor da compra: ");
			double valor = sc.nextDouble();
			while(valor <= 0) {
				System.out.println("Informe o valor da compra corretamente: ");
				valor = sc.nextDouble();
			}
			
			 compraRealizada = cartao.realizarCompra(new Compra(descricao, valor));
			 if(compraRealizada) {
				 System.out.println("Compra realizada.");
				 System.out.print("Digite 0 para sair, digite 1 para continuar comprando: ");
				 sair = sc.nextInt();
				 while(sair > 1 || sair < 0) {
					 System.out.print("Digite 0 para sair, digite 1 para continuar comprando: ");
					 sair = sc.nextInt();
				 }
			 } else {
				 System.out.println("Compra não realizada, saldo insuficiente.");
			 }
		} while(sair == 1);
		
		System.out.println("Compras finalizadas.");
		
		System.out.println("Lista de compras: ");
		if(cartao.getCompras().isEmpty()) {
			System.out.println("Sua lista de compras está vazia.");
		} else {
			Collections.sort(cartao.getCompras()); 
		for(Compra compra: cartao.getCompras()) {
			System.out.println("\t" + compra);
		}
		}
		
		
	}
}
