package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		DecimalFormat f = new DecimalFormat("##0.00 KM");
		DecimalFormat fL = new DecimalFormat("##0.00 L");
		Scanner sc = new Scanner(System.in);
		
		String[] cidades = new String[] {"CAMPINAS", "BAURU", "SOROCABA", "ATIBAIA", "SANTOS"};
		
		double[][] distancia = new double[5][5];
		
		double consumo = 0;
		
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				
				if(j != i) {
					distancia[i][j] = Math.random() * 500;
				} else {
					distancia[i][j] = 0;
				}
				
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("PERCURSOS QUE NÃO ULTRAPASSAM 250 KM");
		System.out.println("------------------------------------");
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(distancia[i][j] < 250) {
					System.out.println("-- Distancia: " + f.format(distancia[i][j]) + " - Entre as cidades: "
							+ cidades[i] + " e " + cidades[j]);
				}
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("CONSUMO DE COMBUSTÍVEL");
		System.out.println("------------------------------------");
		System.out.print("Informe o consumo de combustível do veículo: ");
		consumo = sc.nextDouble();
		while(consumo <= 0) {
			System.out.print("Informe o consumo de combustível do veículo corretamente: ");
			consumo = sc.nextDouble();
		}
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				double consumoPercurso = 0;
				if(distancia[i][j] != 0) {
					consumoPercurso = distancia[i][j] / consumo;
				}
				System.out.println("Consumo entre as cidades: " + cidades[i] + " e " + cidades[j]
						+ " é " + fL.format(consumoPercurso));
				
			}
		}
		
	}
}
