package arquivos.controller;
import arquivos.entity.Aluno;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoController {
    private ArrayList<Aluno> alunos;
    private final String arquivoAlunos = "alunos.txt";

    public AlunoController() {
        this.alunos = new ArrayList<>();
        carregarAlunos(); //cria o arquivo
    }

    //CRUD DO ARRAYLIST
    public void adicionar(int matricula, String nome, double coeficienteRendimento) {
        Aluno novoAluno = new Aluno(matricula, nome, coeficienteRendimento);
        alunos.add(novoAluno);
        salvarAlunos();
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void listarTodos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                aluno.listarUm();
            }
        }
    }

    public void alterar(int matricula) {
        Aluno aluno = buscarAluno(matricula);
        if (aluno != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo nome do aluno: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo CR do aluno: ");
            double novoCr = scanner.nextDouble();
            scanner.close();
            
            produto.setNome(novoNome);
            produto.setValor(novoCr);
            salvarAlunos();
            System.out.println("Aluno alterado com sucesso!");
        } else {
            System.out.println("Aluno de matricula " + matricula + " não encontrado.");
        }
    }

    public void excluir(int matricula) {
        Aluno aluno = buscarAluno(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            salvarAlunos();
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno de matricula " + matricula + " não encontrado.");
        }
    }

    private Aluno buscarAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    // CRUD DO ARQUIVO
    private void salvarAlunos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoAlunos))) {
            for (Aluno aluno : alunos) {
                writer.write(aluno.getMatricula() + ";" + aluno.getNome() + ";" + aluno.getCoeficienteRendimento());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos: " + e.getMessage());
        }
    }

    
    private void carregarAlunos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoAlunos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                double cr = Double.parseDouble(dados[2]);
                produtos.add(new Produto(matricula, nome, cr));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de Alunos não encontrado. Será criado ao salvar novos Alunos.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar Alunos: " + e.getMessage());
        }
    }

}