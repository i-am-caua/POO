package relacao;

public class SalaDeJogo {
    private Jogo jogo;
    private Jogador[] jogadores;
    private int numJogadores;
    private boolean jogoEmAndamento;

    public SalaDeJogo (Jogo jogo) {
        this.jogo = jogo;
        this.jogadores = new Jogador[jogo.getNumMax()];
        this.numJogadores = 0;
        this.jogoEmAndamento = false;
    }
    public void adicionarJogador (Jogador jogador) {
        if (jogoEmAndamento) {
            System.out.println("O jogo já está em andamento. Não é possível adicionar mais jogadores.");
            return;
        }
        if (numJogadores < jogo.getNumMax()) {
            jogadores[numJogadores] = jogador;
            numJogadores++;
            System.out.println("Jogador adicionado com sucesso!");
            return;
        }
        System.out.println("A sala está cheia. Não é possível adicionar mais jogadores.");
    }
    public void iniciarPartida () {
        if (numJogadores == 0) {
            System.out.println ("Não há jogadores na sala.");
            return;
        }
        if (jogoEmAndamento) {
            System.out.println("O jogo já está em andamento.");
            return;
        }
        jogoEmAndamento = true;
        System.out.println("Partida iniciada!");
        jogo.registrarPartida();
    }
    public void finalizarPartida () {
        if (!jogoEmAndamento) {
            System.out.println("O jogo não está em andamento.");
            return;
            }
        jogoEmAndamento = false;
        System.out.println("Partida finalizada!");
        for (Jogador jogador : jogadores) {
            jogador.ganharXP(10000);
        }
        jogadores = new Jogador[0];
    }
    public void exibirJogadores () {
        if (numJogadores == 0) System.out.println("Não há jogadores na sala.");
        for (int i = 0; i < numJogadores; i++) {
            System.out.println("- " + jogadores[i].getNickname());
        }
    }
    public void exibirDados () {
        System.out.println("Título do jogo: " + jogo.getTitulo());
        System.out.println("Categoria do jogo: " + jogo.getCategoria());
        System.out.println("Número máximo de jogadores: " + jogo.getNumMax());
        System.out.println("Número de jogadores na sala: " + numJogadores);
        System.out.println("Jogadores na sala:");
        exibirJogadores();
        }
    public Jogo getJogo () {
        return jogo;
    }
    public Jogador[] getJogadores () {
        return jogadores;
    }
    public int getNumJogadores () {
        return numJogadores;
    }



}
