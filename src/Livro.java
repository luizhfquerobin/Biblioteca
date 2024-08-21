public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private String genero;

    public Livro() {
    }

    public Livro(String titulo, String autor, Integer anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " - Autor: " + autor + " - Ano de Publicação: " + anoPublicacao + " - Gênero: " + genero;
    }
}
