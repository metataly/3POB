package excecoes.Ex02;

import java.util.Scanner;

public class LerNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;

        while (contador < 5) {
            System.out.printf("Digite o %d número inteiro: ", contador + 1);
            String entrada = scan.nextLine();

            try {
                numeros[contador] = scan.nextInt();
                contador++;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scan.nextLine();
            }
        }

        System.out.println("Números digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scan.close();
    }
}
