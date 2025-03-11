/*1: Maior e Menor Valor em um Array
Descrição:
Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
um array. Após isso, o programa deve exibir o maior e o menor número do array.
Requisitos:
• Criar um array de tamanho 5.
• Utilizar um loop for para percorrer o array e encontrar o maior e o menor
valor.
• Exibir o maior e o menor número armazenados no array.*/

package fase01.Lista4.L4E1;

import java.util.Scanner;

public class MaiorMenorValor {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[5];

        System.out.println("Insira um valor: ");
        vetor[0] = scan.nextInt();

        int menor = vetor[0];
        int maior = vetor[0];

        for(int i=1; i<5; i++){
            System.out.println("Insira um valor: ");
            vetor[i] = scan.nextInt();

            if (menor > vetor[i]){
                menor = vetor[i];
            }
            if(maior < vetor[i]){
                maior = vetor[i];
            }
        }


        for(int i=0; i<5; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);

        scan.close();
    }
}
