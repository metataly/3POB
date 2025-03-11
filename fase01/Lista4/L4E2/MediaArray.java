/*2: Cálculo da Média de Notas
Descrição:
Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as
em um array. Depois, o programa deve calcular e exibir a média das notas.
Requisitos:
• Criar um array de tamanho 4 para armazenar as notas.
• Utilizar um loop for para somar todas as notas e calcular a média.
• Se a média for maior ou igual a 7, exibir "Aprovado", senão, exibir
"Reprovado".*/

package fase01.Lista4.L4E2;

import java.util.Scanner;

public class MediaArray {
    //Uma constante, fazendo o papel de #define
    public static final int TAM = 4;
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        double vetor[] = new double[TAM];

        System.out.println("Por Favor, insira 4 notas!");

        double soma = 0;

        for(int i=0; i<TAM; i++){
            System.out.println("Insira uma nota: ");
            vetor[i] = scan.nextDouble();

            soma += vetor[i];
        }


        for(int i=0; i<TAM; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nA media das notas é: " + (soma/TAM));
        
        scan.close();
    }
}
