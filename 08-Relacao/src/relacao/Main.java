package relacao;

public class Main {
    public static void main (String[] args) {
        Plataforma steam = new Plataforma ("Steam");
        Perfil caua = new Perfil ("Cauã");
        Jogador cauaJogador = new Jogador ("Xaolin Matador", caua);
        Jogo tigrinho = new Jogo ("Tigrinho", "Aposta", 1);
        SalaDeJogo tigrinhoSala = new SalaDeJogo (tigrinho);
        steam.adicionarSala (tigrinhoSala);
        tigrinhoSala.adicionarJogador (cauaJogador);
        System.out.println("\n---------------------\n");
        tigrinhoSala.iniciarPartida ();
        System.out.println("\n---------------------\n");
        tigrinhoSala.exibirDados ();
        System.out.println("\n---------------------\n");
        cauaJogador.exibirDados ();
        System.out.println("\n---------------------\n");
        tigrinhoSala.finalizarPartida();
        System.out.println("\n---------------------\n");
        tigrinho.exibirDados ();
        System.out.println("\n---------------------\n");
        caua.exibirDados ();


    }
}
