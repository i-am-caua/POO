package encapsulamento;

public class Evento {
    private String nome;
    private String data;
    private int numeroDeParticipantes;

    public void adicionarParticipante() {
        if (this.numeroDeParticipantes < 100) {
            this.numeroDeParticipantes++;
        }
    }

    public void removerParticipante() {
        if (this.numeroDeParticipantes > 0) {
            this.numeroDeParticipantes--;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data != null && !data.trim().isEmpty()) {
            this.data = data;
        }
    }

    public int getNumeroDeParticipantes() {
        return numeroDeParticipantes;
    }

    public void setNumeroDeParticipantes(int numeroDeParticipantes) {
        if (numeroDeParticipantes >= 0 && numeroDeParticipantes <= 100) {
            this.numeroDeParticipantes = numeroDeParticipantes;
        }
    }

    public static void main(String[] args) {
        Evento evento = new Evento();
        evento.setNome("Conferência de Java");
        evento.setData("13/04/2026");
        evento.adicionarParticipante();
        evento.adicionarParticipante();
        System.out.println("Evento: " + evento.getNome() + " em " + evento.getData());
        System.out.println("Participantes: " + evento.getNumeroDeParticipantes());
    }
}
