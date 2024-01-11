package fiap;

public class Exemplo03 {
	
	public static void main(String[] args) {
		
		double[][] notas = new double[][] {
			{10, 8, 5, 0},
			{3, 8, 9, 0},
			{3, 9, 5, 0}
			};
			
	
		
		for(int i = 0 ; i < 3 ; i++) {
			
			for(int j = 0 ; j < 3 ; j++) {
				notas[i][3] += notas[i][j];
			}
			
			notas[i][3] /= 3;
		}
		
		
		for(int j = 0; j < 3 ; j++) {
			System.out.println("Media do " + (j+1) + "º aluno: " + notas[j][3]);
		}
	}
}
