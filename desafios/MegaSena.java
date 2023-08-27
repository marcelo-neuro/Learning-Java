package fiap;

import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tabela = new int[60];
        for(int i = 0 ; i < 60; i++) {
            tabela[i] = 0;
        }

        int[] tabelaAposta = new int[60];
        for(int i = 0 ; i< 60 ; i++) {
            tabelaAposta[i] = 0;
        }

        int[] iAposta = new int[6];
        int[] iSorteio = new int[6];

        int acertos = 0;

        for(int i = 0; i < 6 ; i++) {
            System.out.print("Digite o " + (i + 1) + "º número sorteado: ");
            iSorteio[i] = (sc.nextInt() - 1);
            while(iSorteio[i] < 0 || iSorteio[i] > 59) {
                System.out.print("Digite o " + (i + 1) + "º número sorteado corretamente: ");
                iSorteio[i] = (sc.nextInt() - 1);
            }
            tabela[iSorteio[i]] = 1;
        }

//        int col = 0;
//        for(int i = 0; i < 60 ; i++) {
//            if(col != 10) {
//                System.out.print(tabela[i] + "\t");
//            } else {
//                System.out.print("\n" + tabela[i] + "\t");
//            }
//
//            if(col == 10) {
//                col = 0;
//            }
//            col++;
//        }

        System.out.println("\n---------- NÚMEROS SORTEADOS ----------\n");

        int colS = 0;
        for(int i = 0 ; i < 60 ; i++) {
            if(colS != 10) {
                if(tabela[i] == 0) {
                    if(i < 9) {
                        System.out.print("0" + (i + 1) + "\t");
                    } else {
                        System.out.print((i + 1) + "\t");
                    }
                } else {
                    System.out.print("X\t");
                }
            } else {
                if(tabela[i] == 0) {
                    System.out.print("\n" + (i + 1) + "\t");
                } else {
                    System.out.print("\nX\t");
                }
            }

            if(colS == 10) {
                colS = 0;
            }

            colS++;
        }

        System.out.println("\n---------------------------------------\n");

        for(int i = 0 ; i < 6 ; i++) {
            System.out.print("Digite o " + (i + 1) + "º número que deseja apostar: ");
            iAposta[i] = (sc.nextInt() - 1);
            while(iAposta[i] < 0 || iAposta[i] > 59) {
                System.out.print("Digite o " + (i + 1) + "º número que deseja apostar válido: ");
                iAposta[i] = (sc.nextInt() - 1);
            }
            tabelaAposta[iAposta[i]] = 1;
        }

        System.out.println("\n---------- NÚMEROS APOSTADOS ----------\n");

        int colA = 0;
        for(int i = 0 ; i < 60 ; i++) {
            if(colA != 10) {
                if(tabelaAposta[i] == 0) {
                    if(i < 9) {
                        System.out.print("0" + (i + 1) + "\t");
                    } else {
                        System.out.print((i + 1) + "\t");
                    }
                } else {
                    System.out.print("X\t");
                }
            } else {
                if(tabelaAposta[i] == 0) {
                    System.out.print("\n" + (i + 1) + "\t");
                } else {
                    System.out.print("\nX\t");
                }
            }

            if(colA == 10) {
                colA = 0;
            }

            colA++;

        }

        for(int i = 0 ; i < 60 ; i++) {
            if(tabela[i] == 1 && tabelaAposta[i] == 1) {
                acertos++;
            }
        }

        String msg;
        switch (acertos) {
            case 3 -> msg = "Você fez uma TRINCA!";
            case 4 -> msg = "Você fez uma QUADRA!";
            case 5 -> msg = "Você fez uma QUINA!";
            case 6 -> msg = "Você fez uma SENA!";
            default -> msg = "Você não ganhou nada!";
        }

        System.out.println("\n---------- RESULTADOS ----------\n");

        System.out.println("Você fez " + acertos + " acertos!" + msg);
    }
}
