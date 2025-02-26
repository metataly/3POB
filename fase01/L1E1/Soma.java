/*Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles.*/

package fase01.L1E1;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        //variáveis
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int num1 = scan.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.print("A soma dos valores é: " + soma);
        scan.close();
    }
}
