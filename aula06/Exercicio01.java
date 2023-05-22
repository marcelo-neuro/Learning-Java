import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
						"Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		double[] temps = new double[12];
		
		int iMaior = 0, iMenor = 0;
		
		for (int i = 0 ; i < 12 ; i++) {
			System.out.print("Digite a temperatura máxima do mês "
					+ meses[i] + ": ");
			temps[i] = sc.nextDouble();
			
			if (temps[i] > temps[iMaior]) {
				iMaior = i;
			} else if(temps[i] < temps[iMenor]){
				iMenor = i;
			}
		}
		
		System.out.println("Mês com maior temperatura: " + meses[iMaior]
				+ "; Temperatura: " + temps[iMaior]);
		
		System.out.println("Mês com menor temperatura: " + meses[iMenor]
				+ "; Temperatura: " + temps[iMenor]);
	}
}
