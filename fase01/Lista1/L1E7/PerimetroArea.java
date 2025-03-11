/*Faça um programa que solicite a base e a altura 
de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:
Área = base × altura
Perímetro = 2 × (base + altura). */

package fase01.Lista1.L1E7;

import java.util.Scanner;

public class PerimetroArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        float base = scan.nextFloat();

        System.out.print("Digite altura do retângulo: ");
        float altura = scan.nextFloat();

        float area = base*altura;
        float perimetro = 2*(base+altura);

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é : " + perimetro);
        scan.close();
    }
}