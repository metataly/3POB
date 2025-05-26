import java.util.Scanner;
import arquivos.contoller.AlunoController;
import arquivos.entity.Aluno;

public class Main {
    public static void main(String[] args) {
        ControlaAluno controle = new ControlaAluno();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Alterar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID do Aluno: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Nome do Aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Nota do Aluno: ");
                    double nota = scanner.nextDouble();
                    controle.adicionarAluno(id, nome, nota);
                    break;
                case 2:
                    controle.listarAlunos();
                    break;
                case 3:
                    System.out.print("ID do Aluno a alterar: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarAluno(idAlterar);
                    break;
                case 4:
                    System.out.print("ID do Aluno a excluir: ");
                    int idExcluir = scanner.nextInt();
                    controle.excluirAluno(idExcluir);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
