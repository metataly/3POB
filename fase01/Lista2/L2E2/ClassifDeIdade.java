/*Exercício 2: Classificação de Idade
Descrição:
Escreva um programa que solicite a idade de uma pessoa e classifique-a em uma
das categorias abaixo, utilizando if-else:
• Menor de idade (menos de 18 anos)
• Adulto (entre 18 e 60 anos)
• Idoso (mais de 60 anos)*/

package fase01.Lista2.L2E2;

import java.util.Scanner;

public class ClassifDeIdade {
      public static void main(String[] args) {
        //variáveis
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma idade: ");
        int idade = scan.nextInt();


        if (idade < 18){
            System.out.println("Menor de idade!");
            scan.close();
        }
        else if (idade <= 60){
            System.out.println("Adulto");
            scan.close();
        }
        else {
            System.out.println("Idoso");
            scan.close();
        }
    }
}
