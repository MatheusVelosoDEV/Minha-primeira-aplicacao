package MinhaAplicacao;

public class Musica extends Audio implements Classificavel{
    private String album;
    private String artista;
    private String genero;

    //setters e getters
    @Override
    public int classificacao() {
        if (this.getTotalDeReproducoes() > 1000) {
        return 5;
        }  else if (this.getTotalDeReproducoes() > 600) {
            return 4;
        }
            else if (this.getTotalDeReproducoes() > 500){
                return 3;
        }
            else if (this.getTotalDeReproducoes() > 300){
                return 2;
        }
            else {
                return 1;
        }
    }
    //getters
    public String getAlbum(){
        return this.album;
    }
    public String getArtista(){
        return this.artista;
    }
    public String getGenero(){
        return this.genero;
    }
    //setters
    public void setAlbum (String album){
        this.album = album;
    }
    public void setArtista (String artista){
        this.artista = artista;
    }
    public void setGenero (String genero){
        this.genero = genero;
    }
}
