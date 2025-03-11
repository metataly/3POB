/*Contagem regressiva usando do-while
Descrição:
Crie um programa que solicite um número ao usuário e faça uma contagem
regressiva até 0, utilizando um loop do-while.
Requisitos:
• O programa deve solicitar um número inteiro positivo ao usuário.
• Utilizar um contador decrescente para reduzir o valor até 0.
• Exibir os números da contagem regressiva um por um.*/

package fase01.Lista3.L3E3;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um numero inteiro positivo: ");
        int num = scan.nextInt();

        do{
            System.out.println(num +"");

            num--;

        } while (num >= 0);

        scan.close();
    }
}
