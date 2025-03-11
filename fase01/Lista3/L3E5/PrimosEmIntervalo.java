/*Números primos em um intervalo
Descrição:
Escreva um programa que solicite dois números ao usuário e exiba todos os
números primos no intervalo entre eles, utilizando um loop aninhado (for
dentro de for).
Requisitos:
• O programa deve solicitar dois números inteiros positivos (início e fim
do intervalo).
• Deve utilizar um loop externo para percorrer os números dentro do
intervalo.
• Deve utilizar um loop interno para verificar se cada número é primo.
• Exibir apenas os números primos encontrados.*/

package fase01.Lista3.L3E5;

import java.util.Scanner;

public class PrimosEmIntervalo {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um intervalo [a<b]:");
        int inicio = scan.nextInt();
        int fim = scan.nextInt();

        System.out.println("-------------------");
        
        if(inicio == 1){
            System.out.print("1 ");
        }

        for (int i=inicio; i<=fim; i++){ //20 - 30
    
            int cont = 0;

            for (int j=1; j<=fim; j++){ //23, 29
                if(i%j==0){
                    cont++;
                }
                if(cont>2){
                    break;
                }
            }

            if(cont==2){
                System.out.print(i+ " ");
            }
        }

        scan.close();
    }
}
