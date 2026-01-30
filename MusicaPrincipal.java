package MinhaAplicacao;

public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("BOTACARA");
        minhaMusica.setNome("Febem & Sain");
        minhaMusica.setDescricao("É uma musica de rap");
        minhaMusica.setAlbum("Highboyz");
        minhaMusica.setGenero("RAP");

        for (int i = 0; i <1200; i++){
            minhaMusica.contarTotalDeReproducoes();
        }
        for (int i = 0; i < 200; i++){
            minhaMusica.curtir();
        }
        minhaMusica.exibirFicha();


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDEV");
        meuPodcast.setNome("Matheus Saraiva Veloso");
        meuPodcast.setDescricao("Aqui a gente aborda sobre temas DEV para a galera que ta na área e para quem ta começando");

        for (int i = 0; i < 5000; i++){
            meuPodcast.contarTotalDeReproducoes();
        }
        for (int i = 0; i < 50; i++){
            meuPodcast.curtir();
        }
        meuPodcast.exibirFicha();

        Preferidas preferida = new Preferidas();
        preferida.incluir(minhaMusica);
        preferida.incluir(meuPodcast);
    }
}
