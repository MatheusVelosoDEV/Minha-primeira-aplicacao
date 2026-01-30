package MinhaAplicacao;

public class Preferidas {
    public void incluir(Audio audio){
        if(audio.classificacao() >= 9){
            System.out.println(audio.getTitulo() + " é um sucesso");
        } else {
            System.out.println(audio.getTitulo() + " é um ótimo título");
        }
    }
}
