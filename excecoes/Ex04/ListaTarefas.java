import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa por índice");
            System.out.println("3 - Exibir todas as tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scan.nextInt();
                scanner.nextLine(); // Limpa o \n

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a tarefa: ");
                        String tarefa = scan.nextLine();
                        tarefas.add(tarefa);
                        System.out.println("Tarefa adicionada com sucesso.");
                        break;
                    case 2:
                        if (tarefas.isEmpty()) {
                            System.out.println("Nenhuma tarefa para remover.");
                            break;
                        }

                        System.out.print("Digite o índice da tarefa a remover: ");
                        int indice = scan.nextInt();
                        scan.nextLine(); // Limpa o \n

                        if (indice >= 0 && indice < tarefas.size()) {
                            String removida = tarefas.remove(indice);
                            System.out.println("Tarefa \"" + removida + "\" removida.");
                        } else {
                            System.out.println("Erro: Índice inválido.");
                        }
                        break;
                    case 3:
                        System.out.println("\n--- Lista de Tarefas ---");
                        if (tarefas.isEmpty()) {
                            System.out.println("Nenhuma tarefa cadastrada.");
                        } else {
                            for (int i = 0; i < tarefas.size(); i++) {
                                System.out.println(i + " - " + tarefas.get(i));
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número válido.");
                scan.nextLine(); // Limpa o buffer
            }
        }

        scan.close();
    }
}
