package fiap;

public class Exercicio05 {
	public static void main(String[] args) {
		
		int[][] m1Sem = new int[][] {
			{10, 10, 10},
			{10, 10, 10},
			{10, 10, 10},
			{10, 10, 10},
			{10, 10, 10}
		};
		
		int[][] m2Sem = new int[][] {
			{40, 20, 20},
			{20, 20, 30},
			{20, 20, 20},
			{20, 40, 20},
			{20, 35, 20}
		};
		
		int[][] anual = new int[5][3];
		
		int[] sMatriculaU = new int[3];
		int[] sMatriculaC = new int[5];
		int[] maiorMatriculas = new int[5];
		
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {		
				anual[i][j] = m1Sem[i][j] + m2Sem[i][j];
			}
		}
		
		System.out.println("QUANTIDADE DE ALUNOS POR CURSO E UNIDADE NO ANO");
		System.out.println("-----------------------------------------------");
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Curso: " + (i+ 1));
			
			for(int j = 0 ; j < 3 ; j++) {
				System.out.println("Quantidade de matrículas na unidade " + (j + 1) + ": "+ anual[i][j]);
			}
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("QUANTIDADE DE MATRÍCULAS POR UNIDADE");
		System.out.println("-----------------------------------------------");
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 5; j++) {
				sMatriculaU[i] += anual[j][i];
			}
			System.out.println("Quantidade de matrículas na unidade " + (i + 1) + ": " + sMatriculaU[i]);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("QUANTIDADE DE MATRÍCULAS POR CURSO");
		System.out.println("-----------------------------------------------");
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				sMatriculaC[i] += anual[i][j];
			}
			System.out.println("Quantidade de matrículas no curso " + (i + 1) + ": " + sMatriculaC[i]);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("MAIOR NÚMERO DE MATRÍCULAS POR CURSO");
		System.out.println("-----------------------------------------------");
		
		for(int i = 0 ; i < 5; i++) {
			int iMaior = 0;
			for(int j = 0 ; j < 3 ; j++) {
				if (j == 0) {
					maiorMatriculas[i] = anual[i][0];
				}
				
				if(anual[i][j] > maiorMatriculas[i]) {
					maiorMatriculas[i] = anual[i][j];
					iMaior = j;
				}
			}
			System.out.println("Maior número de matrículas no curso " + (i + 1) + ": " + maiorMatriculas[i]
					+ " Unidade: " + (iMaior + 1));
		}
		
//		for (int i = 0 ; i < 5 ; i++) {
//			for (int j = 0 ; j < 3 ; j++) {		
//				System.out.print(anual[i][j] + " ");
//			}
//		}
		
	}
}
