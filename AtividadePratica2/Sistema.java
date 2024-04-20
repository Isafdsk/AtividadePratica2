import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static Scanner scanner = new Scanner(System.in);

    public static void cadastrarPessoa(ArrayList<Pessoa> pessoas) {
    public class Funcionario {
    private String nome;
    private int idade;
    
    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

    public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

public class Diretor extends Funcionario {

    public Diretor(String nome, int idade) {
        super(nome, idade);
    }
}

public class Coordenador extends Funcionario {
    private String curso;

    public Coordenador(String nome, int idade) {
        super(nome, idade);
    }
}
    }

    public static void buscarPessoa(ArrayList<Pessoa> pessoas) {
        System.out.println("BUSCA DE PESSOA");
        System.out.print("Digite o nome da pessoa: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrou = false;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Pessoa encontrada:");
                System.out.println(pessoa);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Pessoa não encontrada.");
        }
    }
}

    public static void editarPessoa(ArrayList<Pessoa> pessoas) {
        System.out.println("EDIÇÃO DE PESSOA");
        System.out.print("Digite o nome da pessoa que deseja editar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrou = false;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Pessoa encontrada:");
                System.out.println(pessoa);

                System.out.println("Digite as novas informações:");
                System.out.print("Novo nome: ");
                String novoNome = scanner.nextLine();
                System.out.print("Nova idade: ");
                int novaIdade = scanner.nextInt();

                pessoa.setNome(novoNome);
                pessoa.setIdade(novaIdade);

                System.out.println("Pessoa atualizada com sucesso!");
                encontrou = true;
                break;
            }

        if (!encontrou) {
            System.out.println("Pessoa não encontrada.");
        }
    }
    }

    public static void excluirPessoa(ArrayList<Pessoa> pessoas) {
        System.out.println("EXCLUSÃO DE PESSOA");
        System.out.print("Digite o nome da pessoa que deseja excluir: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrou = false;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Pessoa encontrada:");
                System.out.println(pessoa);

                System.out.print("Tem certeza que deseja excluir esta pessoa? (Sim/Não): ");
                String confirmacao = scanner.nextLine();
                if (confirmacao.equalsIgnoreCase("Sim")) {
                    pessoas.remove(pessoa);
                    System.out.println("Pessoa excluída com sucesso!");
                } else {
                    System.out.println("Exclusão cancelada.");
                }

                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public static void listarPessoas(ArrayList<Pessoa> pessoas) {
        System.out.println("LISTAGEM DE PESSOAS");
        
        if (pessoas.isEmpty()) {
            System.out.println("Não tem pessoas cadastradas.");
        } else {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
    }

    public static void excluirTodasPessoas(ArrayList<Pessoa> pessoas) {
        System.out.println("EXCLUSÃO DE TODAS AS PESSOAS");
        
        if (pessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastradas");
        } else {
            pessoas.clear();
            System.out.println("Todas as pessoas foram excluídas");
        }
    }