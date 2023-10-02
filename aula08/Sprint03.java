package fiap;

import java.util.Scanner;

public class Sprint03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int qtdEquipe = 0;
		int qtdCombate = 0;

		System.out.println("---------- QUANTIDADE DE EQUIPES NA COMPETIÇÃO ----------");

		System.out.print("Informe a quantidade de equipes que participarão da competição [2 a 89]: ");
		qtdEquipe = sc.nextInt();
		while(qtdEquipe < 2 || qtdEquipe > 89) {
			System.out.print("Informe a quantidade de equipes que participarão da competição corretamente [2 a 89]: ");
			qtdEquipe = sc.nextInt();
		}
		int[][] tbRobo = new int[3][qtdEquipe];
		int[][] tbClassificacao = new int[3][tbRobo[0].length];

		System.out.println("\n---------- DEFININDO NÚMERO DAS EQUIPES ----------");
		tbRobo = setNumEquipe(tbRobo);

		System.out.println("\n---------- DEFININDO QUANTIDADE DE COMBATES ----------");
		System.out.print("Informe a quantidade de combates: ");
		qtdCombate = sc.nextInt();
		while(qtdCombate < 1) {
			System.out.print("Informe a quantidade de combates corretamente: ");
			qtdCombate = sc.nextInt();
		}

		System.out.println("\n---------- DEFININDO RESULTADO DOS COMBATES ----------");
		tbRobo = setPontuacao(tbRobo, qtdCombate);


		System.out.println("\n---------- DEFININDO NOTAS DE DESIGN ----------");
		tbRobo = setNota(tbRobo);

		System.out.println("\n---------- CLASSIFICAÇÃO ----------");
		tbClassificacao = setClassificacao(tbRobo);
		printClassificacao(tbClassificacao);
	}

	public static int[][] setNumEquipe(int[][] tbRobo) {

		for(int e = 0; e < tbRobo[0].length ; e++) {
			System.out.print("Informe o número da " + (e + 1) + "ª equipe  [11 a 99]: ");
			tbRobo[0][e] = sc.nextInt();
			while((tbRobo[0][e] < 11 || tbRobo[0][e] > 99) || isNumEquipeIgual(tbRobo[0], tbRobo[0][e], e)) {
				if(tbRobo[0][e] < 11 || tbRobo[0][e] > 99) {
					System.out.println("Número inválido.");
				} else {
					System.out.println("Número de equipe já escolhido.");
				}

				System.out.print("Informe o número da equipe corretamente [11 a 99]: ");
				tbRobo[0][e] = sc.nextInt();
			}
		}

		return tbRobo;
	}

	public static boolean isNumEquipeIgual(int[] equipes, int numEquipe, int iEquipe) {

		for(int e = 0 ; e < equipes.length ; e++) {
			if((numEquipe == equipes[e]) && (e != iEquipe)) {
				return true;
			}
		}

		return false;
	}

	public static int[][] setPontuacao(int[][] tbRobo, int qtdCombate) {
		char res;

		for(int e = 0 ; e < tbRobo[0].length ; e++) {
			System.out.println("\n--- Resultados dos combates da equipe " + tbRobo[0][e] + ": ");
			System.out.println("[ V = vitória ; D = derrota ; E = empate ]");

			for(int c = 0 ; c < qtdCombate ; c++) {
				System.out.print("Informe o resultado do " + (c + 1) + "º combate: ");
				res = sc.next().toUpperCase().charAt(0);
				while(res != 'V' && res != 'D' && res != 'E') {
					System.out.print("Informe o resultado do " + (c + 1) + "º combate corretamente: ");
					res = sc.next().toUpperCase().charAt(0);
				}

				switch (res) {
					case 'V':
						tbRobo[1][e] += 5;
						break;

					case 'E':
						tbRobo[1][e] += 3;
						break;
				}
			}
		}


		return tbRobo;
	}

	public static int[][] setNota(int[][] tbRobo) {
		for(int e = 0 ; e < tbRobo[0].length ; e++) {
			System.out.print("Informe a nota de design do robô da equipe " + tbRobo[0][e] + " [0 a 10]: ");
			tbRobo[2][e] = sc.nextInt();
			while(tbRobo[2][e] < 0 || tbRobo[2][e] > 10) {
				System.out.print("Informe a nota de design do robô da equipe corretamente [0 a 10]: ");
				tbRobo[2][e] = sc.nextInt();
			}
		}


		return tbRobo;
	}

	public static int[][] ordenaMatriz(int[][] tbRobo) {

		for(int i = 1 ; i < tbRobo[0].length ; i++) {
			int[] aux = new int[3];
			aux[0] = tbRobo[0][i];
			aux[1] = tbRobo[1][i];
			aux[2] = tbRobo[2][i];

			int j = i - 1;
			while((j >= 0) && (aux[1] > tbRobo[1][j])) {
				tbRobo[0][j + 1] = tbRobo[0][j];
				tbRobo[1][j + 1] = tbRobo[1][j];
				tbRobo[2][j + 1] = tbRobo[2][j];
				j--;
			}
			tbRobo[0][j + 1] = aux[0];
			tbRobo[1][j + 1] = aux[1];
			tbRobo[2][j + 1] = aux[2];
		}

		return tbRobo;
	}

	public static int[][] desempatar(int[][] tbRobo) {
		int[][] tbOrdenada = ordenaMatriz(tbRobo);

		for(int i = 0 ; i < tbOrdenada[0].length - 1 ; i++) {
			for(int j = i + 1 ; j < tbOrdenada[0].length ; j++) {
				if(tbOrdenada[1][j] == tbOrdenada[1][i] && tbOrdenada[2][j] > tbOrdenada[2][i]) {
					for(int l = 0 ; l < 3 ; l++) {
						int aux = tbOrdenada[l][i];
						tbOrdenada[l][i] = tbOrdenada[l][j];
						tbOrdenada[l][j] = aux;
					}
				}
			}
		}

		return tbOrdenada;
	}

	public static int[][] setClassificacao(int[][] tbRobo) {
		int[][] tbAux = desempatar(tbRobo);
		int[][] tbClassificacao = new int[3][(int) (tbRobo[0].length / 2)];

		for(int l = 0; l < 3 ; l++) {
			for(int e = 0; e < tbClassificacao[0].length ; e++) {
				tbClassificacao[l][e] = tbAux[l][e];
			}
		}

		return tbClassificacao;
	}

	// printters
	public static void printArr(int[] arr) {
		System.out.print("[ ");
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}

	public static void printClassificacao(int[][] tbClassificacao) {
		for(int e = 0 ; e < tbClassificacao[0].length ; e++) {
			System.out.println("--- " +(e + 1) + "º lugar:");
			System.out.println("Equipe " + tbClassificacao[0][e] + " ; Pontuação: " + tbClassificacao[1][e] + " ; "
					+ "Nota de design: " + tbClassificacao[2][e]);
		}
	}

}