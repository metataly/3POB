/*Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: 
V = (4/3) * π * raio³.
Use π = 3.14159.*/

package fase01.L1E8;

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scan.nextDouble();

        double pi = 3.14159;

        double volume = Math.pow(raio, 3)*pi*(4.0/3);

        System.out.print("O volume da esfera é: " + volume);
        scan.close();
    }
}