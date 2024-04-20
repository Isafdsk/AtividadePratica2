import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        int opcao;
        do {
            System.out.println("MENU");
            System.out.println("1. Cadastrar");
            System.out.println("2. Buscar");
            System.out.println("3. Editar");
            System.out.println("4. Excluir");
            System.out.println("5. Listar");
            System.out.println("6. Excluir todos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    Sistema.cadastrarPessoa(pessoas);
                    break;
                case 2:
                    Sistema.buscarPessoa(pessoas);
                    break;
                case 3:
                    Sistema.editarPessoa(pessoas);
                    break;
                case 4:
                    Sistema.excluirPessoa(pessoas);
                    break;
                case 5:
                    Sistema.listarPessoas(pessoas);
                    break;
                case 6:
                    Sistema.excluirTodasPessoas(pessoas);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}