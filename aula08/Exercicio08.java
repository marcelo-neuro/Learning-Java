package fiap;

import java.util.Scanner;

public class Exercicio08 {
	static Scanner sc = new Scanner(System.in);
	
	static String[][] hDados = new String[5][2];
	static int[][] hNumero = new int[5][2];
	
	public static void main(String[] args) {
		
		String[] nomeProdutos = new String[] {"Refrigerante lata", "Água sem gás", "Água com gás", 
				"Suco de laranja", "Barra de chocolate"};
		String[] nomeServico = new String[] {"Lavanderia", "Sauna", "Almoço", "Café da manhã", "Jantar"};
		
		double[] precoProduto = new double[] {2.80, 1.90, 2.10, 2.30, 4.90};
		double[] precoServico = new double[] {10.50, 60.80, 42.90, 35.60, 60.40};
		
		int[][] tbConsumo = setConsumo(nomeProdutos);
		
		
		System.out.println("---------- CONTROLE DE HOSPEDAGEM ----------");
		for(int h = 0 ; h < 5 ; h++) {
			System.out.print("\nInforme o nome do " + (h + 1) + "º hospede: ");;
			hDados[h][0] = sc.next();
			
			System.out.print("Tipo de acomodação: S (Single); D (Double); SL (Suíte de Luxo); SR (Suíte Presidencial): ");
			hDados[h][1] = sc.next().toUpperCase();
			while(!(hDados[h][1].equalsIgnoreCase("S")) && !(hDados[h][1].equalsIgnoreCase("D")) 
					&& !(hDados[h][1].equalsIgnoreCase("SL")) && !(hDados[h][1].equalsIgnoreCase("SR"))) {
				System.out.println("Informe o tipo de acomodação corretamente: ");
				hDados[h][1] = sc.next().toUpperCase();
			}
			
			hNumero[h][0] = h + 1;
			System.out.println("Número do quarto: " + hNumero[h][0]);
		}
	}
	
	
	public static int[][] setConsumo(String[] nomeProdutos) {
		int[][] tbConsumo = new int[5][5];
		
		System.out.println("---------- CONTROLE DE CONSUMO ----------");
		for(int h = 0 ; h < 5 ; h++) {
			System.out.println("--- Hospedagem: " + hNumero[h][0]);
			for(int p = 0; p < 5 ; p++) {
				System.out.print("Informe o consumo do produto (" + nomeProdutos[p] + "): ");
				tbConsumo[h][p] = sc.nextInt();
				while(tbConsumo[h][p] < 0) {
					System.out.print("Informe o consumo do produto corretamente (" + nomeProdutos[p] + "): ");
					tbConsumo[h][p] = sc.nextInt();
				}
			}
		}
		
		return tbConsumo;
	}
	
}
