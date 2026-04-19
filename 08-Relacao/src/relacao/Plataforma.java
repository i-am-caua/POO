package relacao;
import java.util.ArrayList;

public class Plataforma {
    private String nome;
    private ArrayList<SalaDeJogo> salas;

    public Plataforma (String nome) {
        this.nome = nome;
        this.salas = new ArrayList<>();
    }
    public void adicionarSala (SalaDeJogo sala) {
        salas.add(sala);
    }
    public void exibirDados () {
        System.out.println("Nome da Plataforma: " + nome);
        System.out.println("Salas de Jogo:");
        for (SalaDeJogo sala : salas) {
            sala.exibirDados();
            System.out.println();
        }
    }
}
