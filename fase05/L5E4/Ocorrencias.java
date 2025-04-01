/*Descrição:
Desenvolva um programa que solicite ao usuário inserir 10 números inteiros em
um ArrayList<Integer>. Depois, peça ao usuário para digitar um número e informe
quantas vezes esse número aparece na lista.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop for para contar quantas vezes o número aparece na lista.
• Exibir a quantidade de ocorrências do número digitado pelo usuário.*/

package fase05.L5E3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ocorrencias {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.println("Digite um número: ");
            int num = scan.nextInt();

            numeros.add(num);
        }

        System.out.println("Qual numero deseja buscar?");
        int num = scan.nextInt();

        int qtd=0;
        for (int i : numeros) {
            if(i == num){
                qtd++;
            }
        }

        System.out.println("O numero " +num+ " aparece " +qtd+ " vezes");

        scan.close();
    }
}
