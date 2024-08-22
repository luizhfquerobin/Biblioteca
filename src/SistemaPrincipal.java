import java.util.Scanner;

public class SistemaPrincipal {

    static Scanner scan = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();

    static public void exibirMenu() {
        System.out.println("1 - Adicionar livro\n2 - Listar Livros\n3 - Buscar Livro Por Título\n4 - Remover Livros por Título\n5 - Sair\nDigite o número da opção que deseja executar: ");
    }

    static public boolean executar(int opcao) {
        if (opcao == 1) {
            Livro livro = new Livro();
            System.out.println("Digite o título do livro: ");
            livro.setTitulo(scan.nextLine());
            System.out.println("Digite o autor do livro: ");
            livro.setAutor(scan.nextLine());
            System.out.println("Digite o ano de publicação do livro: ");
            String ano = scan.nextLine();
            if (ano.chars().allMatch(Character::isDigit)) {
                livro.setAnoPublicacao(Integer.valueOf(ano));
            } else {
                System.out.println("----------------------");
                System.out.println("O ano de publicação deve ser um número inteiro.");
                return true;
            }
            scan.nextLine();
            System.out.println("Digite o gênero do livro: ");
            livro.setGenero(scan.nextLine());
            biblioteca.adicionarLivro(livro);
        } else if (opcao == 2) {
            biblioteca.listarLivros();
        } else if (opcao == 3) {
            System.out.println("Digite o título ou uma parte do título do livro: ");
            biblioteca.buscarLivroPorTitulo(scan.nextLine());
        } else if (opcao == 4) {
            System.out.println("Digite o título do livro: ");
            biblioteca.removerLivroPorTitulo(scan.nextLine());
        } else if (opcao == 5) {
            System.out.println("Fim da execução. Até a próxima!");
            return false;
        }
        return true;
    }
}
