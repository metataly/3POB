package fase06.L6E2.controller;

import java.util.Scanner;
import fase06.L6Exercicio02.dominio.Funcionario;

public class GerenciarFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cadastro:");
        System.out.print("Informe o nome:");
        String nome = scan.nextLine();

        System.out.print("Qual é o seu salário base?: ");
        double salarioBase = scan.nextDouble();

        scan.nextLine();

        System.out.print("Categoria (A, B ou C): ");
        String categoria = scan.nextLine().toUpperCase();
        System.out.println("\n\n");

        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário base: " + funcionario.getSalarioBase());
        System.out.println("Salario final: " + funcionario.calcularSalarioFinal());
        scan.close();
    }
}