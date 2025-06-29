//packege controller

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoController {
   private ArrayList<Produto> produtos;

    public ProdutoController() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome, int quantidade) {
        Produto produto = new Produto(id, nome, quantidade);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                produto.listarProduto();
            }
        }
    }

    public void alterarProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo nome do produto: ");
            String novoNome = scanner.nextLine();
            System.out.print("Nova quantidade do produto: ");
            int novaQuant = scanner.nextInt();
            scanner.close();

            produto.setNome(novoNome);
            produto.setQuantidade(novaQuant);
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    public void excluirProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
