package relacao;
import java.util.ArrayList;

public class Perfil {
    private String nome;
    private String rank;
    private int xp;
    private ArrayList <String> conquista;

    private static final int XPMAX = 10000;

    public Perfil (String nome) {
        this.nome = nome;
        this.rank = "Bronze";
        this.conquista = new ArrayList<>();
        this.xp = 0;
    }
    public void ganharXP (int xpGanho) {
        if (this.xp >= XPMAX) {return;}
        this.xp += xpGanho;
        atualizarRank();
    }
    private void atualizarRank () {
        if (this.xp >= XPMAX && this.rank.equals("Prata")) {
            this.rank = "Ouro";
            addConquista("Chegou ao nível Ouro");
            this.xp = XPMAX;
        }
        // && serve para subir o nivel somente uma vez
        else if (xp >= 1000 && this.rank.equals("Bronze")) {
            this.rank = "Prata";
            addConquista("Chegou ao nível Prata");
        }
    }
    public String getNome () {
        return nome;
    }
    public ArrayList <String> getConquista () {
        return conquista;
    }
    public String getRank () {
        return rank;
    }
    public int getXp () {
        return xp;
    }
    public void addConquista (String conquista) {
        this.conquista.add(conquista);
    }
    //set aqui não faz tanto sentido, pois o jogador não pode mudar
    //essas informações, mas o exc pede.
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setRank (String rank) {
        this.rank = rank;
    }
    public void setXp (int xp) {
        this.xp = xp;
    }
    public void setConquista (ArrayList <String> conquista) {
        this.conquista = conquista;
    }


    void exibirDados () {
        System.out.println ("Nome: " + nome);
        if (conquista.isEmpty()) {
            System.out.println ("Nenhuma conquista obtida.");
        } else {
            System.out.println ("Conquistas:" + conquista);
        }
        System.out.println ("Rank: " + rank);
    }
}
