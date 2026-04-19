package relacao;

public class Jogo {
    private String titulo;
    private String categoria;
    private int numMax;
    private int totalPartida;
    private String selo;

    public Jogo (String titulo, String categoria, int numMax) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.numMax = numMax;
        this.totalPartida = 0;
        this.selo = "Lançamento";
    }
    public void registrarPartida () {
        this.totalPartida++;
        if (totalPartida >= 20) selo = "Popular";
        else if (totalPartida >= 10) selo = "Moderado";
        else selo = "Pouco popular";
    }

    public String getTitulo () {
        return titulo;
    }

    public String getCategoria () {
        return categoria;
    }

    public int getNumMax () {
        return numMax;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria (String categoria) {
        this.categoria = categoria;
    }

    public void setNumMax (int numMax) {
        this.numMax = numMax;
    }
    void exibirDados () {
        System.out.println("Título: " + titulo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Número máximo de jogadores: " + numMax);
        System.out.println("Popularidade: " + selo);

    }
}
