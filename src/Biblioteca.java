import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaDeLivros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        this.listaDeLivros.add(livro);
    }

    public void listarLivros() {
        if (this.listaDeLivros.isEmpty()) {
            System.out.println("Biblioteca vazia!");
        } else {
            for (Livro l : this.listaDeLivros) {
                System.out.println(l.toString());
            }
        }
    }

    public void buscarLivroPorTitulo(String titulo) {
        boolean existe = false;
        for (Livro l : this.listaDeLivros) {
            if ((l.getTitulo().contains(titulo.toLowerCase())) || (l.getTitulo().contains(titulo.toUpperCase()))) {
                System.out.println(l);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("Nenhum livro encontrado!");
        }
    }

    public void removerLivroPorTitulo(String titulo) {
        if (!this.listaDeLivros.removeIf(l -> l.getTitulo().equals(titulo))) {
            System.out.println("Livro não encontrado! Nenhum livro removido.");
        } else {
            System.out.println("Livro removido!");
        }
    }
}
