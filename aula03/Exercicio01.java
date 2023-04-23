package selecao;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura = 0.0, peso = 0.0, imc = 0.0;
		
		System.out.print("Informe seu peso: ");
		peso = sc.nextDouble();
		
		System.out.print("Informe sua altura: ");
		altura = sc.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		String classificacao = "";
		
		if (imc < 18.5) {
			classificacao += "Baixo peso";
		} else if (imc <= 24.9) {
			classificacao += "Peso normal";
		} else if (imc <= 29.9) {
			classificacao += "Pré-obesidade";
		} else if (imc <= 34.9) {
			classificacao += "Obesidade grau I";
		} else if (imc <= 39.9) {
			classificacao += "Obesidade grau II";
		} else {
			classificacao += "Obesidade grau III";
		}
		
		System.out.println("Seu imc: " + imc + " Classificação: " + classificacao);
	}
}
