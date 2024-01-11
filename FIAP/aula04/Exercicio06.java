import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, somaIdade = 0;
		char op;
		
		int respostas = 0, contA = 0, contB = 0, contC = 0, contD = 0, contE = 0;
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		while (idade != 0) {
			
			System.out.print("Qual a sua opini�o sobre o filme?");
			op = sc.next().toUpperCase().charAt(0);
			while (op != 'A' && op != 'B' && op != 'C' && op != 'D' && 
					op != 'E') {
				System.out.print("Digite uma opini�o v�lida: ");
				op = sc.next().toUpperCase().charAt(0);
			}
			
			respostas++;
			
			somaIdade += idade;
			
			switch (op) {
			case 'A':
				contA++;
				break;
				
			case 'B':
				contB++;
				break;
				
			case 'C':
				contC++;
				break;
				
			case 'D':
				contD++;
				break;
				
			case 'E':
				contE++;
				break;
			}
			
			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();
			
		}
		
		System.out.println("N�mero de respostas: " + respostas);
		
		double media = (double) somaIdade/respostas;
		System.out.println("M�dia das idades de quem respomdeu: " + media);
		
		if (contA == 0) {
			System.out.println("Opini�o A: 0%");
		} else {
			double porce = (double) (contA * 1.0/ respostas) * 100;
			System.out.println("Opini�o A: " + porce + "%");
		}
		
		if (contA == 0) {
			System.out.println("Opini�o B: 0%");
		} else {
			double porce = (double) (contB * 1.0 / respostas) * 100;
			System.out.println("Opini�o B: " + porce + "%");
		}
		
		if (contA == 0) {
			System.out.println("Opini�o C: 0%");
		} else {
			double porce = (double) (contC * 1.0 / respostas) * 100;
			System.out.println("Opini�o C: " + porce + "%");
		}
		
		if (contA == 0) {
			System.out.println("Opini�o D: 0%");
		} else {
			double porce = (double) (contD * 1.0 / respostas) * 100;
			System.out.println("Opini�o D: " + porce + "%");
		}
		
		if (contA == 0) {
			System.out.println("Opini�o E: 0%");
		} else {
			double porce = (double) (contE * 1.0 / respostas) * 100;
			System.out.println("Opini�o E: " + porce + "%");
		}
		
	}
}
