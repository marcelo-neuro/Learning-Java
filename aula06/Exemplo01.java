import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		String[] atletas = new String[5];
		int[] idades = new int[5];
		
		for (int cont = 0 ; cont < 5 ; cont++) {
			System.out.print("atleta [" + cont + "]: ");
			atletas[cont] = sc.next();
			System.out.print("idade [" + cont + "]: ");
			idades[cont] = sc.nextInt();
		}
		
		for (int cont = 0 ; cont < atletas.length ; cont++) {
			if (idades[cont] > 21 ) {
				System.out.println("Alteta: " + atletas[cont] + "; Idade: " + idades[cont]);
			}
		}
		
	}
}
