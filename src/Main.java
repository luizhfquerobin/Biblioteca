import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean rodando = true;
        int opcao;
        while (rodando) {
            System.out.println("----------------------");
            SistemaPrincipal.exibirMenu();
            opcao = scan.nextInt();
            System.out.println("----------------------");
            rodando = SistemaPrincipal.executar(opcao);
        }
    }
}
