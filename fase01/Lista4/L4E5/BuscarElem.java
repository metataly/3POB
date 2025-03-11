/*Busca de Elemento em um Array
Descrição:
Implemente um programa que solicite ao usuário 10 números inteiros e os
armazene em um array. Em seguida, o usuário deve digitar um número para buscar
no array. O programa deve informar se o número está presente e em qual posição.
Requisitos:
• Criar um array de tamanho 10.
• Solicitar um número ao usuário e verificar se ele está presente no array.
• Se o número for encontrado, exibir sua posição. Caso contrário, exibir
"Número não encontrado.".*/
package fase01.Lista4.L4E5;

import java.util.Scanner;

public class BuscarElem {
    public static final int TAM = 10;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[TAM];

        System.out.println("Digite 10 números Inteiros!");
        for (int i=0; i<TAM; i++) {

            System.out.print("Digite um numero: ");
            vetor[i] = scan.nextInt();
        }

        System.out.print("\nDigite um número para buscar no Vetor: ");
        int busca = scan.nextInt();

        // Buscando numero
        int verif = 0;
        for (int i = 0; i < TAM; i++) {

            if (vetor[i] == busca) {
                System.out.println("Numero encontrado na posição: " + i);
                verif = 1;
                break;
            }
        }

        if (verif == 0) {
            System.out.println("Numero não encontrado.");
        }

        scan.close();
    }
}
