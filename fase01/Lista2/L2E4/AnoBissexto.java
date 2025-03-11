/*Exercício 4: Verificação de Ano Bissexto

Descrição:
Desenvolva um programa que leia um ano e verifique se ele é bissexto ou não,
utilizando if-else.
Critérios para ser bissexto:
• Deve ser divisível por 4.
• Se for divisível por 100, deve também ser divisível por 400.*/

package fase01.Lista2.L2E4;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        //variáveis
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int num = scan.nextInt();


        if ((num%4 == 0) && (num%100 == 0) && (num%400 == 0)){

            System.out.println( num + " é um ano bissexto!");
            scan.close();
            
        }
        else {
            System.out.println( num + " NÃO é um ano bissexto!");
            scan.close();
        }
    }
}
