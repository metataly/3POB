package controller;

import java.util.ArrayList;
import java.util.Scanner;

import domain.Caminhao;
import domain.Carro;
import domain.Moto;
import domain.Veiculo;

public class VeiculoController {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opcao;
    
        do {
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");

            opcao = scan.nextInt();
            scan.nextLine();
    
            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de veículo:");
                    System.out.println("1 - Moto");
                    System.out.println("2 - Carro");
                    System.out.println("3 - Caminhão");
                    
                    int tipo = scan.nextInt();
                    scan.nextLine(); // limpar buffer

                    System.out.print("placa: ");
                    String placa = scan.nextLine();
                    System.out.print("modelo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Ano: ");
                    int ano = scan.nextInt();
                    scan.nextLine();

                    switch (tipo) {
                        case 1:
                            System.out.print("Cilindradas: ");
                            int cilindradas = scan.nextInt();
                            veiculos.add(new Moto(placa, modelo, ano, cilindradas));
                            break;
                        case 2:
                            System.out.print("Quantidade de portas: ");
                            int portas = scan.nextInt();
                            veiculos.add(new Carro(placa, modelo, ano, portas));
                            break;
                        case 3:
                            System.out.print("Capacidade de carga: ");
                            double carga = scan.nextDouble();
                            veiculos.add(new Caminhao(placa, modelo, ano, carga));
                            break;
                        default:
                            System.out.println("Tipo inválido.");
                        break;
                    }
                    break;

                case 2:
                    if (veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else {
                        System.out.println("\nVeículos cadastrados:");
                        for (Veiculo v : veiculos) {
                            v.exibirDados();
                            System.out.println("-----------------");
                        }
                    }
                break;

                case 3:
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção inválida.");
                break;
            }

        } while (opcao != 3);

        scan.close();
    }
}

