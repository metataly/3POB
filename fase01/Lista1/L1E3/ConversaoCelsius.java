/*Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit. */

package fase01.Lista1.L1E3;

import java.util.Scanner;

public class ConversaoCelsius {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em ºC: ");
        float celsius = scan.nextFloat();

        float fahrenheit = (celsius * 9/5) + 32;

        System.out.print("A temperatura em fahrenheit: " + fahrenheit);
        scan.close();
    }
}