package fiap;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] diasSemana = new String[] {"Seg", "Ter", "Qua", "Qui", "Sex", "Sab", "Dom"};
		double[] temp = new double[7];
		
		int iMenorTemp = 0, iMaiorTemp = 0;
		
		for (int dia = 0 ; dia < diasSemana.length ; dia++) {
			System.out.print("Digite a temperatura na " + diasSemana[dia] + ": ");
			temp[dia] = sc.nextDouble();
			
			if (temp[dia] > temp[iMaiorTemp]) {
				iMaiorTemp = dia;
			}
			
			if (dia == 0) {
				iMenorTemp = dia;
			} else if (temp[dia] < temp[iMenorTemp]){
				iMenorTemp = dia;
			}
		}
		
		System.out.println("A maior temperatura ocorre na " + diasSemana[iMaiorTemp] +
				", fazedno " + temp[iMaiorTemp] + " graus");
		System.out.println("A menor temperatura ocorre na " + diasSemana[iMenorTemp] +
				", fazedno " + temp[iMenorTemp] + " graus");
		
	}
}
