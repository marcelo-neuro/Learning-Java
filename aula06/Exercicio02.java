import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[10];
		String nomeBusca = "";
		
		for (int cont = 0 ; cont < nomes.length ; cont++) {
			System.out.print("Digite o " + cont + " nome: ");
			nomes[cont] = sc.next();
		}
		
		System.out.print("Digite o nome que deseja buscar: ");
		nomeBusca = sc.next();
		
		for (int cont = 0 ; cont < nomes.length ; cont++) {
			System.out.println(nomes[cont].equalsIgnoreCase(nomeBusca) ? "Achou na casa" + cont : "Não achou!");
		}
		
	}
}
