/*Exercício 1: Soma dos N primeiros números naturais
Descrição:
Crie um programa que solicite ao usuário um número N e utilize um loop for
para calcular a soma dos primeiros N números naturais.
Requisitos:
• O programa deve utilizar um contador para iterar de 1 até N.
• Deve utilizar um acumulador para somar os valores sucessivos.
• Ao final, exibir a soma total.*/

package fase01.Lista3.L3E1;

import java.util.Scanner;

public class SomarNvezes {
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int num = scan.nextInt();

        int soma = 0;

        for(int i=1; i<=num; i++){
           soma+=i;
        }

        System.out.print("A soma dos valores de 1 a " +num+ "=> " +soma);
        scan.close();

    }
}