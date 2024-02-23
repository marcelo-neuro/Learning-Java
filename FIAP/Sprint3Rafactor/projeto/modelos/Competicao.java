package projeto.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Competicao {

    private int qtdEquipes;
    private int qtdCombates;
    private ArrayList<Robo> equipes = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    public Competicao() {
        setQtdEquipes();
        setQtdCombates();
        setEquipes();
        definirResultados();
        exibirPlacar();
    }

    public int getQtdEquipes() {
        return qtdEquipes;
    }

    public int getQtdCombates() {
        return qtdCombates;
    }

    private void setQtdEquipes() {
        int qtdEquipes;
        System.out.print("Informe a quantidade de equipes na competição (valores válidos de 2 a 10): ");
        qtdEquipes = sc.nextInt();
        while(qtdEquipes < 2 || qtdEquipes > 10) {
            System.out.print("Informe a quantidade de equipes na competição corretamente " +
                    "(valores válidos de 2 a 10): ");
            qtdEquipes = sc.nextInt();
        }
        this.qtdEquipes = qtdEquipes;
    }

    private void setQtdCombates() {
        int qtdCombates;
        System.out.print("Informe a quantidade de combates realizados por cada robô " +
                "(valores válidos de 1 a 10): ");
        qtdCombates = sc.nextInt();
        while(qtdCombates < 1 || qtdCombates > 10) {
            System.out.print("Informe a quantidade de combates realizados por cada robô corretamente " +
                    "(valores válidos de 1 a 10): ");
            qtdCombates = sc.nextInt();
        }
        this.qtdCombates = qtdCombates;
    }

    private void setEquipes() {
        for(int e = 0; e < qtdEquipes; e++) {
            System.out.println("Insira as informações do robô da " + (e + 1) + "ª equipe:");
            Robo robo = new Robo();

            if(e != 0) {
                while(isRoboRepetido(robo)){
                    System.out.println("O número escolhido já está sendo utilizado. Insira as informações do " +
                            "robô novamente");
                    robo = new Robo();
                }
            }

            equipes.add(robo);
            System.out.println();
        }
    }

    private boolean isRoboRepetido(Robo robo)  {
        for (Robo equipe : equipes) {
            if (robo == equipe) {
                continue;
            }

            if (robo.getNumero() == equipe.getNumero()) {
                return true;
            }
        }
        return false;
    }
    
    private void definirResultados() {
    	System.out.println("");
    	for(int e = 0; e < equipes.size(); e++) {
    		System.out.println("Resultados da equipe do robô nº " +
    				equipes.get(e).getNumero() + ": ");
    		for(int l = 0; l < this.getQtdCombates(); l++) {
    			char resultado;
    			System.out.println("Rodada nº" + (l + 1) + "");
    			System.out.print("Informe o resultado dessa rodada "
    					+ "[V: vitória ; D: derrota ; E: empate]: ");
    			resultado = sc.next().toUpperCase().charAt(0);
    			
    			while((resultado != 'V') && (resultado != 'D') && (resultado != 'E')) {
    				System.out.print("Informe o resultado dessa rodada corretamente "
        					+ "[V: vitória ; D: derrota ; E: empate]: ");
        			resultado = sc.next().toUpperCase().charAt(0);
    			}
    			
    			switch(resultado) {
    			case 'V':
    				equipes.get(e).vencer();
    				break;
    			
    			case 'D':
    				equipes.get(e).perder();
    				break;
    				
    			case 'E':
    				equipes.get(e).empatar();
    			}
    		}
    		System.out.println();
    	}
    }
    
    private void exibirPlacar() {
    	Collections.sort(equipes);
    	
    	System.out.println("Placar final");
    	for(int e = 0; e < equipes.size(); e++) {
    		System.out.println((e + 1) + " " + equipes.get(e));
    	}
    }
}
