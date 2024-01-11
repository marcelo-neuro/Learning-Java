import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #.00");
		
		String nome = "", modelo = "";
		char cp;
		
		int tipo = 0;
		int quantidade = 0, quantidadeTot = 0, parcelas = 0;
		double preco = 0.0, precoTotal = 0.0, precoFinal = 0.0;
		
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		
		System.out.print("Digite o tipo de computador que deseja comprar: ");
		tipo = sc.nextInt();
		while (tipo < 1 || tipo > 2) {
			System.out.print("Digite o tipo do computador corretamente: ");
			tipo = sc.nextInt();
		}
		
		while(tipo != 0) {
			
			System.out.print("Digite o modelo do computador: ");
			modelo = sc.next().toUpperCase();
			while (!(modelo.equalsIgnoreCase("I3")) && !(modelo.equalsIgnoreCase("I5")) 
					&& !(modelo.equalsIgnoreCase("I7"))) {
				System.out.print("Digite o modelo do computador corretamente: ");
				modelo = sc.next().toUpperCase();
			}
			
			System.out.print("Digite a quantidade de computadores que deseja comprar: ");
			quantidade = sc.nextInt();
			while(quantidade < 1) {
				System.out.print("É necessário comprar ao menos um computador. "
						+ "Digite a quantidade de computadores que deseja comprar: ");
				quantidade = sc.nextInt();
			}
			
			quantidadeTot += quantidade;
			
			switch (modelo) {
			case "I3":
				if (tipo == 1) {
					preco += 1801.0 * quantidade;
				} else {
					preco += 1899.0 * quantidade;
				}
				break;
			
			case "I5":
				if (tipo == 1) {
					preco += 2429.0 * quantidade;
				} else {
					preco += 2799.0 * quantidade;
				}
				
			case "I7":
				if (tipo == 1) {
					preco += 3150.0 * quantidade;
				} else {
					preco += 3199.0 * quantidade;
				}
			}
			
			System.out.print("Digite o tipo de computador que deseja comprar "
					+ "[0 finaliza a compra]: ");
			tipo = sc.nextInt();
			while (tipo < 0 || tipo > 2) {
				System.out.print("Digite o tipo do computador corretamente "
						+ "[0 finaliza a compra]: ");
				tipo = sc.nextInt();
			}
			
		}
		
		System.out.println("Valor da compra de " + df.format(quantidadeTot) + " computadores: " + preco);
		
		System.out.print("Digite o método de pagamento: ");
		cp = sc.next().toUpperCase().charAt(0);
		while (cp != 'V' && cp != 'P') {
			System.out.print("Digite o método de pagamento corretamente: ");
			cp = sc.next().toUpperCase().charAt(0);
		}
		
		if (cp == 'V') {
			if (quantidade >= 2) {
				precoFinal = preco * 0.8;
			} else {
				precoFinal = preco * 0.9;
			}
			
			System.out.println("Forma de pagamento: a vista.");
			System.out.println("Valor final da compra: " + df.format(precoFinal));
			
		} else {
			precoTotal = preco * 1.1;
			
			System.out.print("Digite o número de parcelas que deseja pagar: ");
			parcelas = sc.nextInt();
			while (parcelas < 2) {
				System.out.print("Só é possivel parcelar apenas acima de uma parcela. "
						+ "Digite o número de parcelas corretamente: ");
				parcelas = sc.nextInt();
			}
			
			precoFinal = precoTotal / parcelas;
			
			System.out.println("Forma de pagamento: parcelado.");
			System.out.println("Valor final da compra: " + df.format(precoFinal) + " x " 
			+ parcelas);
		}
		
	}
}
