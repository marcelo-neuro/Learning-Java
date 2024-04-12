package br.com.neuro.modelos;

public class Forca {
    private String palavra;
    private int maxErros;
    private int erros;
    private boolean[] acertos;

    public Forca() {
        this.palavra = Dicionario.getPalavra();
        maxErros = 6;
        acertos = new boolean[palavra.length()];
        chuta(' ');
        erros = 0;
    }

    public void chuta(char letra) {
        boolean achou = false;
        for(int l = 0; l < palavra.length(); l++) {
            if(letra == palavra.toLowerCase().charAt(l)) {
                achou = true;
                acertos[l] = true;
            }
        }
        if(!achou) erros++;
    }

    public boolean enforcou() {
        return erros >= maxErros;
    }

    public boolean acertou() {
        for(int l = 0; l < acertos.length; l++) {
            if(!acertos[l]) return false;
        }
        return true;
    }

    public String getPalavraAberta() {
        return palavra;
    }

    public String getPalavraFechada() {
        String palavra = "";
        for(int l = 0; l < acertos.length; l++) {
            if(acertos[l])
                palavra += this.palavra.charAt(l) + " ";
            else
                palavra += "_ ";
        }

        return palavra;
    }

    public int getErros() {
        return erros;
    }
}
