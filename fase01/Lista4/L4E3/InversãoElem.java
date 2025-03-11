/*Inversão de Elementos de um Array
Descrição:
Escreva um programa que solicite ao usuário 6 números inteiros e os armazene
em um array. Em seguida, exiba os números na ordem inversa à de entrada.
Requisitos:
• Criar um array de tamanho 6.
• Utilizar um loop for para preencher o array.
• Utilizar outro loop for para exibir os elementos na ordem inversa.*/

package fase01.Lista4.L4E3;

import java.util.Scanner;

public class InversãoElem {
    public static final int TAM = 6;
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[TAM];

        System.out.println("\nPor Favor, insira 6 numeros Inteiros!");


        for(int i=0; i<TAM; i++){
            System.out.print("Insira um numero: ");
            vetor[i] = scan.nextInt();

        }

        System.out.println("--------------");

        //Vetor normal
        for(int i=0; i<TAM; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n--------------");
        //vetor Invertido
        for(int i=TAM-1; i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
        
        scan.close();
    }
}
