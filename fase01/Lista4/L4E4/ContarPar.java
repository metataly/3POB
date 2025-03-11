/*4: Contagem de Números Pares em um Array

Descrição:
Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em
um array. O programa deve contar e exibir a quantidade de números pares no
array.
Requisitos:
• Criar um array de tamanho 8.
• Utilizar um loop for para percorrer o array e contar quantos números são
pares.
• Exibir a quantidade de números pares encontrados.*/

package fase01.Lista4.L4E4;

import java.util.Scanner;

public class ContarPar {
    public static final int TAM = 8;
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[TAM];

        System.out.println("\nPor Favor, insira 8 numeros Inteiros!");


        for(int i=0; i<TAM; i++){
            System.out.print("Insira um numero: ");
            vetor[i] = scan.nextInt();

        }

        System.out.println("--------------");

        int cont = 0;
        for(int i=0; i<TAM; i++){
            if(vetor[i]%2==0){
                cont++;
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.print("Existem "+cont+ " valores pares nesse vetor!");
        scan.close();
    }
}
