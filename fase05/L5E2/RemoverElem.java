/*Descrição:
Escreva um programa que solicite ao usuário inserir 5 nomes em um
ArrayList<String>. Em seguida, peça para o usuário informar um nome para ser
removido da lista. Exiba a lista após a remoção.
Requisitos:
• Criar um ArrayList<String> para armazenar os nomes.
• Utilizar remove() para excluir o nome informado.
• Se o nome não existir na lista, exibir uma mensagem informando.*/

package fase05.L5E2;

import java.util.Scanner;
import java.util.ArrayList;

public class RemoverElem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scan.next();
            nomes.add(nome);
        }

        System.out.print("Digite o numero da pessoa a ser excluida: ");
        int id = scan.nextInt();

        nomes.remove(id-1);

        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        scan.close();
    }
}
