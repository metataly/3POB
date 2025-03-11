/*Exercício 1: Verificação de Número Par ou Ímpar
Descrição:
Crie um programa que solicite um número inteiro ao usuário e determine se ele é
par ou ímpar, utilizando a estrutura if-else.
Requisitos:
• O programa deve ler um número inteiro.
• Se o número for divisível por 2, exibir "O número é par."
• Caso contrário, exibir "O número é ímpar.".*/

package fase01.Lista2.L2E1;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        //variáveis
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = scan.nextInt();


        if (num%2 == 0){
            System.out.println( num + "é um numero par!");
            scan.close();
        }
        else {
            System.out.println( num + "é um numero Impar!");
            scan.close();
        }
    }
}