package fiap;

import java.util.Scanner;

public class Sprint03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdRobo = 0;
		int qtdCombate = 0;
		char cbResultado;
		
		System.out.print("informe a quantidade de euipes que participarão da competição: ");
		qtdRobo = sc.nextInt();
		while(qtdRobo < 2) {
			System.out.print("informe a quantidade de euipes que participarão da "
					+ "competição corretamente: ");
			qtdRobo = sc.nextInt();	
		}
		
		int[][] tbRobo = new int[3][qtdRobo];
		
		System.out.println("\n---------- REGISTRANDO AS EQUIPES ----------");
		for(int c = 0; c < qtdRobo ; c++) {
			System.out.print("Informe o número da equipe [entre 11 e 99]: ");
			tbRobo[0][c] = sc.nextInt();
			while(tbRobo[0][c] < 11 || tbRobo[0][c] > 99) {
				System.out.print("Informe o número da equipe corretamente [entre 11 e 99]: ");
				tbRobo[0][c] = sc.nextInt();
			}
		}
		
		System.out.print("\n---------- Informe o número de combates realizados por cada equipe: ");
		qtdCombate = sc.nextInt();
		while(qtdCombate < 1) {
			System.out.print("---------- Informe o número de combates realizados por cada equipe "
					+ "corretamente: ");
			qtdCombate = sc.nextInt();
		}
		
		System.out.println("\n---------- RESULTADO DOS COMBATES ----------");
		for(int e = 0; e < qtdRobo ; e++) {
			System.out.println("Resultado dos combates da equipe " + tbRobo[0][e] + ":");
			
			for(int c = 0; c < qtdCombate ; c++) {
				System.out.print("Informe o resultado do " + (c + 1) + "º combate: ");
				cbResultado = sc.next().toUpperCase().charAt(0);
				while(cbResultado != 'V' && cbResultado != 'D' && cbResultado != 'E') {
					System.out.print("Informe o resultado do " + (c + 1) + "º combate corretamente: ");
					cbResultado = sc.next().toUpperCase().charAt(0);
				}
				switch (cbResultado) {
				case 'V':
					tbRobo[1][e] += 5;
					break;
					
				case 'E':
					tbRobo[1][e] += 3;
					break;
				}
			}
			
			System.out.println("Pontuação da equipe " + tbRobo[0][e] + ": " + tbRobo[1][e]);
		}
	}
	
}
