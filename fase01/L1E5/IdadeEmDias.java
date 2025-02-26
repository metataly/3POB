/*Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade 
    aproximada de dias que ela já viveu.
    Considere um ano com 365 dias. */

package fase01.L1E5;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        int dias = idade*365;

        System.out.print("A conversão da idade: " + idade + " em dias é: " + dias);
        scan.close();
    }
}
