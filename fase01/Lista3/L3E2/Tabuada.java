/*Exercício 2: Tabuada de um número
Descrição:
Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.
Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração.*/

package fase01.Lista3.L3E2;

import java.util.Scanner;

public class Tabuada {
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        int num = scan.nextInt();

        int i = 1;
        int multiplo = num;

        while (i<=10){

            multiplo = num*i;

            System.out.println(num+ "x" +i+ " = " +multiplo);
            
            i++;
        }
        scan.close();
    }
}
