package selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		int codigo = 0;
		double valorProduto = 0.0, valorFinal = 0.0;
		
		System.out.print("Digite o valor do produto: ");
		valorProduto = sc.nextDouble();
		
		System.out.print("Digite o codigo de pagamento: ");
		codigo = sc.nextInt();
		
		while (codigo < 1 || codigo > 4) {
			System.out.print("Digite o código de pagamento corretamente: ");
			codigo = sc.nextInt();
		}
		
		String pagamento = "";
		
		switch (codigo) {
		case 1:
			valorFinal = valorProduto * 0.9;
			pagamento = "1 x ";
			break;
			
		case 2:
			valorFinal = valorProduto *0.95;
			pagamento = "1 x ";
			break;
			
		case 3:
			valorFinal = valorProduto / 2;
			pagamento = "2 x ";
			break;
			
		case 4:
			valorFinal = (valorProduto * 1.1) / 3;
			pagamento = "3 x ";
			break;
		}
		
		System.out.println("Opção " + codigo + " - " + pagamento + df.format(valorFinal));
	}
}
