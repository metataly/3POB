/*Exercício 5: Conversão de Notas para Conceito
Descrição:
Escreva um programa que leia uma nota de 0 a 10 e exiba o conceito
correspondente, utilizando switch-case.
Tabela de Conceitos:
• 9 a 10 → A
• 7 a 8 → B
• 5 a 6 → C
• 3 a 4 → D
• 0 a 2 → E
Requisitos:
• Se a nota estiver fora do intervalo 0 a 10, exibir "Nota inválida.".*/

package fase01.Lista2.L2E5;

import java.util.Scanner;

public class ConversaoNota {
    public static void main(String[] args) {
        //variáveis
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        int num = scan.nextInt();

        switch (num) {
            case 0:
                case 1:
                    case 2:
                        System.out.print(num + " equivale a nota E");
                    break;
            case 3:
                case 4:
                     System.out.print(num + " equivale a nota D");
                break;
            case 5:
                case 6:
                    System.out.print(num + " equivale a nota C");
                break;
            case 7:
                case 8:
                    System.out.print(num + " equivale a nota B");
                break;
            case 9:
                case 10:
                    System.out.print(num + " equivale a nota A");
                break;
            default:
                System.out.print("Nota inválida!");
            break;

        }
        

        scan.close();
    }
}
