// Exercício realizado pelo online gdb, por isso a falta de pastas
// packege view
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
        ProdutoController controle = new ProdutoController();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Alterar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID do Produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade do Produto: ");
                    int quantidade = scanner.nextInt();
                    controle.adicionarProduto(id, nome, quantidade);
                    break;
                case 2:
                    controle.listarProdutos();
                    break;
                case 3:
                    System.out.print("ID do Produto a alterar: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarProduto(idAlterar);
                    break;
                case 4:
                    System.out.print("ID do Produto a excluir: ");
                    int idExcluir = scanner.nextInt();
                    controle.excluirProduto(idExcluir);
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
