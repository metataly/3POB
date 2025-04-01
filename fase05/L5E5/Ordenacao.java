/*Descrição:
Crie um programa que solicite ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e
exiba a lista ordenada.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar Collections.sort() para ordenar os números.
• Exibir a lista ordenada após a ordenação.*/

package fase05.L5E5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.println("Digite um número: ");
            int num = scan.nextInt();

            numeros.add(num);
        }

        Collections.sort(numeros);

        for (int i : numeros) {

            System.out.print(" "+i);
        }
      
        scan.close();
    }
}
