package projetomusicas.modelos;

import projetomusicas.interfaces.Classificavel;

public class Musica extends Audio implements Classificavel {

    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, int minutos, int segundos, String artista, String album, String genero)  {
        this.setTitulo(titulo);
        this.setDuracao(minutos, segundos);
        this.setArtista(artista);
        this.setAlbum(album);
        this.setGenero(genero);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getNota() {
        return ((double) this.getTotalReproducoes() / 100);
    }
}
