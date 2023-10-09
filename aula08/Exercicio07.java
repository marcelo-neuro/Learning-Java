package fiap;

import java.util.Scanner;

public class Exercicio07 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] produtos = {"Notebook", "Computadores", "Tablets", "Servidores"};
		int[] metasVendas = {100, 150, 200, 250};
		
		int[][] tbVendas = setVendas(produtos);
		int[] totVendas = setTotVendas(tbVendas);
		int[] vendasMEs = setVendasMes(tbVendas);
		boolean[] atingiuMeta = setAtingiuMeta(metasVendas, totVendas);
//		printTotVendas(totVendas, produtos);
//		printVendasMes(vendasMEs);
		printRelatorio(atingiuMeta, metasVendas, totVendas, produtos);
		
 		
	}
	
	// metodos
	public static int[][] setVendas(String[] produtos) {
		//[mes][produto]
		int[][] tbVendas = new int[3][4];
		
			System.out.println("\n---------- INFORME AS VENDAS ----------");
		for(int p = 0 ; p < 4 ; p++) {
			System.out.println("--- " + produtos[p]);
			for(int m = 0; m < 3 ; m++) {
				System.out.print("Informe as vendas no " + (m + 1) + "º mês: ");
				tbVendas[m][p] = sc.nextInt();
			}
			System.out.println();
		}
		
		return tbVendas;
	}
	
	
	public static int[] setTotVendas(int[][] tbVendas) {
		int[] totVendas = new int[4];
		
		for(int p = 0 ; p < 4 ; p++) {
			for(int m = 0 ; m < 3 ; m++) {
				totVendas[p] += tbVendas[m][p];
			}
		}
		
		return totVendas;
	}
	
	public static int[] setVendasMes(int[][] tbVendas) {
		int[] vendasMes = new int[3];
		
		for(int m = 0 ; m < 3 ; m++) {
			for(int p = 0 ; p < 4 ; p++) {
				vendasMes[m] += tbVendas[m][p];
			}
		}
		
		return vendasMes;
	}
	
	public static boolean[] setAtingiuMeta(int[] metasVendas, int[] totVendas) {
		boolean[] atingiuMeta = new boolean[4];
		
		for(int p = 0 ; p < 4 ; p++) {
			atingiuMeta[p] = (totVendas[p] >= metasVendas[p]) ? true : false;
		}
		
		return atingiuMeta;
	}
	
	//printters
	public static void printTotVendas(int[] totVendas, String[] produtos) {
		System.out.println("\n---------- TOTAL DE VENDAS ----------");
		for(int p = 0; p < 4; p++) {
			System.out.println("--- " + produtos[p] + ": " + totVendas[p] + " vendas.");
		}
	}
	
	public static void printVendasMes(int[] vendasMes) {
		System.out.println("\n---------- TOTAL DE VENDAS POR MÊS ----------");
		for(int m = 0; m < 3; m++) {
			System.out.println("--- " + (m + 1) + "º mês: " + vendasMes[m] + " vendas.");
		}
	}
	
	public static void printRelatorio(boolean[] atingiuMeta, int[] metasVendas, int[] totVendas, String[] produtos) {
		System.out.print("\n---------- RELATÓRIO DE METAS ----------");
		for(int p = 0; p < 4 ; p++) {
			System.out.println("\n--- " + produtos[p] + "\n--- meta: " + metasVendas[p]
					+ "\n--- Total de vendas: " + totVendas[p]
					+ "\n--- Bateu a meta? " + ((atingiuMeta[p]) ? "SIM" : "NÃO")
					);
		}
	}
}
