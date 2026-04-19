package relacao;

public class Jogador {
    private String nickname;
    private Perfil perfil;

    public Jogador (String nickname, Perfil perfil) {
        this.nickname = nickname;
        this.perfil = perfil;
    }
    public void ganharXP (int xpGanho) {
        perfil.ganharXP(xpGanho);
    }

    public void exibirDados () {
        System.out.println("Nickname: " + nickname);
        perfil.exibirDados();
    }

    public String getNickname () {
        return nickname;
    }
    public Perfil getPerfil () {
        return perfil;
    }

}
