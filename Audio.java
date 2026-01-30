package MinhaAplicacao;

public class Audio implements Classificavel {
    //atributos
    private String nome; // nome do artista(s)
    private String descricao; //descricao do artista
    private String titulo; //titulo do ep ou da musica
    private int totalCurtidas;
    private int totalDeReproducoes;

    //metodos
    public void curtir(){
        this.totalCurtidas++;
    }
    public void contarTotalDeReproducoes(){
        this.totalDeReproducoes++;
    }
    public void exibirFicha(){
        System.out.println("Titulo " + titulo);
        System.out.println("Nome " + nome);
        System.out.println("Descrição " + descricao);
        System.out.println("O total de visualizacões é: " + totalDeReproducoes);
        System.out.println("O total de curtidas é: " + totalCurtidas);

    }
    //getters
    public String getNome(){
        return this.nome;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public int getTotalCurtidas(){
        return this.totalCurtidas;
    }
    public int getTotalDeReproducoes(){
        return this.totalDeReproducoes;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setTotalCurtidas(int totalCurtidas){
        this.totalCurtidas = totalCurtidas;
    }
    public void setTotalDeReproducoes(int totalDeReproducoes){
        this.totalDeReproducoes = totalDeReproducoes;
    }

    @Override
    public int classificacao() {
        return 0;
    }
}
