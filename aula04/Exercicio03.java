package repeticao;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int canal = 0;
		int contC4 = 0, contC5 = 0, contC7 = 0, contC12 = 0;
		int audiencia = 0, totalAudiencia = 0;
		
		do {
			
			System.out.print("Digite o número do canal: ");
			canal = sc.nextInt();
			
			while (canal != 4 && canal != 5 && canal != 7 && canal != 12) {
				System.out.print("Digite o número do canal corretamente: ");
				canal = sc.nextInt();
			}
			
			switch (canal) {
			case 4:
				System.out.print("Digite o número de telespectadores: ");
				audiencia = sc.nextInt();
				contC4 += audiencia;
				break;
				
			case 5:
				System.out.print("Digite o número de telespectadores: ");
				audiencia = sc.nextInt();
				contC5 += audiencia;
				break;
				
			case 7:
				System.out.print("Digite o número de telespectadores: ");
				audiencia = sc.nextInt();
				contC7 += audiencia;
				break;
				
			case 12:
				System.out.print("Digite o número de telespectadores: ");
				audiencia = sc.nextInt();
				contC12 += audiencia;
				break;
			}
			
			totalAudiencia += audiencia;
			
		} while (canal != 0);
		
		if (totalAudiencia != 0) {
			if (contC4 != 0) {
				double porce = (contC4 / totalAudiencia) * 100;
				System.out.println("Canal 4: " + porce + "%");;
			} else {
				System.out.println("Canal 4: 0%");
			}
			
			if (contC5 != 0) {
				double porce = (contC5 / totalAudiencia) * 100;
				System.out.println("Canal 5: " + porce + "%");
			} else {
				System.out.println("Canal 5: 0%");
			}
			
			if (contC7 != 0) {
				double porce = (contC7 / totalAudiencia) * 100;
				System.out.println("Canal 7: " + porce + "%");
			} else {
				System.out.println("Canal 7: 0%");
			}
			
			if (contC12 != 0) {
				double porce = (contC12 / totalAudiencia) * 100;
				System.out.println("Canal 12: " + porce + "%");
			} else {
				System.out.printf("Canal 12: 0%");
			}
		}
	}
}
