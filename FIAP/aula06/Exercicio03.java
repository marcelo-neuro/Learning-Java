package fiap;

public class Exercicio03 {

	public static void main(String[] args) {
		
		
		String[] funcionarios = new String[] {"ANA", "JOSE", "LUIZ", "LUIZA", "LUCAS"};
		double[] salarios = new double[] {750, 1200, 740, 1240, 1590};
		int[] tempoServico = new int[] {3, 6, 2, 4, 6};
		
		
		System.out.println("NÃO RECEBE AUMENTO");
		for(int cont = 0 ; cont < funcionarios.length ; cont++) {
			if(salarios[cont] >= 780 && tempoServico[cont] <= 5) {
				System.out.println(funcionarios[cont]);
			}
				
		}
		
		
		System.out.println("RECEBE AUMENTO");
		
		double novoSal = 0;
		for(int cont = 0; cont < funcionarios.length ; cont++) {
		
			if(salarios[cont] < 780 || tempoServico[cont] > 5) {
				
				if(salarios[cont] < 780 && tempoServico[cont] > 5) {
					novoSal = salarios[cont] + ((salarios[cont] / 100) * 35);
				
				}else if(tempoServico[cont] > 5) {
					novoSal = salarios[cont] + ((salarios[cont] / 100) * 25);
					
				} else {
					novoSal = salarios[cont] + ((salarios[cont] / 100) * 15);
					
				}
				
				System.out.println(funcionarios[cont] + " - Novo salário: " + novoSal);
			}
			
		}
		
		
	}
}
