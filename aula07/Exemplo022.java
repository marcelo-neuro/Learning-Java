package fiap;

public class Exemplo022 {
	public static void main(String[] args) {
		
		int[][] tabela = new int[][] {
			{1,1,1,1},
			{2,2,2,2},
			{3,3,3,3},
			{4,4,4,4}
			};
			
		int somaLinha = 0;
		int somaColuna = 0;
		int totTabela = 0;
			
			
		for(int i = 0 ; i < 4 ; i++) {
			somaLinha = 0;
			somaColuna = 0;
			for(int j = 0 ; j < 4 ; j++) {
				somaLinha += tabela[i][j];
				somaColuna += tabela[j][i];
			}
			
			totTabela += somaLinha;
			System.out.println("Soma linha: " + somaLinha);
			System.out.println("Soma linha: " + somaColuna);
		}
		
		System.out.println("Total da tabela: " + totTabela);
	}
}
