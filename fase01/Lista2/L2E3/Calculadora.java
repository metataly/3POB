/*Exercício 3: Calculadora Simples com switch-case
Descrição:
Crie um programa que simule uma calculadora simples, permitindo ao usuário
escolher uma operação matemática básica (+, -, *, /) e dois números.
Requisitos:
• O programa deve solicitar dois números e a operação desejada.
• Deve usar switch-case para executar a operação correspondente.
• Caso a operação não seja válida, exibir "Operação inválida.".
• Se a operação for divisão (/), verificar se o segundo número é zero antes de
calcular.*/

package fase01.Lista2.L2E3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //variáveis
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite dois valores: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        //"Limpar o buffer"
        //funciona lendo a próxima linha e limpando o proximo scan
        scan.nextLine();

        System.out.print("Digite a operação: \n[A] +\n[B] -\n[C] *\n[D] /");
        char operacao = scan.next().toUpperCase().charAt(0);
      
        int resultado = 0;

        switch (operacao) {
            case 'A':
                resultado = num1 + num2;
                break;

            case 'B':
                resultado = num1 - num2;
                break;
            
            case 'C':
                resultado = num1 * num2;
                break;

            case 'D':
                resultado = num1 / num2;

            default:
                System.out.print("Operação inválida!");
                break;
        }
        
        System.out.println("RESULTADO: " + resultado);
       
        scan.close();
    }
}
