import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String matricula = "", situacao = "";
		int frequencia = 0;
		double nota = 0, somaNota = 0, media = 0;
		
		for (int i = 0 ; i < 3 ; i++) {
			
			System.out.print("Digite o número de matricula do aluno: ");
			matricula = sc.next();
			
			System.out.print("Digite a frequência do aluno nas aulas: ");
			frequencia = sc.nextInt();
			
			for (int j = 1 ; j <= 3 ; j++) {
				System.out.print("Digite a " + j + "ª" + " nota do aluno: ");
				nota = sc.nextDouble();
				somaNota += nota;
			}
			
			media = somaNota / 3.0 ;
			
			if (frequencia >= 40 && media >= 6.0) {
				situacao = "aprovado";
			} else {
				situacao = "reprovado";
			}
			
			System.out.println("O aluno: " + matricula + ", foi " + situacao
					+ " com a média: " + media + " e frequência: " + frequencia);
			
			somaNota = 0;
		}
	}
}