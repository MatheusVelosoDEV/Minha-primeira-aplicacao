package MinhaAplicacao;

public class Podcast extends Audio implements Classificavel{
    private String host;
    private String participantes;
    private String descricaoDoTema;

    //metodos
    @Override
    public int classificacao(){
        if(this.getTotalCurtidas() > 1000){
            return 5;
        } else if(this.getTotalCurtidas() > 700){
            return 4;
        } else if(this.getTotalCurtidas() > 500){
            return 3;
        } else if(this.getTotalCurtidas() > 300){
            return 2;
        } else {
            return 1;
        }
    }

    //getters
    public String getHost(){
        return this.host;
    }
    public String getParticipantes(){
        return this.participantes;
    }
    public String getDescricaoDoTema(){
        return this.descricaoDoTema;
    }
    //setters
    public void setHost(String host){
        this.host = host;
    }
    public void setParticipantes(String participantes){
        this.participantes = participantes;
    }
    public void setDescricaoDoTema(String descricaoDoTema){
        this.descricaoDoTema = descricaoDoTema;
    }


}
