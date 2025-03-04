/*Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 
de dois pontos no plano cartesiano e calcule a distância entre eles.

Fórmula: 
D = sqrt((x2 - x1)² + (y2 - y1)²) 
*/

package fase01.L1E10;

import java.util.Scanner;

public class Distancia {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira os pontos X1 e Y1 respectivamente: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        System.out.print("Insira os pontos X2 e Y2 respectivamente: ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double distancia = Math.sqrt( (Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));

        System.out.print("A distância entre os dois pontos é: " + distancia);
        scan.close();
    }
}
