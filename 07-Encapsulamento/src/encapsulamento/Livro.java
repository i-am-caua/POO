package encapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
        }
    }

    public void devolver() {
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("1984");
        livro.setAutor("George Orwell");
        System.out.println("Livro: " + livro.getTitulo() + " - Disponível: " + livro.isDisponivel());
        livro.emprestar();
        System.out.println("Após emprestar - Disponível: " + livro.isDisponivel());
        livro.devolver();
        System.out.println("Após devolver - Disponível: " + livro.isDisponivel());
    }
}
