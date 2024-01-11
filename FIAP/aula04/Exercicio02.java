package repeticao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("###.##");
		
		int totalVotos = 0, voto = 0;
		int contC1 = 0, contC2 = 0, contC3 = 0, contC4 = 0, contNulo = 0, contBranco = 0;
		
		do {
			System.out.print("Digite o número do candidato que deseja votar (0 finaliza a votação.): ");
			voto = sc.nextInt();
			
			while (voto != 0 && voto != 1 && voto != 2 && voto != 3 && voto != 4 && voto != 5 && voto != 6) {
				System.out.print("Digite o número do candidato corretamente: ");
				voto = sc.nextInt();
			}
			
			totalVotos++;
			
			switch (voto) {
			
			case 1:
				contC1++;
				break;
				
			case 2:
				contC2++;
				break;
				
			case 3:
				contC3++;
				break;
				
			case 4:
				contC4++;
				break;
				
			case 5:
				contNulo++;
				break;
				
			case 6:
				contBranco++;
				break;
			}
			
			
		} while (voto != 0);
		
		sc.close();
		
		System.out.println("Candidato 1: " + contC1);
		System.out.println("Candidato 2: " + contC2);
		System.out.println("Candidato 3: " + contC3);
		System.out.println("Candidato 4: " + contC4);
		
		if (contNulo == 0) {
			System.out.println("Porcentagem de votos nulos: )%");
		} else {
			double cont = (double) contNulo;
			double porce = (cont / totalVotos) * 100;
			String porceFormatado = format.format(porce);
			System.out.println("Porcentagem de votos Nulos: " + porceFormatado + "%");
		}
		
		if(contBranco == 0) {
			System.out.println("Porcentagem de votos em branco: 0%");
		} else {
			double cont = (double)contBranco;
			double porce = (cont / totalVotos) * 100;
			String porceFormatado = format.format(porce);
			System.out.println("Porcentagem de votos em branco: " + porceFormatado + "%");
		}
		
	}
}
