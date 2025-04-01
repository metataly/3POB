/*Crie um programa que permita ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Após a inserção, o programa deve exibir todos os números
digitados.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop while para permitir múltiplas inserções até o usuário
decidir parar.
• Exibir os números armazenados no ArrayList.*/
package fase05.L5E1;

import java.util.Scanner;
import java.util.ArrayList;

public class AddNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        int num = 0;

        System.out.println("\nDigite '0' para sair");
        while(true){

            System.out.println("Digite um numero inteiro: ");
            num = scan.nextInt();
            
            if(num==0){
                break;
            }

            numeros.add(num);
        }

        for (Integer i : numeros) {
            System.out.print(" " + i);
        }

        scan.close();
    }
}
