// Pacote controle
package fase06.L6E1.controller;

import dominio.ContaBancaria;
import java.util.Scanner;

public class GerenciadorConta {
    public static void main(String[] args) {
        Scanner scan = new scan(System.in);
        ContaBancaria conta = null;
        
        // Menu de opções
        while (true) {
            System.out.println("\nControle de Conta Bancária");
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (conta == null) {
                        scan.nextLine();  // Limpar o buffer de entrada
                        System.out.print("Digite o nome do titular: ");
                        String titular = scan.nextLine();
                        conta = new ContaBancaria(titular);
                        System.out.println("Conta criada com sucesso!");
                    } else {
                        System.out.println("Conta já foi criada.");
                    }
                    break;

                case 2:
                    if (conta != null) {
                        System.out.print("Digite o valor a ser depositado: ");
                        double valorDeposito = scan.nextDouble();
                        conta.depositar(valorDeposito);
                    } else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;

                case 3:
                    if (conta != null) {
                        System.out.print("Digite o valor a ser sacado: ");
                        double valorSaque = scan.nextDouble();
                        conta.sacar(valorSaque);
                    } else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;

                case 4:
                    if (conta != null) {
                        conta.exibirSaldo();
                    } else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo... Até logo!");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
