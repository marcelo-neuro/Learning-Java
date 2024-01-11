package fiap;

import java.util.Scanner;

public class Exercicio02 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	public static double setPrecoCarga() {
		double precoKg = 0;
		double preco = 0;
		int codigo = 0;
		double peso = 0;
		
		System.out.print("Informe o peso da carga em tonelada: ");
		peso = sc.nextDouble();
		
		System.out.print("Informe o código da carga: ");
		codigo = sc.nextInt();
		while(codigo < 1 || codigo >30) {
			System.out.println("Informe o código da carga corretamente: ");
			codigo = sc.nextInt();
		}
		
		if(codigo < 10) {
			precoKg = 120;
		} else if(codigo > 10) {
			precoKg = 200;
		} else {
			precoKg = 280;
		}
		
		preco = (peso * 1000) * precoKg;
		
		return preco;
	}
	
	public static double setImposto() {
		double porceImposto = 0;
		int codigo = 0;
		
		System.out.print("Informe o código do estado: ");
		codigo = sc.nextInt();
		while(codigo < 1 || codigo > 4) {
			System.out.print("Informe o código do estado corretamente: ");
			codigo = sc.nextInt();
		}
		
		return porceImposto;
	}  
	
}
