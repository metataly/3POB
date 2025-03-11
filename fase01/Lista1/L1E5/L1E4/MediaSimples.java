/*Faça um programa que solicite ao usuário três notas (valores decimais)
 e exiba a média aritmética delas.*/

package fase01.Lista1.L1E5.L1E4;

import java.util.Scanner;

public class MediaSimples {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite as 3 notas: ");
        //pegando os tres dados de uma vez
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();

        float media = (nota1  + nota2 + nota3)/3;

        System.out.print("A média simples é: " + media);
        scan.close();
    }
    
}