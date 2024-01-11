package selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int venda = 0;
		double preco = 0.0, novoPreco = 0.0;
		
		System.out.print("Venda média do produto: ");
		venda = sc.nextInt();
		
		System.out.print("Preco do produto: ");
		preco = sc.nextDouble();
		
		if (venda < 500 || preco < 30) {
			novoPreco = preco * 1.1;
		} else if (venda < 1200 || preco < 80) {
			novoPreco = preco * 1.15;
		} else {
			novoPreco = preco * 0.8;
		}
		
		System.out.println("Novo preço: " + df.format(novoPreco));
		
	}
}
