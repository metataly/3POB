/*Desenvolva um programa que leia o raio de um círculo e calcule sua área.*/

package fase01.L1E2;

import java.util.Scanner;

public class AreaCirculo {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o raio do círculo: ");
        double raio = scan.nextDouble();

        double pi = 3.14159;
        double area = pi*(Math.pow(raio, 2));

        System.out.print("A soma dos valores: " + area);
        scan.close();
    }
}
